package com.cevher.kafka.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {
    @KafkaListener(topics = "test", groupId = "ch_consumer_group")
    public void consume(String message) {
        log.info("Consumer Group : " + message);
    }
}
