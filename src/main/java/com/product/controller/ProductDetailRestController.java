package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.ProductDetail;
import com.product.service.ProductDetailService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductDetailRestController {

	@Autowired
	ProductDetailService productDetailService;

	@GetMapping("/getProductDetail/{productId}")
	public ResponseEntity<ProductDetail> getProductDetail(@PathVariable Long productId) {
		ProductDetail ProductDetail = productDetailService.getProductDetails(productId);
		return new ResponseEntity<>(ProductDetail, HttpStatus.OK);
	}



}