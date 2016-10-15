package org.pollux.microservice.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by spockwwang on 2016/10/13.
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApiGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZuulApiGatewayApplication.class, args);
  }

}
