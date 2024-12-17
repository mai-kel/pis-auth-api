package com.example.auth_api.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "users-events", groupId = "my-group")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Received message" + record.value());
    }
}
