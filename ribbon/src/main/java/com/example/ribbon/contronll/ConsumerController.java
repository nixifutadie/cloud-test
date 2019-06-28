package com.example.ribbon.contronll;

import com.example.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HelloService helloService;

    @GetMapping("/consumer")
    public String helloConsumer(){
       return helloService.helloService();
    }
}
