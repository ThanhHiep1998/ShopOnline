package com.project.shop_online.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @RequestMapping("/")
    public String home() {
        return "indexaa";
    }
}
