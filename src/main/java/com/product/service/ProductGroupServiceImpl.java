package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.ProductGroup;
import com.product.repository.ProductGroupRepository;

@Service
public class ProductGroupServiceImpl implements ProductGroupService {

	@Autowired
	ProductGroupRepository productGroupRepository;
	
	public List<ProductGroup> getProductGroups() {
		return productGroupRepository.findAll();
	}
	
}
