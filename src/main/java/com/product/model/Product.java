package com.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter @Getter @NoArgsConstructor @ToString
public class Product {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long productId;

	@Column
	String productName;

	@Column
	String productDescription;

	public Product(long productId, String productName, String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
	}



}
