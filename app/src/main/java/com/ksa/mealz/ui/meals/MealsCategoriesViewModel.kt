package com.ksa.mealz.ui.meals

import androidx.lifecycle.ViewModel
import com.ksa.mealz.model.MealsRepository
import com.ksa.mealz.model.responses.MealCategory

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()) :ViewModel() {
    //TODO lot of things

    fun getMeals():List<MealCategory>{
        return repository.getMeals()?.mealsCategories.orEmpty()
    }
}