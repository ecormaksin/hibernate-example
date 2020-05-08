package com.example.example_localtime;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class ExampleLocalTimeTest {

	@Autowired
	LocalTimeRepository repository;
	
	@Test
	void test() throws Exception {
		final LocalTimeRecord expected = LocalTimeRecord.builder()
										.eventTime(LocalTime.of(12, 34))
										.build();
		repository.save(expected);
		
		final LocalTimeRecord actual = repository.findById(expected.getId()).orElse(null);
		final LocalTime eventTime = actual.getEventTime();
		assertEquals(expected.getEventTime().toString(), eventTime.toString());
		System.out.println("★" + eventTime);
		System.out.println("★" + actual.toString());
	}

}
