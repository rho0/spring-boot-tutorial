package com.demo.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
    }

    @GetMapping
    //Get 방시긍로 경로를 받는 매핑 어노테이션
    //value값을 별도로 지정하지 않으면 기본값인 빈값("")이 들어감
    public String HelloWorld() {
        return "Hello-Spring-Boot";
    }
}
