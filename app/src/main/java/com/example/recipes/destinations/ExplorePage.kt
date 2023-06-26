package com.example.recipes.destinations

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.example.recipes.Recipe
import com.example.recipes.RecipeData

/**
 * Recipes Screen
 */

@Composable
fun ExplorePage(
    onRecipeClick: (String) -> Unit = {}
) {
    RecipeList(
        modifier = Modifier.semantics {
            contentDescription = "Recipes Screen"
        },
        recipes = RecipeData.recipeList,
        onRecipeClick = { recipe ->
            onRecipeClick(recipe.title)
        },
        recipeContent = { recipe ->
            RecipeCard(
                modifier = Modifier.clickable {
                    onRecipeClick(recipe.title)
                },
                title = recipe.title,
                type = recipe.mealType,
                servings = recipe.servingSize,
                ingredients = recipe.ingredients,
                steps = recipe.preparationSteps
            )
        }
    )
}

@Composable
fun RecipeList(
    modifier: Modifier = Modifier,
    recipes: List<Recipe>,
    onRecipeClick: (Recipe) -> Unit,
    recipeContent: @Composable (Recipe) -> Unit
) {
    LazyColumn(modifier) {
        itemsIndexed(recipes) { index, recipe ->
            recipeContent(recipe)
            if (index < recipes.size - 1) {
                Divider(
                    modifier = Modifier
                        .height(1.dp)
                        .padding(horizontal = 16.dp),
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.08f)
                )
            }
        }
    }
}

@Composable
fun RecipeCard(
    modifier: Modifier = Modifier,
    title: String,
    type: String,
    servings: Int,
    ingredients: List<String>,
    steps: List<String>
) {
    Column(modifier.clickable { /* Handle recipe click */ }) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Type: $type",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
        )
        Text(
            text = "Servings: $servings",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
        )
        Text(
            text = "Ingredients:",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
        )
        ingredients.forEach { ingredient ->
            Text(
                text = "- $ingredient",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(start = 32.dp, end = 16.dp, bottom = 4.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Steps:",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
        )
        steps.forEachIndexed { index, step ->
            Text(
                text = "${index + 1}. $step",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(start = 32.dp, end = 16.dp, bottom = 4.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}

