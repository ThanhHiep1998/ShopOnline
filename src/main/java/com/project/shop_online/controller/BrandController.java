package com.project.shop_online.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {
    @RequestMapping("/a")
    public String home() {
        return "index";
    }
}
