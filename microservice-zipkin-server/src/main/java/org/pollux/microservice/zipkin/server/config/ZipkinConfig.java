package org.pollux.microservice.zipkin.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by spockwwang on 2016/11/2.
 */
@Configuration
public class ZipkinConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

/*    @Bean
    public AlwaysSampler defaultAlwaysSampler(){
        return new AlwaysSampler();
    }*/
}
