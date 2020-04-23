package com.example.example6;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity(name = "Product")
@Getter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
public class Product {

	@Id
	private Integer id;

	private String sku;

	@org.hibernate.annotations.Type( type = "nstring" )
	private String name;

	@org.hibernate.annotations.Type( type = "materialized_nclob" )
	private String description;
	
	protected Product() {}
}
