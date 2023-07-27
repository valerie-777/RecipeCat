package com.example.recipes;

import android.app.Application
import androidx.room.Room

class MyApp : Application() {
        companion object {
        lateinit var database: RecipeDatabase
        }

        override fun onCreate() {
        super.onCreate()
        // Initialize Room database
        database = Room.databaseBuilder(applicationContext, RecipeDatabase::class.java, "recipes_db")
        .build()
        }
        }


