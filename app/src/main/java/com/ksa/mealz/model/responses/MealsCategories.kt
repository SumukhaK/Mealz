package com.ksa.mealz.model.responses


import com.google.gson.annotations.SerializedName

data class MealsCategories(
    @SerializedName("categories")
    val mealsCategories: List<MealCategory>
)