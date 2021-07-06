package com.cevher.kafka.sample;

import lombok.*;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IncomingData {
    private String message;
}

