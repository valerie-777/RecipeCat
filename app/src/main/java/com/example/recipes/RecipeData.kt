package com.example.recipes

import com.example.recipes.R

object RecipeData {
    val recipeList: List<Recipe> = listOf(
        Recipe(
            id = 1,
            title = "Pizza Potato Skins",
            mealType = "snack",
            servingSize = 8,
            ingredients = listOf(
                "ced MushroCanola Oil\",\n" +
                        "                \"Kosher Salt\",\n" +
                        "                \"Butter, Melted\",\n" +
                        "                \"Diced Pepperoni\",\n" +
                        "                \"Minced Fresh Parsley\",\n" +
                        "                \"Grated Mozzarella Cheese\",\n" +
                        "                \"8 whole Small Russet Potatoes\",\n" +
                        "                \"Jarred Marinara Or Pizza Sauce\",\n" +
                        "                \"Miscellaneous Pizza Toppings: Cooked Sausage, Cooked Hamburger, Diced Bell Pepper, Diced Onion, Diced Canadian Bacon, Etc."
            ),
            preparationSteps = listOf(
                "Bake and cool russet potatoes.\n" +
                        "Scoop out flesh, brush with butter, and add sauce and toppings.\n" +
                        "Bake at 425°F (220°C) for 12-15 minutes.\n" +
                        "Garnish with parsley and serve as a tasty snack!"
            ),
            recipeImageId = R.drawable.pizza_potato_skins
        ),
        Recipe(
            id = 2,
            title = "Chicken and Broccoli Stir-Fry",
            mealType = "lunch",
            servingSize = 8,
            ingredients = listOf(
                "1 pound chicken breast (about 2 breasts), cubed",
                "3 scallions, whites only, thinly sliced on a bias",
                "2 tablespoons sugar",
                "1 tablespoon dark sesame oil",
                "1 tablespoon dry sherry",
                "1 tablespoon soy sauce",
                "2 cloves garlic, minced",
                "1-inch piece peeled fresh ginger, minced",
                "1 tablespoon, plus 1 teaspoon cornstarch",
                "Kosher salt and freshly ground black pepper",
                "About 1/3 cup water",
                "3 tablespoons vegetable oil",
                "5 to 6 cups broccoli florets and sliced stalks (keep the 2 cuts separate)",
                "3/4 to 1 teaspoon red chili flakes, optional",
                "1 tablespoon hoisin sauce",
                "Toasted sesame seeds, for serving, optional",
                "Jasmine rice, for serving, optional"
            ),
            preparationSteps = listOf(
                "In a medium bowl, toss the chicken with the scallion whites, sugar, sesame oil, sherry, soy sauce, about half the garlic, half the ginger, 1 teaspoon of the cornstarch and 1 teaspoon salt. Marinate at room temperature for 15 minutes. Mix the remaining 1 tablespoon cornstarch with 1/3 cup water in a small bowl and reserve.",
                "Heat a large nonstick skillet over high heat. Add 1 tablespoon of the vegetable oil and heat. Add the broccoli stems and stir-fry for 30 seconds. Add the florets and the remaining garlic and ginger, 2 tablespoons water, 1/4 teaspoon salt and some black pepper. Stir-fry until the broccoli is bright green but still crisp, about 2 minutes. Transfer to a plate.",
                "Get the skillet good and hot again, and then heat the remaining 2 tablespoons vegetable oil. Add the chicken and red pepper flakes if using. Stir-fry until the chicken loses its raw color and gets a little brown, about 3 minutes. " +
                        "Add the hoisin sauce, return the broccoli to the pan and toss to heat through. Stir in the reserved cornstarch mixture and bring to a boil to thicken. " +
                        "Add more water if need to thin the sauce, if necessary. Taste and season with salt and pepper, if you like.",
                "Mound the stir-fry on a serving platter or divide among 4 plates and garnish with sesame seeds; serve with rice." +
                        "\n\nCook’s Note \nThis simple weeknight stir-fry is comforting and satisfying. The broccoli stems are used to add textural contrast and also to help bulk up the dish, and why waste them?"
            ),
            recipeImageId = R.drawable.chicken_broccoli_stirrfry
        ),
        Recipe(
            id = 3,
            title = " Lemon Garlic Baked Salmon ",
            mealType = "lunch",
            servingSize = 8,
            ingredients = listOf(
                "4 salmon fillets\n" +
                        "2 lemons\n" +
                        "4 cloves of garlic, minced\n" +
                        "2 tablespoons olive oil\n" +
                        "Salt and pepper, to taste\n" +
                        "Fresh parsley, for garnish",
            ),
            preparationSteps = listOf(
                "Preheat the oven to 375°F (190°C) and line a baking sheet with parchment paper.\n" +
                        "Place the salmon fillets on the prepared baking sheet.\n" +
                        "Squeeze the juice of one lemon over the salmon.\n" +
                        "In a small bowl, combine the minced garlic, olive oil, salt, and pepper. Mix well.\n" +
                        "Spread the garlic mixture evenly over the salmon fillets.\n" +
                        "Slice the second lemon into rounds and place them on top of the salmon.\n" +
                        "Bake in the preheated oven for about 15-20 minutes or until the salmon is cooked through.\n" +
                        "Garnish with fresh parsley and serve."
            ),
            recipeImageId = R.drawable.lemon_garlic_baked_salmon
        ),
        Recipe(
            id = 5,
            title = "Chicken Stir-Fry",
            mealType = "lunch",
            servingSize = 4,
            ingredients = listOf("2 boneless, skinless chicken breasts, sliced into thin strips\n" +
                    "1 tablespoon vegetable oil\n" +
                    "1 bell pepper, thinly sliced\n" +
                    "1 onion, thinly sliced\n" +
                    "1 cup broccoli florets\n" +
                    "2 cloves of garlic, minced\n" +
                    "2 tablespoons soy sauce\n" +
                    "1 tablespoon oyster sauce (optional)\n" +
                    "Salt and pepper, to taste\n" +
                    "Cooked rice, for serving"),
            preparationSteps = listOf(
                "Heat the vegetable oil in a large skillet or wok over medium-high heat.\n" +
                        "Add the sliced chicken to the skillet and cook until browned and cooked through.\n" +
                        "Add the bell pepper, onion, broccoli, and minced garlic to the skillet. Stir-fry for a few minutes until the vegetables are tender-crisp.\n" +
                        "In a small bowl, whisk together the soy sauce and oyster sauce. Pour the sauce over the chicken and vegetables. Stir to coat evenly.\n" +
                        "Season with salt and pepper to taste.\n" +
                        "Serve the chicken stir-fry over cooked rice."
            ),
            recipeImageId = R.drawable.chicken_stirrfry
        ),
        Recipe(
            id = 10,
            title = "Caprese Salad ",
            mealType = "snack",
            servingSize = 8,
            ingredients = listOf(
                "2 large tomatoes\n" +
                        "8 ounces fresh mozzarella cheese\n" +
                        "Fresh basil leaves\n" +
                        "2 tablespoons extra virgin olive oil\n" +
                        "1 tablespoon balsamic vinegar\n" +
                        "Salt and pepper, to taste"
            ),
            preparationSteps = listOf(
                "Slice the tomatoes and fresh mozzarella cheese into 1/4-inch thick slices.\n" +
                        "Arrange the tomato and mozzarella slices on a serving platter, alternating between them.\n" +
                        "Tuck fresh basil leaves in between the tomato and mozzarella slices.\n" +
                        "Drizzle the olive oil and balsamic vinegar over the salad.\n" +
                        "Season with salt and pepper to taste.\n" +
                        "Serve the Caprese salad as a refreshing side dish or light lunch."
            ),
            recipeImageId = R.drawable.caprese_salad
        ),
        Recipe(
            id = 11,
            title = "Turkey Avocado Wrap",
            mealType = "snack",
            servingSize = 8,
            ingredients = listOf(
                "4 large tortilla wraps\n" +
                        "8 slices of deli turkey\n" +
                        "1 ripe avocado, sliced\n" +
                        "1/2 cup baby spinach leaves\n" +
                        "1/4 cup mayonnaise\n" +
                        "1 tablespoon Dijon mustard\n" +
                        "Salt and pepper, to taste"
            ),
            preparationSteps = listOf(
                "Lay out the tortilla wraps on a clean surface.\n" +
                        "In a small bowl, mix together the mayonnaise and Dijon mustard.\n" +
                        "Spread the mayo-mustard mixture evenly over each tortilla wrap.\n" +
                        "Layer two slices of deli turkey, avocado slices, and baby spinach leaves on each wrap.\n" +
                        "Season"
            ),
            recipeImageId = R.drawable.turkey_avocado_wrap
        ),
        Recipe(
            id = 12,
            title = "Baked Parmesan Zucchini Fries",
            mealType = "lunch",
            servingSize = 4,
            ingredients = listOf(
                "2 large zucchinis\n" +
                        "1/2 cup grated Parmesan cheese\n" +
                        "1/2 cup breadcrumbs\n" +
                        "1 teaspoon Italian seasoning\n" +
                        "1/2 teaspoon garlic powder\n" +
                        "2 eggs, beaten\n" +
                        "Salt and pepper, to taste\n" +
                        "Marinara sauce, for dipping (optional)"
            ),
            preparationSteps = listOf(
                "Preheat the oven to 425°F (220°C) and line a baking sheet with parchment paper.\n" +
                        "Cut the zucchinis into long, thin strips resembling fries.\n" +
                        "In a shallow dish, combine the grated Parmesan cheese, breadcrumbs, Italian seasoning, garlic powder, salt, and pepper.\n" +
                        "Dip each zucchini strip into the beaten eggs, allowing any excess to drip off, then coat it with the Parmesan breadcrumb mixture.\n" +
                        "Place the coated zucchini fries on the prepared baking sheet in a single layer.\n" +
                        "Bake for 15-20 minutes, or until the zucchini fries are golden brown and crisp.\n" +
                        "Serve with marinara sauce for dipping, if desired."
            ),
            recipeImageId = R.drawable.baked_parmesian_zuchini_fries
        ),
        Recipe(
            id = 15,
            title = "Beef and Broccoli Stir-Fry",
            mealType = "Supper",
            servingSize = 4,
            ingredients = listOf(
                "1 lb (450g) beef sirloin or flank steak, thinly sliced\n" +
                        "1/4 cup soy sauce\n" +
                        "2 tablespoons oyster sauce\n" +
                        "1 tablespoon cornstarch\n" +
                        "1 tablespoon vegetable oil\n" +
                        "3 cloves of garlic, minced\n" +
                        "1 teaspoon grated fresh ginger\n" +
                        "2 cups broccoli florets\n" +
                        "1/2 cup beef or vegetable broth\n" +
                        "Salt and pepper, to taste\n" +
                        "Cooked rice, for serving"
            ),
            preparationSteps = listOf(
                "In a bowl, whisk together the soy sauce, oyster sauce, and cornstarch until smooth. Set aside.\n" +
                        "Heat the vegetable oil in a large skillet or wok over medium-high heat.\n" +
                        "Add the minced garlic and grated ginger to the skillet and cook for about 1 minute, until fragrant.\n" +
                        "Add the thinly sliced beef to the skillet and stir-fry until browned and cooked through.\n" +
                        "Add the broccoli florets and beef or vegetable broth to the skillet. Stir-fry for a few minutes until the broccoli is tender-crisp.\n" +
                        "Pour the soy sauce mixture over the beef and broccoli. Stir well to coat everything evenly.\n" +
                        "Cook for an additional 2-3 minutes, or until the sauce has thickened.\n" +
                        "Season with salt and pepper to taste.\n" +
                        "Serve the beef and broccoli stir-fry over cooked rice."
            ),
            recipeImageId = R.drawable.beef_broccoli
        )
    )

    fun getRecipeTitles(): List<String> {
        return recipeList.map { it.title }
    }

    fun getRecipeByTitle(title: String): Recipe? {
        return recipeList.find { it.title == title }
    }
}