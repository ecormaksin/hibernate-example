package com.example.example1;

import java.net.URL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity(name = "Contact")
@Getter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
public class Contact {

	@Id
	private Integer id;
	
	private Name name;
	
	private String notes;
	
	private URL website;
	
	@Column(nullable = false)
	private boolean starred;
	
	protected Contact() {}
	
	public String toString() {
		return String.format("id: %s, name: {%s}, notes: %s, website: %s, starred: %b"
				, id, name.toString(), notes, website.toString(), starred);
	}
}
