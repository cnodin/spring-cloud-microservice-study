package org.pollux.microservice.config.client.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by spockwwang on 2016/10/23.
 *
 * RefreshScope必须加上，否则即使执行/refresh，配置也不会改变
 */
@RestController
@RefreshScope
public class ConfigClientController {

  @Value("${profile}")
  private String profile;

  @GetMapping("/hello")
  public String hello(){
    return this.profile;
  }

}
