package com.abhishek.learning.jmsconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @JmsListener(destination = "jmstestqueue")
    public void consumeMessage(String message){
        System.out.println(message);
    }
}
