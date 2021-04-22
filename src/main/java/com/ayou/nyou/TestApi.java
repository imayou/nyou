package com.ayou.nyou;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestApi {
    @GetMapping("h")
    public String hello() {
        return "hello" + System.currentTimeMillis();
    }
}
