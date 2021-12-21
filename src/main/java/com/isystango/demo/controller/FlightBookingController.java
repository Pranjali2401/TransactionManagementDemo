package com.isystango.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isystango.demo.dto.FlightBookingRequest;
import com.isystango.demo.service.FlightBookingService;

@RestController
@RequestMapping("/")
public class FlightBookingController {
	

	@Autowired
	private FlightBookingService flightBookingService;
	
	
	@GetMapping("/")
	public String getMessage() {
		return "Hello";
	}
	
	@PostMapping("/book")
	public String FlightBooking(@RequestBody FlightBookingRequest request) {
		
		return flightBookingService.bookFlightTicket(request);
//		return "";
		
	}
}
