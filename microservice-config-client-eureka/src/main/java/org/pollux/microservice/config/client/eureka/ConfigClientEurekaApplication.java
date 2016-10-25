package org.pollux.microservice.config.client.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by spockwwang on 2016/10/23.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConfigClientEurekaApplication.class, args);
  }

}
