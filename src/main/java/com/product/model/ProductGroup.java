package com.product.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter @Getter @NoArgsConstructor @ToString
public class ProductGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long productGroupId;

	@Column
	String productGroupName;

	@Column
	String productGroupDescription;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="product_group_id")
    List<Product> product;

	public ProductGroup(long productGroupId, String productGroupName, String productGroupDescription) {
		super();
		this.productGroupId = productGroupId;
		this.productGroupName = productGroupName;
		this.productGroupDescription = productGroupDescription;
	}

	
	
	
}
