package com.example.provider1.contronll;

import com.example.provider1.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloContronller {

    @Value("${database}")
    private String database;

    @GetMapping("/hello")
    public String hello(){
        return "hello1";
    }

    @GetMapping("/database")
    public String database(){
        return database;
    }


    /*@GetMapping("/hello1")
    public String hello(@RequestParam String name) {
        return "Hello provider1" + name;
    }

    @GetMapping("/hello2")
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        String namestr = "provider1"+name;
        return new User(namestr, age);
    }

    @PostMapping("/hello3")
    public String hello (@RequestBody User user) {
        return "Hello provider1"+ user. getName () + ", " + user. getAge ();
    }*/


    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    public String hello(@RequestParam("name") String name) {
        return "Hello provider1" + name;
    }

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    public @ResponseBody User hello(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        String namestr = "1"+name;
        return new User(namestr, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello (@RequestBody User user) {
        return "Hello provider1"+ user. getName () + ", " + user. getAge ();
    }

}
