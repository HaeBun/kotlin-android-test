package com.likelion.liontalk.data.remote.mqtt

import android.util.Log
import com.hivemq.client.mqtt.MqttClient
import com.hivemq.client.mqtt.datatypes.MqttTopic
import com.hivemq.client.mqtt.mqtt3.Mqtt3BlockingClient
import java.nio.charset.StandardCharsets
import java.util.UUID

// HiveMQ
object MqttClient {
    private val mqttClient : Mqtt3BlockingClient = MqttClient.builder()
        .useMqttVersion3() // mQtt 3.1.1
        .identifier("liontalk ${UUID.randomUUID()}")
        .serverHost("broker.hivemq.com")
        .serverPort(1883)
        .buildBlocking()

    // 연결 여부
    private var isConnected = false

    // 구동중인 토픽들
    private val subscribedTopics = mutableListOf<String>()


    fun connect(
        onConnected: (() -> Unit)? = null, onError: ((Throwable) -> Unit)? = null) {
        if (isConnected) {
            onConnected?.invoke()
            return
        }
        try {
            mqttClient.connect()
            isConnected = true
            Log.d("MQTT", "MQTT 연결 성공")
            onConnected?.invoke()
        } catch (e: Exception) {
            Log.d("MQTT", "MQTT 연결 실패")
            onError?.invoke(e)

        }
    }

    // 메시지 수신 시 호출될 외부 콜백 함수
    private var messageCallback: ((topic: String, message: String) -> Unit)? = null

    // 메시지 수신 콜백 등록 함수
    fun setOnMessageReceived(callback: (topic: String, message: String)-> Unit) {
        messageCallback = callback
    }

    fun subscribe(topic: String) {
        if(subscribedTopics.contains(topic)) {
            Log.d("MQTT", "이미 구독중: $topic")
            return
        }

        mqttClient.toAsync().subscribeWith()
            .topicFilter(topic)
            .callback { publish ->
                // 수신받은 메세지 처리 구간
                val receivedTopic = publish.topic.toString()
                val payloadBuffer = publish.payload.orElse(null)
                val message = payloadBuffer?.let { buffer ->
                    val readOnlybuffer = buffer.asReadOnlyBuffer()
                    val bytes = ByteArray(readOnlybuffer.remaining())
                    readOnlybuffer.get(bytes)
                    String(bytes , StandardCharsets.UTF_8)
                } ?: ""

                Log.d("MQTT", "수신: [$receivedTopic] $message")

                // 콜백 호출
                messageCallback?.invoke(receivedTopic,message)
            }
            .send()
        subscribedTopics.add(topic)
        Log.d("MQTT", "구독 시작: $topic")

    }

    // 토픽 구독 해제
    fun unsubscribe(topic: String) {
        if(!subscribedTopics.contains(topic)) {
            mqttClient.toAsync().unsubscribeWith()
                .topicFilter(topic)
                .send()

            subscribedTopics.remove(topic)
            Log.d("MQTT", "구독 해제: $topic")
            return
        }
    }

    // 전체 토픽 구독 해제
    fun unsubscribeAll() {
        subscribedTopics.forEach { topic ->
            mqttClient.toAsync().unsubscribeWith()
                .topicFilter(topic)
                .send()
        }
    }

    fun publish(topic: String, message: String) {
        if (!isConnected) {
            Log.e("MQTT", "MQTT가 연결되어 있지 않습니다.")
        }

        mqttClient.publishWith()
            .topic(topic)
            .payload(message.toByteArray(StandardCharsets.UTF_8))
            .send()
        Log.d("MQTT", "published : [$topic] $message")

    }

    fun disconnect() {
        if(isConnected) {
            mqttClient.disconnect()
            isConnected = false
            subscribedTopics.clear()
            Log.d("MQTT", "MQTT 연결 해제")
        }
    }

}