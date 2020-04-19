package com.example.example3;

import javax.persistence.Basic;
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
	@Basic
	private Integer id;

	@Basic
	private String sku;

	@Basic
	private String name;

	@Basic
	private String description;
	
	protected Product() {}
}
