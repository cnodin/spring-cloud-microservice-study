package org.pollux.microservice.consumer.movie.ribbon.withhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by spockwwang on 2016/10/12.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class MovieRibbonHystrixApplication {

  public static void main(String[] args) {
    SpringApplication.run(MovieRibbonHystrixApplication.class, args);
  }
}
