package com.example.myfootballword;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.myfootballword.mapper")
public class MyFootballWordApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFootballWordApplication.class, args);
    }

}
