package org.pollux.microservice.consumer.movie.ribbon.service;

import org.pollux.microservice.consumer.movie.ribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by spockwwang on 2016/10/12.
 */
@Service
public class MovieRibbonService {

  @Autowired
  private RestTemplate restTemplate;

  private String microServiceUrl = "http://MICROSERVICE-PROVIDER-USERSERVICE/";

  public User findById(Long id){
    return restTemplate.getForObject(microServiceUrl + id, User.class);
  }

  public String add(){
    return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
  }

}
