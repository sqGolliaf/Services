package ru.ivanovds.services.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaConfig {

    @Bean
    fun taskTopic(): NewTopic =
        TopicBuilder.name("TutorialTopic")
            .partitions(1)
            .replicas(1)
            .build()

    @KafkaListener(topics = ["TutorialTopic"], groupId = "foo")
    fun listenGroupFoo(message: String) {
        println("Message 'TutorialTopic' in group foo: $message")
    }
}