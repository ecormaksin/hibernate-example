package com.example.example4;

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

	private String name;

	private String description;
	
	protected Product() {}
}
