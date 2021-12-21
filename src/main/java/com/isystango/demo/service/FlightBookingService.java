package com.isystango.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isystango.demo.dao.PassangerDao;
import com.isystango.demo.dao.PaymentDao;
import com.isystango.demo.dto.FlightBookingRequest;
import com.isystango.demo.model.PassengerInfo;
import com.isystango.demo.model.PaymentInfo;
import com.isystango.demo.utill.PaymentUtills;

@Transactional
@Service
public class FlightBookingService {
	
	@Autowired
	private PaymentDao paymentDao;
	
	@Autowired
	private PassangerDao passangerDao;
	
	public String bookFlightTicket(FlightBookingRequest request) {
		

	PassengerInfo passangerInfo = passangerDao.save(request.getPassangerInfo());
	
	PaymentInfo paymentInfo = request.getPaymentInfo();
		
	PaymentUtills.validateCreditLimit(paymentInfo.getAccountNumber(), passangerInfo.getFare());
	
	paymentInfo.setPassangerId(passangerInfo.getPassangerId());
	paymentInfo.setAmount(passangerInfo.getFare());
	
	paymentDao.save(paymentInfo);
	
	
		return "Passanger added";
	}

}
