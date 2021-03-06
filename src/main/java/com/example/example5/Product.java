package com.example.example5;

import javax.persistence.Column;
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

	@Column( name = "NOTES" )
	private String description;
	
	protected Product() {}
}
