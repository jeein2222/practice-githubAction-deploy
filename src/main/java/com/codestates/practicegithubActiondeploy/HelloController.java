package com.codestates.practicegithubActiondeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello Jeein, Nice to meet you!!!!";
    }
}
