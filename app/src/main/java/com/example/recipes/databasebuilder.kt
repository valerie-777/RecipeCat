package com.example.recipes

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Recipe::class], version = 1, exportSchema = false)
abstract class  RecipeDB : RoomDatabase() {

    abstract fun  Dao(): Dao

    companion object {
        @Volatile
        private var INSTANCE: RecipeDatabase? = null

        fun getDatabase(context: Context): Any {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RoomDatabase::class.java,
                    "RecipeDatabase"
                ).build()

                INSTANCE = tempInstance
                return instance
            }
        }
    }
}