package com.codan.kafkademo.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private  final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg){
        log.info(String.format("Sending msg to demo-topic:: %s", msg));
        kafkaTemplate.send("demo-topic", msg);
    }

}
