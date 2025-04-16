package com.example.jcowwk;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class Controller {

    @GetMapping("/test")
    public String test(@RequestParam String key1, @RequestParam String key2) {
        System.out.println("key1: " + key1);
        System.out.println("key2: " + key2);
        return "응답 성공! key1=" + key1 + ", key2=" + key2;
    }
}
