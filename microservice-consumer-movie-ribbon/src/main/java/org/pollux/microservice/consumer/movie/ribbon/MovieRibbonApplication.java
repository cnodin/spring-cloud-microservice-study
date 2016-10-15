package org.pollux.microservice.consumer.movie.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by spockwwang on 2016/10/12.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MovieRibbonApplication {

  public static void main(String[] args) {
    SpringApplication.run(MovieRibbonApplication.class, args);
  }
}
