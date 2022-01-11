package com.example.foody.data

import com.example.foody.data.network.FoodRecipesApi
import com.example.foody.model.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSources @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> =
        foodRecipesApi.getRecipes(queries)

}