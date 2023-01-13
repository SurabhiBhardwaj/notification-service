package com.example.notification.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotifService {

    public String updateTheStatusNow(Long orderId) {
        log.info("NotifService -- updateTheStatusNow");
        return "Notified";
    }
}
