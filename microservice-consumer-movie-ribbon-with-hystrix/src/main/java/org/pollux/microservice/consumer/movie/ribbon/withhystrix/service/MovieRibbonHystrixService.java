package org.pollux.microservice.consumer.movie.ribbon.withhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.java.Log;
import org.pollux.microservice.consumer.movie.ribbon.withhystrix.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by spockwwang on 2016/10/12.
 */
@Service
@Log
public class MovieRibbonHystrixService {

  @Autowired
  private RestTemplate restTemplate;

  private String microServiceUrl = "http://MICROSERVICE-PROVIDER-USERSERVICE/";

  @HystrixCommand(fallbackMethod = "findByIdFailure")
  public User findById(Long id){
    return restTemplate.getForObject(microServiceUrl + id, User.class);
  }

  public User findByIdFailure(Long id){
    log.info("异常发生，进入failure方法，接收的参数：id=" + id);
    User user = new User();
    user.setId(-1L);
    user.setUsername("default username");
    user.setAge(0);
    return user;
  }

  public String add(){
    return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
  }

}
