package com.example.foody

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.foody.Constants.Companion.RECIPES_TABLE
import com.example.foody.model.FoodRecipe

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

}