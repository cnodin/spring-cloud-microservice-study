package org.pollux.microservice.consumer.movie.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by spockwwang on 2016/10/13.
 */
@Configuration
public class MovieRibbonConfig {


  @LoadBalanced
  @Bean
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }

}
