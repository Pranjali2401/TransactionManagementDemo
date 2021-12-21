package com.isystango.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PASSANGER_INFO")
public class PassengerInfo {
	
	@Id
	@GeneratedValue
	private long passangerId;
	private String name;
	private int age;
	private double fare;
		
	
}
