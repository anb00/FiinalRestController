package com.anb4jspring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wso2.msf4j.spring.transport.HTTPTransportConfig;
@Configuration
public class PortConfiguration {
    @Bean
    public HTTPTransportConfig http() {
        return new HTTPTransportConfig(8080);
    }
}
