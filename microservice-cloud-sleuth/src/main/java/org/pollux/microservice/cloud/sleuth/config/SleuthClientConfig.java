package org.pollux.microservice.cloud.sleuth.config;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by spockwwang on 2016/11/2.
 */
@Configuration
public class SleuthClientConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler defaultAlwaysSampler(){
        return new AlwaysSampler();
    }
}
