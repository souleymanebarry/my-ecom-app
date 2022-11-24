package com.barry.sec.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ControllerAPI {


    @GetMapping("/dataTest")
    public Map<String, String> dataTest(){
        return Map.of("message", "Data test");
    }
}
