package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.model.ProductGroup;

public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long>{

}
