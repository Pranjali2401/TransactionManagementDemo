package com.isystango.demo.utill;

import java.util.HashMap;
import java.util.Map;

import com.isystango.demo.exception.IncufficientAmountException;

public class PaymentUtills {

//	public static Map<String,Double> paymentMap = new HashMap<>();
//	{
//		paymentMap.put("acc1",10000.0);
//		paymentMap.put("acc2",11000.0);
//		paymentMap.put("acc3",20000.0);
//		paymentMap.put("acc4",15000.0);
//	}
//		18001021800
	
	public static boolean validateCreditLimit(String accNo, double paidAmount) {
		 Map<String,Double> paymentMap = new HashMap<>();
			
				paymentMap.put("acc1",10000.0);
				paymentMap.put("acc2",11000.0);
				paymentMap.put("acc3",20000.0);
				paymentMap.put("acc4",15000.0);
			
		System.out.println(accNo);
		System.out.println(paymentMap);
		
		
		if(paidAmount>paymentMap.get(accNo)) {
			throw new IncufficientAmountException("Insufficient Exception");
		}else {
			return true;
		}
	}
	
}
