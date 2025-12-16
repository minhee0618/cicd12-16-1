package com.example.cicd12_16_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hicicd")
        public String hicicd() {
            return "hicicd 1216";
        }
}
