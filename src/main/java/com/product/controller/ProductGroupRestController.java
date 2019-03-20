package com.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.product.model.ProductGroup;
import com.product.service.ProductGroupService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductGroupRestController {
	Logger logger = LoggerFactory.getLogger(ProductGroupRestController.class);

	@Autowired
	ProductGroupService productGroupService;
	
	@Autowired
	RestTemplate restTemplate ;
	
	private String uri = "http://localhost:8083/INGSuite/api/metric/updateCount/1";
	
	@GetMapping("/getProductGroups")
	public ResponseEntity<List<ProductGroup>> getProductGroups() {
		logger.info("getProductGroups===");
		List<ProductGroup> productGroups = productGroupService.getProductGroups();
		
		restTemplate.postForEntity(uri, null, Object.class);
		return new ResponseEntity<>(productGroups, HttpStatus.OK);
	}
	
}
