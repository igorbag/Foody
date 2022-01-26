package com.example.foody

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.foody.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

}