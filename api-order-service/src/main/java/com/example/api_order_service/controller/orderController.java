package com.example.api_order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/orders")
public class orderController {

    @GetMapping
    public String getOrders() {
        return "Hello World!";
    }
} 
