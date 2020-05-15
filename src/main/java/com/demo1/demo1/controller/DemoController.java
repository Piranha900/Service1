package com.demo1.demo1.controller;

import com.demo1.demo1.client.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @Autowired
    private DemoClient demoClient;


    @GetMapping("/ping")
    public @ResponseBody
    ResponseEntity<String> get() {
        return demoClient.getPong();
    }

}
