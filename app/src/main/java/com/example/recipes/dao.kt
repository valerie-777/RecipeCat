package com.example.recipes

import android.content.Entity
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RecipeDao {
    @Insert
    fun insertRecipe(recipe:Entity): Long

    @Query("SELECT * FROM recipes")
    fun getAllRecipes(): List<Entity>

    @Query("DELETE FROM  recipes")
    fun clearAllRecipes()

}
