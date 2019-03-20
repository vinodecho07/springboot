package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.service.ProductGroupService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductGroupRestController {

	@Autowired
	ProductGroupService productGroupService;
	
	@GetMapping("/getProductGroups")
	public void getProductGroups() {
		productGroupService.getProductGroups();
	}
	
}
