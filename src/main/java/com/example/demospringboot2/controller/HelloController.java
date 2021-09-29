package com.example.demospringboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author icy°w
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01() {
        return "hello,spring boot";
    }
}
