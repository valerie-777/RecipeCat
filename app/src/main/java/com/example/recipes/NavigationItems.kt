package com.example.recipes

sealed class NavigationItems(var route: String, val icon: Int, var title: String) {
    object Home: NavigationItems("welcome_page", R.drawable.table_restaurant, "Explore")
    object Recipes: NavigationItems("explore_page", R.drawable.restaurant_menu, "Details")
    // object Details: NavigationItems("details_page", R.drawable.menu_book, "Details")
}