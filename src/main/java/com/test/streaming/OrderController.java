package com.test.streaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order")
    public ResponseEntity<String> createOrder(){
        String response = restTemplate.getForObject("http://localhost:8081/item",String.class);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

}
