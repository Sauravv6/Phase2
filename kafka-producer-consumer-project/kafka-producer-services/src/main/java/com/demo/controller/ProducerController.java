package com.demo.controller;


import org.springframework.web.bind.annotation.*;

import com.demo.service.ProducerService;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable String message) {
        return producerService.sendMessage(message);
    }
}
