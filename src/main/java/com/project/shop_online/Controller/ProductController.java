package com.project.shop_online.Controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	 
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
}
