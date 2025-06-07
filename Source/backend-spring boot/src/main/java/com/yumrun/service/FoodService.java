package com.yumrun.service;

import java.util.List;

import com.yumrun.Exception.FoodException;
import com.yumrun.Exception.RestaurantException;
import com.yumrun.model.Category;
import com.yumrun.model.Food;
import com.yumrun.model.Restaurant;
import com.yumrun.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
