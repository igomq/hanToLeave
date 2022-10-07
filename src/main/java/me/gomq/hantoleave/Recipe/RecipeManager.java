package me.gomq.hantoleave.Recipe;

import org.bukkit.inventory.ShapedRecipe;

import java.util.ArrayList;
public class RecipeManager {
    public static ArrayList<ShapedRecipe> getRecipes() {
        ArrayList<ShapedRecipe> recipes = new ArrayList<>();
        recipes.add(RandomItem.getRecipe());

        return recipes;
    }
}
