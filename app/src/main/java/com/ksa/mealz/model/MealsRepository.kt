package com.ksa.mealz.model

import com.ksa.mealz.model.api.MealsWebService
import com.ksa.mealz.model.responses.MealsCategories

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    fun getMeals(): MealsCategories? {
        return webService.getMeals().execute().body() // Bad practice
    }
}