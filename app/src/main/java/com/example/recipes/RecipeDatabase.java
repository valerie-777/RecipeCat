package com.example.recipes;

import androidx.room.Database;

@Database(entities = [RecipeEntity::class], version = 1)
abstract class RecipeDatabase : RoomDatabase() {
abstract fun recipeDao(): RecipeDao
        }
