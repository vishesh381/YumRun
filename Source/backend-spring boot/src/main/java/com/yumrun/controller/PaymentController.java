package com.yumrun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stripe.exception.StripeException;
import com.yumrun.model.PaymentResponse;
import com.yumrun.service.PaymentService;

@RestController
@RequestMapping("/api")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
//	@PostMapping("/{orderId}/payment")
//	public ResponseEntity<PaymentResponse> generatePaymentLink(@PathVariable Long orderId) 
//			throws StripeException{
//		
//		PaymentResponse res = paymentService.generatePaymentLink(orderId);
//		
//		return new ResponseEntity<PaymentResponse>(res,HttpStatus.ACCEPTED);
//	}

}
