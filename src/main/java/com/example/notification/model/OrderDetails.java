package com.example.notification.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderDetails {

    private Long orderId;
    private String orderStatus;
    private Long userId;

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderId=" + orderId +
                ", orderStatus='" + orderStatus + '\'' +
                ", userId=" + userId +
                '}';
    }
}
