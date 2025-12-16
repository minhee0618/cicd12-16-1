package com.example.cicd12_16_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hicicd")
        public String hicicd() {
            return "hicicd 1216";
        }


    @GetMapping("/hicicd2")
    public String hicicd2() {
        return "NEW!!!!!!!! hicicd2 1216";
    }

    @GetMapping("/hicicd3")
    public String hicicd3() {
        return "NEW!!!!!!!! hicicd3 1216 안되는데 적용";
    }
}
