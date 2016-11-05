package org.pollux.microservice.cloud.sleuth;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;

/**
 * Created by spockwwang on 2016/10/31.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@Log
public class SleuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthServerApplication.class, args);
    }

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/bar")
    public String bar(){
        log.log(Level.INFO, "you called bar");
        return "the bar ";
    }

    @RequestMapping("/baz")
    public String baz(){
        log.log(Level.INFO, "you called baz");
        return "the baz";
    }

    @RequestMapping("/foo")
    public String foo(){
        log.log(Level.INFO, "you called foo");
        String result1 = restTemplate.getForObject("http://localhost:9511/bar", String.class);
        String result2 = restTemplate.getForObject("http://localhost:9511/baz", String.class);
        return result1 + result2;
    }

    @RequestMapping("/start")
    public String start(){
        log.log(Level.INFO, "you called start");
        return restTemplate.getForObject("http://localhost:9511/foo", String.class);
    }
}
