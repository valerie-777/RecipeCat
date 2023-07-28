package com.example.recipes

import androidx.room.Database
import androidx.room.RoomDatabase


class RecipeDatabase {
    @Database(entities = [RecipeEntity::class], version = 1)
abstract class RecipeDB : RoomDatabase() {
    abstract fun RecipeDao(): RecipeDao
}
}