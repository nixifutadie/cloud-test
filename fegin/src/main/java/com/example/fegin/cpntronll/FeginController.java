package com.example.fegin.cpntronll;

import com.example.fegin.entity.User;
import com.example.fegin.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeginController {

    @Autowired
    private FeignService feignService;


    @GetMapping("/consumerdatabase")
    public String database(){
        return feignService.database();
    }

    @GetMapping("/consumer")
    public String helloConsumer(){
        return feignService.hello();
    }

    @GetMapping("/consumer2")
    public String helloConsumer2(){
        String r1 = feignService.hello("hjc");
        String r3 = feignService.hello(new User("hjc", 23));
        return r1 + "----" + r3;
    }

    @GetMapping("/consumer3")
    public @ResponseBody
    User helloConsumer3(){
        User hjc = feignService.hello("hjc", 23);
        return hjc;
    }


}
