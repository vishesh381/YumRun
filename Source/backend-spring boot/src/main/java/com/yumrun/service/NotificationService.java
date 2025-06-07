package com.yumrun.service;

import java.util.List;

import com.yumrun.model.Notification;
import com.yumrun.model.Order;
import com.yumrun.model.Restaurant;
import com.yumrun.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
