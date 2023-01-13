package com.example.notification.service;

import com.example.notification.model.OrderDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import java.io.IOException;


@Slf4j
@Component
public class OrderConsumer {

    @Autowired
    NotificationService notificationService;

    @KafkaListener(topics = "final-topic", groupId = "group_one", containerFactory = "kafkaListenerContainerFactory")
    public void consumeUserMessage(@Payload OrderDetails msg, @Headers MessageHeaders headers) throws IOException {
        OrderDetails notifiedOrderDetails = notificationService.updateStatus(msg);
        log.info("OrderConsumer -- consumeUserMessage");
        log.info("received data in Consumer One = "+ msg.toString());
        log.info("received data in Consumer One = "+ notifiedOrderDetails.toString());
    }
}
