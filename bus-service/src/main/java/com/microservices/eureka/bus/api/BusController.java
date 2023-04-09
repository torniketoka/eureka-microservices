package com.microservices.eureka.bus.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "api/bus")
public class BusController {

    @GetMapping("/getBus")
    String getBus() {
        return "Minibus";
    }
}
