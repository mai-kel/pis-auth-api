package com.example.auth_api.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducer producer;

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return "Message send: " + message;
    }
}
