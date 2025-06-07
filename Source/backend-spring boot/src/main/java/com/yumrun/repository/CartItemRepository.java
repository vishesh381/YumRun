package com.yumrun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yumrun.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
