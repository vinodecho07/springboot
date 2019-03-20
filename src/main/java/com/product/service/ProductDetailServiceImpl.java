package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.ProductDetail;
import com.product.repository.ProductDetailRepository;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {
	
	@Autowired
	ProductDetailRepository productDetailRepository;

	@Override
	public ProductDetail getProductDetails(Long productId) {
		return productDetailRepository.findByProductProductId(productId);
	}



}
