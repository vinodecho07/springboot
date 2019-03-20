package com.product.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter @Getter @NoArgsConstructor @ToString
public class ProductDetail implements Serializable{
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long productDetailId;
	
	@Column
	String rateOfInterest;
	
	@Column
	String precentageOfInterest;
	
	@Column
	String special;
	
	@Column
	String withdrawal;
	
	@Column
	int minimumInvestment;
	
	@Column
	int maximumInvestment;
	
	@Column
	String duration;
	
	@OneToOne
	Product product;

	public ProductDetail(long productDetailId, String rateOfInterest, String precentageOfInterest, String special,
			String withdrawal, int minimumInvestment, int maximumInvestment, String duration, Product product) {
		super();
		this.productDetailId = productDetailId;
		this.rateOfInterest = rateOfInterest;
		this.precentageOfInterest = precentageOfInterest;
		this.special = special;
		this.withdrawal = withdrawal;
		this.minimumInvestment = minimumInvestment;
		this.maximumInvestment = maximumInvestment;
		this.duration = duration;
		this.product = product;
	}
	

}
