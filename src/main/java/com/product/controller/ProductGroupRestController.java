package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.ProductGroup;
import com.product.service.ProductGroupService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductGroupRestController {

	@Autowired
	ProductGroupService productGroupService;
	
	@GetMapping("/getProductGroups")
	public ResponseEntity<List<ProductGroup>> getProductGroups() {
		List<ProductGroup> productGroups = productGroupService.getProductGroups();;
		return new ResponseEntity<>(productGroups, HttpStatus.OK);
	}
	
}
