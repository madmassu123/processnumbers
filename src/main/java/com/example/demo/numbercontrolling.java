package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


        @RestController
public class numbercontrolling {
@RequestMapping("/")
public String numbercontrolling(@RequestParam("number") int number) {
    String outPut = "";
    while (number > 1) {
        if (number % 2 == 0) {
            number = number / 2;
            outPut += number;
        } else {
            number = (number * 3)+1;
            outPut += number;
        }


    }
    return outPut;
}
}
