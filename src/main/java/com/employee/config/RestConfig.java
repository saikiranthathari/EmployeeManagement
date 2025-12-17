package com.employee.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    /**
     * Bean for RestTemplate to be used for making REST calls.
     *
     * @return a RestTemplate instance
     */
    // Enables load balancing for the RestTemplate
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
