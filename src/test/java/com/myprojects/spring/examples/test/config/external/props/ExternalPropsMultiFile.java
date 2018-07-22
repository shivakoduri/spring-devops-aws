package com.myprojects.spring.examples.test.config.external.props;

import com.myprojects.spring.examples.springdevopsaws.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({"classpath:testing.properties", "classpath:encrypted-testing.properties"})
public class ExternalPropsMultiFile {

    @Autowired
    Environment env;

    @Bean
    public FakeJmsBroker fakeJmsBrokerMulti(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUrl(env.getProperty("jms.server"));
        fakeJmsBroker.setPort(env.getRequiredProperty("jms.port", Integer.class));
        fakeJmsBroker.setUser(env.getProperty("jms.user"));
        fakeJmsBroker.setPassword(env.getProperty("jms.encrypted.password"));
        return fakeJmsBroker;
    }
}
