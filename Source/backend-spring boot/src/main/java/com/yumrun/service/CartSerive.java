package com.yumrun.service;

import com.yumrun.Exception.CartException;
import com.yumrun.Exception.CartItemException;
import com.yumrun.Exception.FoodException;
import com.yumrun.Exception.UserException;
import com.yumrun.model.Cart;
import com.yumrun.model.CartItem;
import com.yumrun.model.Food;
import com.yumrun.model.User;
import com.yumrun.request.AddCartItemRequest;
import com.yumrun.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
