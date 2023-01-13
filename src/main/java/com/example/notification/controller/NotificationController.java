package com.example.notification.controller;

import com.example.notification.service.NotifService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    NotifService notifService;


    @GetMapping("/orderId/{orderId}")
    public String getNotifiedStatus(@PathVariable Long orderId)
    {
        log.info("NotificationController -- getNotifiedStatus");
        return notifService.updateTheStatusNow(orderId);
    }
}
