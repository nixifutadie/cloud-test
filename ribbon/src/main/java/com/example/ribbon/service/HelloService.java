package com.example.ribbon.service;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallBack")
    public String helloService(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }

    public String fallBack(){
        String a = "error";
        return a;
    }
}
