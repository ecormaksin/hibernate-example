package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.example3.Product;
import com.example.example3.ProductRepository;

@SpringBootTest
class Example3Test {
	
	@Autowired
	ProductRepository repository;

	@Test
	void test() throws Exception {
		Product expected = Product.builder()
								.id(1)
								.sku("Sku")
								.name("Name")
								.description("Description")
								.build();
		repository.save(expected);
		
		Product actual = repository.findById(expected.getId()).orElse(null);
		assertEquals(expected, actual);
	}

}
