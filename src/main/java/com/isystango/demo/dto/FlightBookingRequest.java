package com.isystango.demo.dto;

import com.isystango.demo.model.PassengerInfo;
import com.isystango.demo.model.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {

	private PaymentInfo paymentInfo;
	private PassengerInfo passangerInfo;
}
