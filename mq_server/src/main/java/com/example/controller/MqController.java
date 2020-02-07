package com.example.controller;

import com.alibaba.rocketmq.client.producer.SendResult;
import com.example.service.FeePlatMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqController {

    @Autowired
    private FeePlatMqService feePlatMqService;

    @RequestMapping("/mq/{msg}")
    public SendResult pushMQ(@PathVariable String msg){
        return feePlatMqService.openAccountMsg(msg);
    }

}
