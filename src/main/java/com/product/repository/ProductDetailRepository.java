package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.model.ProductDetail;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
	
	ProductDetail findByProductProductId(Long productId);

}
