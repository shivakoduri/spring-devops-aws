package com.myprojects.spring.examples.springdevopsaws.test.config;

import com.myprojects.spring.examples.springdevopsaws.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootJavaConfig {

    @Value("${jms.server}")
    String jmsServer;

    @Value("${jms.port}")
    Integer jmsPort;

    @Value("${jms.user}")
    String jmsUser;

    @Value("${jms.password}")
    String jmsPassword;

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUrl(jmsServer);
        fakeJmsBroker.setPort(jmsPort);
        fakeJmsBroker.setUser(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);
        return fakeJmsBroker;
    }

}
