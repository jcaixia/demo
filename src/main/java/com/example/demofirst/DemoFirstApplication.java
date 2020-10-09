package com.example.demofirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoFirstApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoFirstApplication.class, args);
    }


    @RequestMapping
    public String hello(){

        return "hello,这是我的第一个springboot项目";
    }
}

