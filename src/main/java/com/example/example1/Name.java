package com.example.example1;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Embeddable
@Builder
@AllArgsConstructor
@Getter
@EqualsAndHashCode
class Name {
	private String first;
	private String middle;
	private String last;
	
	protected Name() {}
	
	public String toString() {
		return String.format("first: %s, middle: %s, last: %s", first, middle, last);
	}
}
