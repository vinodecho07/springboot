package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.repository.ProductGroupRepository;

@Service
public class ProductGroupServiceImpl implements ProductGroupService {

	@Autowired
	ProductGroupRepository productGroupRepository;
	
	public void getProductGroups() {
		productGroupRepository.findAll();
	}
	
}
