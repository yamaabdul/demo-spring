package com.example.setrack.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/test")
    public String test(){
    return "test Hello world !";
    }
    @RequestMapping("/calculate")
    public int calculation(){
        int input = 8;
        int intput2 = 9;
        return input*intput2;
    }
    @RequestMapping("/concat")
    public void concat(){
        test();
        calculation();
        System.out.println("Hallo " +test() +" " +         calculation() );
    }
}
