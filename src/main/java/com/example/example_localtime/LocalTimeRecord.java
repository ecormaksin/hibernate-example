package com.example.example_localtime;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity(name = "LOCAL_TIME_RECORD")
@Getter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
public class LocalTimeRecord {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	@org.hibernate.annotations.Type( type = "LocalTime" )
	@Column(nullable = false)
	private LocalTime eventTime;

	protected LocalTimeRecord() {}
	
	public String toString() {
		return String.format("id: %d, eventTime: %s", id, eventTime.toString());
	}
}
