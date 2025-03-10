package com.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.producer.ProducerService;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final ProducerService producerService;

    public KafkaController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/send")
    public String sendMessages() {
        producerService.sendMessages();
        return "100 messages sent to Kafka!";
    }
}
