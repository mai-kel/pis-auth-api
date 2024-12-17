package com.example.auth_api.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class KafkaProducer {

    private static final String TOPIC = "users-events";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
        kafkaTemplate.send(TOPIC, message);
    }
}
