package com.example.auth_api.kafka;

import com.example.auth_api.entities.User;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
//    @KafkaListener(topics = "users-events", groupId = "my-group")
//    public void consume(User user) {
//        LOGGER.info(String.format("Message received -> %s", user.toString()));
//    }
    @KafkaListener(topics = "books-events", groupId = "my-group")
    public void consume(Object message){
        LOGGER.info(String.format("Message received from topic -> %s", message.toString()));
    }
}
