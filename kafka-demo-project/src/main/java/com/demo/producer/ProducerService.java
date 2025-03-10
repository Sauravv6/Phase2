package com.demo.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private static final String TOPIC = "test-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessages() {
        for (int i = 0; i < 100; i++) {  // Sending 100 messages
            String key = "key-" + i;
            String value = "value-" + i;
            kafkaTemplate.send(TOPIC, key, value);
            System.out.println("Sent: " + key + " -> " + value);
        }
    }
}
