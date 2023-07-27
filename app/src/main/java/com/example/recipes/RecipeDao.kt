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


}
// Insert a new recipe into the database
val recipesToAdd = listOf(
    RecipeEntity(
        title = "Pizza Potato Skins",
        mealType = "snack",
        servingSize = 8,
        ingredients = "Ingredient 1, Ingredient 2, Ingredient 3",
        preparationSteps = "Step 1, Step 2, Step 3",
        recipeImageId = R.drawable.pizza_potato_skins
    ),
    RecipeEntity(
        title = "Chicken Alfredo Pasta",
        mealType = "dinner",
        servingSize = 4,
        ingredients = "Ingredient A, Ingredient B, Ingredient C",
        preparationSteps = "Step A, Step B, Step C",
        recipeImageId = R.drawable.chicken_alfredo_pasta
    ),
    // Add more recipes here...
)

val recipeDao = MyApp.database.recipeDao()
recipesToAdd.forEach { recipe ->
    recipeDao.insertRecipe(recipe)
}
