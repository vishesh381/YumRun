package com.yumrun.service;

import java.util.List;

import com.yumrun.Exception.FoodException;
import com.yumrun.Exception.RestaurantException;
import com.yumrun.model.IngredientCategory;
import com.yumrun.model.IngredientsItem;
import com.yumrun.model.Food;
import com.yumrun.repository.IngredientsCategoryRepository;

public interface IngredientsService {
	
	public IngredientCategory createIngredientsCategory(
			String name,Long restaurantId) throws RestaurantException;

	public IngredientCategory findIngredientsCategoryById(Long id) throws Exception;

	public List<IngredientCategory> findIngredientsCategoryByRestaurantId(Long id) throws Exception;
	
	public List<IngredientsItem> findRestaurantsIngredients(
			Long restaurantId);

	
	public IngredientsItem createIngredientsItem(Long restaurantId, 
			String ingredientName,Long ingredientCategoryId) throws Exception;

	public IngredientsItem updateStoke(Long id) throws Exception;
	
}
