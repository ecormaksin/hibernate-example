package com.example.example1;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class Example1Test {
	
	@Autowired
	ContactRepository repository;

	@Test
	void testSimpleTableAndDomainModel() throws Exception {
		Name name = Name.builder()
						.first("FirstName")
						.middle("MiddleName")
						.last("LastName")
						.build();
		Contact expected = Contact.builder()
								.id(1)
								.name(name)
								.notes("Notes about contact")
								.website(new URL("http://example.com"))
								.build();
		
		repository.save(expected);
		Contact actual = repository.findById(expected.getId()).orElse(null);
		assertEquals(expected, actual);
	}

}
