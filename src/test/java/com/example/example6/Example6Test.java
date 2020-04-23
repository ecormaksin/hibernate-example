package com.example.example6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class Example6Test {
	
	@Autowired
	ProductUsingExplicitBasicTypesRepository repository;

	@Test
	void testUsingExplicitBasicTypes() throws Exception {
		Product expected = Product.builder()
								.id(1)
								.sku("Sku")
								.name("名前")
								.description("Description")
								.build();
		repository.save(expected);
		
		Product actual = repository.findById(expected.getId()).orElse(null);
		assertEquals(expected, actual);
	}

}
