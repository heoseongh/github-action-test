package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello () {
        return "hello";
    }

    @GetMapping("/kimminseon")
    public String minsunny () {
        return "<h1>김민선 = 쿼카</h1>" +
                "<img src='https://cdn.newspenguin.com/news/photo/201912/877_1419_234.jpg'>"
                ;
    }

    @GetMapping("/hyeyeong")
    public String sorryHyeyeong () {
      return "<h1>미안해 혜영아!!! ㅜㅜ</h1>";
    }
}
