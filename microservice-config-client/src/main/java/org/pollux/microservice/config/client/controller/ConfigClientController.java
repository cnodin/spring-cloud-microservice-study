package org.pollux.microservice.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by spockwwang on 2016/10/22.
 */
@RestController
public class ConfigClientController {

  @Value("${profile}")
  private String profile;

  @GetMapping("/hello")
  public String hello(){
    return this.profile;
  }


}
