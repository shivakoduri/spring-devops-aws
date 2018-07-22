package com.myprojects.spring.examples.springdevopsaws.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JMSConfig {

    public static final String textMsgQueue = "text.messagequeue";

    @Bean
    public ActiveMQQueue textMessageQueue(){
        return new ActiveMQQueue(textMsgQueue);
    }
}
