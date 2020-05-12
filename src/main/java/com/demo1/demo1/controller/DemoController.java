package com.demo1.demo1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Value("${myPort}")
    private String connectingPort;

    @GetMapping("/ping")
    public @ResponseBody
    ResponseEntity<String> get() {

        String URL = "http://localhost:"+connectingPort + "/pong";
        String OBJ = new RestTemplate().getForObject(URL, String.class);
        return new ResponseEntity<String>(OBJ, HttpStatus.OK);
    }

}
