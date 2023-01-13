package com.example.notification.service;

import com.example.notification.model.OrderDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NotificationService {
    public OrderDetails updateStatus(OrderDetails orderDetails) {
        log.info("NotificationService -- updateStatus");
        OrderDetails notifiedOrderDetails = new OrderDetails().builder()
                .orderId(orderDetails.getOrderId())
                .orderStatus("Notified")
                .userId(orderDetails.getOrderId())
                .build();
        return notifiedOrderDetails;
    }
}