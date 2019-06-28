package com.example.fegin.service;

import com.example.fegin.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "hello-service",fallback = FeignFallBack.class)
public interface FeignService {

    @GetMapping("/hello")
    String hello();

    @GetMapping("/database")
    String database();


    /*@GetMapping(value = "/hello1")
    String hello(@RequestParam("name") String name) ;

    @GetMapping(value = "/hello2")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @PostMapping(value = "/hello3")
    String hello(@RequestBody User user);*/

    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    String hello(@RequestParam("name") String name) ;

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    @ResponseBody User hello(@RequestParam("name") String name, @RequestParam("age") Integer age);

    @RequestMapping(value = "/hello3", method= RequestMethod.POST)
    String hello(@RequestBody User user);
}
