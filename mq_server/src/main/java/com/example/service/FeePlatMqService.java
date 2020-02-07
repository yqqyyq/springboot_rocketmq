package com.example.service;

import com.alibaba.rocketmq.client.producer.SendResult;

public interface FeePlatMqService {

    SendResult openAccountMsg(String msgInfo);
}
