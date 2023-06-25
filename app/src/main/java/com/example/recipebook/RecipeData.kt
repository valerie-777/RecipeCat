package com.example.recipebook

object RecipeData {
    val recipeList: List<Recipe> = listOf(
        Recipe(
            id = 1,
            title = "Braised Chicken Thighs and Apples",
            mealType = "Lunch",
            servingSize = 4,
            difficultyLevel = "Beginner",
            ingredients = listOf(
                "8 bone-in chicken thighs (2 to 2 1/2 pounds)",
                "Kosher salt and freshly ground black pepper",
                "2 tablespoons vegetable oil",
                "2 teaspoons fresh thyme leaves",
                "1 bunch leeks (white and green parts), halved lengthwise and sliced",
                "1/4 cup dry white wine",
                "1 cup low-sodium chicken broth",
                "1/2 cup apple cider",
                "2 tablespoons unsalted butter, at room temperature",
                "2 tablespoons all-purpose flour",
                "2 apples, such as Golden Delicious, chopped"
            ),
            preparationSteps = listOf(
                "Preheat the oven to 425 degree F. Sprinkle the chicken generously with salt and pepper. Heat the oil in a large, deep ovenproof skillet over medium-high heat. " +
                        "Place the chicken in the skillet skin-side down and cook, flipping once, until golden on both sides. Transfer to a plate. ",
                "Reduce the heat to medium, add the thyme and leeks to the skillet and cook, stirring occasionally, until softened, about 4 minutes. " +
                        "Pour in the wine and use a wooden spoon to scrape up any browned bits from the bottom. Cook until the skillet is nearly dry. Stir in the broth, apple cider and a pinch each of salt and pepper and bring to a boil. ",
                "Use a fork to mash the butter and flour together in a small bowl until smooth. Whisk the butter-flour mixture into the skillet until dissolved. Stir in the apples and remove from the heat. " +
                        "Nestle the chicken skin-side up in the skillet along with any collected juices from the plate. Bake until the chicken is cooked through, about 25 minutes."
            ),
            recipeImageId = R.drawable.braised_chicken_thighs_and_apples
        ),
        Recipe(
            id = 2,
            title = "Chicken and Broccoli Stir-Fry",
            mealType = "Dinner",
            servingSize = 4,
            difficultyLevel = "Intermediate",
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
            recipeImageId = R.drawable.chicken_thighs_with_creamy_mustard_sauce
        ),
        Recipe(
            id = 3,
            title = "Chicken Scampi Pasta",
            mealType = "Dinner",
            servingSize = 6,
            difficultyLevel = "Intermediate",
            ingredients = listOf(
                "Kosher salt",
                "1 pound thinly-sliced chicken cutlets, cut into 1/2-inch-thick strips",
                "3 tablespoons olive oil",
                "8 tablespoons unsalted butter, cubed",
                "6 cloves garlic, sliced",
                "1/2 teaspoon crushed red pepper flakes",
                "1/2 cup dry white wine",
                "12 ounces angel hair pasta",
                "1 teaspoon lemon zest plus the juice of 1 large lemon",
                "1/2 cup freshly grated Parmesan",
                "1/2 cup chopped fresh Italian parsley",
            ),
            preparationSteps = listOf(
                "Bring a large pot of salted water to a boil for the pasta. Sprinkle the chicken with some salt. Heat a large skillet over medium-high heat until hot, then add the oil. Working in 2 batches, brown the chicken until golden but not cooked through, 2 to 3 minutes per batch. Remove the chicken to a plate.",
                "Melt 4 tablespoons of the butter in the skillet. Add the garlic and red pepper flakes and cook until the garlic just begins to turn golden at the edges, 30 seconds to 1 minute. Add the wine, bring to a simmer and cook until reduced by half, about 2 minutes. Remove from the heat.",
                "Meanwhile, cook the pasta until very al dente, reserving 1 cup of the pasta water. " +
                        "Add the pasta and 3/4 cup pasta water to the skillet along with the chicken, lemon zest and juice and the remaining 4 tablespoons butter. " +
                        "Return the skillet to medium-low heat and gently stir the pasta until the butter is melted, adding the remaining 1/4 pasta water if the pasta seems too dry. " +
                        "Remove the skillet from the heat, sprinkle with the grated cheese and parsley and toss before serving."
            ),
            recipeImageId = R.drawable.chicken_scampi_pasta
        ),
        Recipe(
            id = 5,
            title = "Chocolate Lava Cake",
            mealType = "Dinner",
            servingSize = 4,
            difficultyLevel = "Intermediate",
            ingredients = listOf("Butter for greasing", "1 loaf crusty sourdough or French bread", "8 whole eggs",
                "2 cups whole milk", "1/2 cup whipping (heavy) cream", "1/2 cup granulated sugar", "1/2 cup brown sugar",
                "2 tablespoons vanilla extract"),
            preparationSteps = listOf(
                "For the French toast: Grease the baking pan with butter. Tear the bread into chunks, or cut into cubes, and evenly distribute in the pan. Crack the eggs in a big bowl. Whisk together the eggs, milk, cream, granulated sugar, brown sugar and vanilla. " +
                        "Pour evenly over the bread. Cover the pan tightly and store in the fridge until needed (overnight preferably).",
                "For the topping: Mix the flour, brown sugar, cinnamon, salt and some nutmeg in a separate bowl. Stir together using a fork. Add the butter and with a pastry cutter, and mix it all together until the mixture resembles fine pebbles. Store in a re-sealable plastic bag in the fridge. ",
                "When you're ready to bake the casserole, preheat the oven to 350 degrees F. Remove the casserole from the fridge and sprinkle the topping over the top. Bake for 45 minutes for a softer, more bread pudding texture or for 1 hour or more for a firmer, crisper texture. ",
                "Scoop out individual portions. Top with butter and drizzle with warm pancake syrup and sprinkle with blueberries."
            ),
            recipeImageId = R.drawable.cinnamon_baked_french_toast
        ),
        Recipe(
            id = 10,
            title = "Perfect Roast Chicken",
            mealType = "Lunch",
            servingSize = 8,
            difficultyLevel = "Advanced",
            ingredients = listOf(
                "1 (5 to 6 pound) roasting chicken",
                "Kosher salt",
                "Freshly ground black pepper",
                "1 large bunch fresh thyme, plus 20 sprigs",
                "1 lemon, halved",
                "1 head garlic, cut in half crosswise",
                "2 tablespoons (1/4 stick) butter, melted",
                "1 large yellow onion, thickly sliced",
                "4 carrots cut into 2-inch chunks",
                "1 bulb of fennel, tops removed, and cut into wedges",
                "Olive oil"
            ),
            preparationSteps = listOf(
                "Preheat the oven to 425 degrees F.",
                "Remove the chicken giblets. Rinse the chicken inside and out. Remove any excess fat and leftover pin feathers and pat the outside dry. Liberally salt and pepper the inside of the chicken. " +
                        "Stuff the cavity with the bunch of thyme, both halves of lemon, and all the garlic. Brush the outside of the chicken with the butter and sprinkle again with salt and pepper. " +
                        "Tie the legs together with kitchen string and tuck the wing tips under the body of the chicken. Place the onions, carrots, and fennel in a roasting pan. Toss with salt, pepper, 20 sprigs of thyme, and olive oil. Spread around the bottom of the roasting pan and place the chicken on top. ",
                "Roast the chicken for 1 1/2 hours, or until the juices run clear when you cut between a leg and thigh. Remove the chicken and vegetables to a platter and cover with aluminum foil for about 20 minutes. Slice the chicken onto a platter and serve it with the vegetables."
            ),
            recipeImageId = R.drawable.perfect_roast_chicken
        ),
        Recipe(
            id = 11,
            title = "Perfect Roast Turkey",
            mealType = "Lunch",
            servingSize = 8,
            difficultyLevel = "Advanced",
            ingredients = listOf(
                "1/4 pound (1 stick) unsalted butter",
                "1 lemon, zested and juiced",
                "1 teaspoon chopped fresh thyme leaves",
                "1 fresh turkey (10 to 12 pounds)",
                "Kosher salt",
                "Freshly ground black pepper",
                "1 large bunch fresh thyme",
                "1 whole lemon, halved",
                "1 Spanish onion, quartered",
                "1 head garlic, halved crosswise"
            ),
            preparationSteps = listOf(
                "Preheat the oven to 350 degrees F.",
                "Melt the butter in a small saucepan. Add the zest and juice of the lemon and 1 teaspoon of thyme leaves to the butter mixture. Set aside.",
                "Take the giblets out of the turkey and wash the turkey inside and out. Remove any excess fat and leftover pinfeathers and pat the outside dry. " +
                        "Place the turkey in a large roasting pan. Liberally salt and pepper the inside of the turkey cavity. " +
                        "Stuff the cavity with the bunch of thyme, halved lemon, quartered onion, and the garlic. " +
                        "Brush the outside of the turkey with the butter mixture and sprinkle with salt and pepper. Tie the legs together with string and tuck the wing tips under the body of the turkey.",
                "Roast the turkey about 2 1/2 hours, or until the juices run clear when you cut between the leg and the thigh. Remove the turkey to a cutting board and cover with aluminum foil; let rest for 20 minutes.",
                "Slice the turkey and serve."
            ),
            recipeImageId = R.drawable.perfect_roast_turkey
        ),
        Recipe(
            id = 12,
            title = "Pizza Dough",
            mealType = "Snack",
            servingSize = 4,
            difficultyLevel = "Beginner",
            ingredients = listOf(
                "3 1/2 to 4 cups bread flour, plus more for rolling",
                "1 teaspoon sugar",
                "1 envelope instant dry yeast",
                "2 teaspoons kosher salt",
                "1 1/2 cups water, 110 degrees F",
                "2 tablespoons olive oil, plus 2 teaspoons"
            ),
            preparationSteps = listOf(
                "Combine the bread flour, sugar, yeast and kosher salt in the bowl of a stand mixer and combine. " +
                        "While the mixer is running, add the water and 2 tablespoons of the oil and beat until the dough forms into a ball. " +
                        "If the dough is sticky, add additional flour, 1 tablespoon at a time, until the dough comes together in a solid ball. " +
                        "If the dough is too dry, add additional water, 1 tablespoon at a time. Scrape the dough onto a lightly floured surface and gently knead into a smooth, firm ball.",
                "Grease a large bowl with the remaining 2 teaspoons olive oil, add the dough, cover the bowl with plastic wrap and put it in a warm area to let it double in size, about 1 hour. " +
                        "Turn the dough out onto a lightly floured surface and divide it into 2 equal pieces. Cover each with a clean kitchen towel or plastic wrap and let them rest for 10 minutes." +
                        "\n\nCook’s Note \n Using bread flour will give you a much crisper crust. If you can't find bread flour, you can substitute it with all-purpose flour which will give you a chewier crust."
            ),
            recipeImageId = R.drawable.pizza_dough
        ),
        Recipe(
            id = 15,
            title = "Oven Baked Salmon",
            mealType = "Dinner",
            servingSize = 4,
            difficultyLevel = "Advanced",
            ingredients = listOf(
                "3 1/2 to 4 cups bread flour, plus more for rolling",
                "1 teaspoon sugar",
                "1 envelope instant dry yeast",
                "2 teaspoons kosher salt",
                "1 1/2 cups water, 110 degrees F",
                "2 tablespoons olive oil, plus 2 teaspoons"
            ),
            preparationSteps = listOf(
                "Combine the bread flour, sugar, yeast and kosher salt in the bowl of a stand mixer and combine. " +
                        "While the mixer is running, add the water and 2 tablespoons of the oil and beat until the dough forms into a ball. " +
                        "If the dough is sticky, add additional flour, 1 tablespoon at a time, until the dough comes together in a solid ball. " +
                        "If the dough is too dry, add additional water, 1 tablespoon at a time. Scrape the dough onto a lightly floured surface and gently knead into a smooth, firm ball.",
                "Grease a large bowl with the remaining 2 teaspoons olive oil, add the dough, cover the bowl with plastic wrap and put it in a warm area to let it double in size, about 1 hour. " +
                        "Turn the dough out onto a lightly floured surface and divide it into 2 equal pieces. Cover each with a clean kitchen towel or plastic wrap and let them rest for 10 minutes." +
                        "\n\nCook’s Note \n Using bread flour will give you a much crisper crust. If you can't find bread flour, you can substitute it with all-purpose flour which will give you a chewier crust."
            ),
            recipeImageId = R.drawable.oven_baked_salmon
        )
    )

    fun getRecipeTitles(): List<String> {
        return recipeList.map { it.title }
    }

    fun getRecipeByTitle(title: String): Recipe? {
        return recipeList.find { it.title == title }
    }
}
