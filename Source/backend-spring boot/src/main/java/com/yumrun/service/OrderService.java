package com.yumrun.service;

import java.util.List;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.yumrun.Exception.CartException;
import com.yumrun.Exception.OrderException;
import com.yumrun.Exception.RestaurantException;
import com.yumrun.Exception.UserException;
import com.yumrun.model.Order;
import com.yumrun.model.PaymentResponse;
import com.yumrun.model.User;
import com.yumrun.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException, RazorpayException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
