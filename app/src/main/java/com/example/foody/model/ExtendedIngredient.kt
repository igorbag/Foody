package com.example.foody.model


import com.google.gson.annotations.SerializedName

data class ExtendedIngredient(
    @SerializedName("amount")
    val amount: Double,
    @SerializedName("consistency")
    val consistency: String,
    @SerializedName("image")
    val image: String,
    val metaInformation: List<String>,
    @SerializedName("name")
    val name: String,
    @SerializedName("original")
    val nameClean: String,
    @SerializedName("unit")
    val unit: String
)