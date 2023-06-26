package com.example.recipes

import java.io.Serializable

data class Recipe(
    val id: Long,
    val title: String,
    val mealType: String,
    val servingSize: Int,
    val ingredients: List<String>,
    val preparationSteps: List<String>,
    val recipeImageId: Int = 0
) : Serializable