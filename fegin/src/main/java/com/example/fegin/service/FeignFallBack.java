package com.example.fegin.service;

import com.example.fegin.entity.User;
import org.springframework.stereotype.Component;

@Component
public class FeignFallBack implements FeignService{

    @Override
    public String database() {
        return "error";
    }

    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User();
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
