package com.yumrun.service;

import com.razorpay.PaymentLink;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.yumrun.model.Order;
import com.yumrun.model.PaymentResponse;
import com.yumrun.model.User;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;
	PaymentResponse createRazorpayPaymentLink(Order order) throws RazorpayException;
}