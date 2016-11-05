package org.pollux.microservice.zipkin.server;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import zipkin.server.EnableZipkinServer;

import java.util.logging.Level;

/**
 * Created by spockwwang on 2016/10/31.
 */
@SpringBootApplication
@EnableZipkinServer
@EnableDiscoveryClient
@RestController
@Log
public class ZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }

}
