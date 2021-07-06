package com.cevher.kafka.sample;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class KafkaResource {
    private final Producer producer;

    @PostMapping("/publish")
    public void publishMessage(@RequestParam("message") String message) {
        log.debug("Message send Producer by Controller");
        producer.produce(message);
    }
}
