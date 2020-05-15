package com.demo1.demo1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("${client.name}")
public interface DemoClient {
    @GetMapping("/pong")
    ResponseEntity<String> getPong();
}
