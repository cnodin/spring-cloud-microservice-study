package org.pollux.microservice.consumer.movie.ribbon.withhystrix.controller;

import org.pollux.microservice.consumer.movie.ribbon.withhystrix.entity.User;
import org.pollux.microservice.consumer.movie.ribbon.withhystrix.service.MovieRibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by spockwwang on 2016/10/12.
 */
@RestController
public class MovieRibbonController {

  @Autowired
  private MovieRibbonHystrixService ribbonService;

  @GetMapping("/ribbon/{id}")
  public User findById(@PathVariable Long id){
    return ribbonService.findById(id);
  }

  @GetMapping("/add")
  public String add(){
    return ribbonService.add();
  }
}
