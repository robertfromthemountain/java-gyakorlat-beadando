package com.example.gyakorlatibeadando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class GyakorlatiBeadandoApplication {

    public static void main(String[] args) {

        SpringApplication.run(GyakorlatiBeadandoApplication.class, args);
    }

    @GetMapping("/feladat1a")
    @ResponseBody
    public String kiir1() {
        return "<h1>Hello Wrold</h1>";
    }

    @GetMapping("/feladat1b")
    @ResponseBody
    public String kiir1b(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);


    }
}
