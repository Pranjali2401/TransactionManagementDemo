package com.isystango.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "PAYMENT_INFO")
public class PaymentInfo {
	
	@Id
	@GeneratedValue
	private long paymentId;
	private String accountNumber;
	private  double amount;
	private long passangerId;
	

}
