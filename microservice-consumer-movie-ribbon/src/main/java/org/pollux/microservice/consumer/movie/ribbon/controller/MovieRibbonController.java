package org.pollux.microservice.consumer.movie.ribbon.controller;

import org.pollux.microservice.consumer.movie.ribbon.entity.User;
import org.pollux.microservice.consumer.movie.ribbon.service.MovieRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by spockwwang on 2016/10/12.
 */
@RestController
public class MovieRibbonController {

  @Autowired
  private MovieRibbonService ribbonService;

  //@GetMapping("/ribbon/{id}")
  @RequestMapping(value="/ribbon/{id}", method = RequestMethod.GET)
  public User findById(@PathVariable Long id){
    return ribbonService.findById(id);
  }

  @RequestMapping(value="/add", method = RequestMethod.GET)
  public String add(){
    return ribbonService.add();
  }
}
