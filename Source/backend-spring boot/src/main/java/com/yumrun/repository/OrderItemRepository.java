package com.yumrun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yumrun.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
