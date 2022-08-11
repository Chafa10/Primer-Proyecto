package com.Prueba.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/DollarPricetype=dbn")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
