package br.com.tobiashcrz.demokafka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tobiashcrz.demokafka.producer.TopicProducer;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final TopicProducer topicProducer;

    @GetMapping(value = "/send")
    public void send() {
        topicProducer.send("Mensagem de teste enviada ao tópico");
    }
}