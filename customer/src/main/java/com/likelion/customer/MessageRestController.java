package com.likelion.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {

    @Autowired
    MessageConfig messageConfig;

    @RequestMapping("/message")
    String getMessage() {
        return messageConfig.getServiceName();
    }
}