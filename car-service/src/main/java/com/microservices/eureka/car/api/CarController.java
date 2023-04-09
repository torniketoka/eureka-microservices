package com.microservices.eureka.car.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "api/car")
public class CarController {

    @GetMapping("/getCar")
    String getCar() {
        return "Mercedes";
    }
}
