package com.example.recipes

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "recipes")
data class RecipeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val mealType: String,
    val servingSize: Int,
    val ingredients: String,
    val preparationSteps: String,
    val recipeImageId: Int )