package org.sparta.spring240519.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 클래스는 REST API 처리하는 Controller
@RequestMapping("/api") // RequestMapping URI를 지정해주는 어노테이션
public class ApiController {

    @GetMapping("/hello") // http://localhost:9090/api/hello
    public String hello() {
        return "Hello Spring boot";
    }

}
