package com.example.example3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class Example3Test {
	
	@Autowired
	ProductWithBasicAnnotationRepository repository;

	@Test
	void testBasicAnnotationDeclaredExplicitly() throws Exception {
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
