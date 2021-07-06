package com.cevher.kafka.sample;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class Producer {
    private static final String KAFKA_TOPIC = "test";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void produce(String message) {
        kafkaTemplate.send(KAFKA_TOPIC, message);
    }

}
