package org.pollux.microservice.user.controller;

import lombok.Getter;
import lombok.Setter;
import org.pollux.microservice.user.dao.UserRepository;
import org.pollux.microservice.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by spockwwang on 2016/10/12.
 */
@RestController
@Getter
@Setter
public class UserController {

  @Autowired
  private DiscoveryClient discoveryClient;

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/{id}")
  public User findById(@PathVariable Long id){
    User user = userRepository.findOne(id);
    return user;
  }

  @GetMapping("/instance-info")
  public ServiceInstance showInfo(){
    ServiceInstance localServiceInstance = discoveryClient.getLocalServiceInstance();
    return localServiceInstance;
  }

}
