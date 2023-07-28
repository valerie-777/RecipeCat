package com.example.recipes

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RecipeDao {
    @Insert
    fun insertRecipe(recipe: RecipeEntity): Long

    @Query("SELECT * FROM recipes")
    fun getAllRecipes(): List<RecipeEntity>

    @Query("DELETE FROM  recipes")
    fun clearAllRecipes()

}
