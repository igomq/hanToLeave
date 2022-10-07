package me.gomq.hantoleave;

import me.gomq.hantoleave.Events.InventoryClickListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

import static me.gomq.hantoleave.Recipe.RecipeManager.getRecipes;

public class HanToLeave extends JavaPlugin {
    @Override
    public void onEnable() {
        try {
            initializePlugin();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(ChatColor.GRAY + "Loading plugin");
        System.out.println(ChatColor.GRAY + " ___  ___  ________  ________           _________  ________          ___       _______   ________  ___      ___ _______      \n" +
                "|\\  \\|\\  \\|\\   __  \\|\\   ___  \\        |\\___   ___\\\\   __  \\        |\\  \\     |\\  ___ \\ |\\   __  \\|\\  \\    /  /|\\  ___ \\     \n" +
                "\\ \\  \\\\\\  \\ \\  \\|\\  \\ \\  \\\\ \\  \\       \\|___ \\  \\_\\ \\  \\|\\  \\       \\ \\  \\    \\ \\   __/|\\ \\  \\|\\  \\ \\  \\  /  / | \\   __/|    \n" +
                " \\ \\   __  \\ \\   __  \\ \\  \\\\ \\  \\           \\ \\  \\ \\ \\  \\\\\\  \\       \\ \\  \\    \\ \\  \\_|/_\\ \\   __  \\ \\  \\/  / / \\ \\  \\_|/__  \n" +
                "  \\ \\  \\ \\  \\ \\  \\ \\  \\ \\  \\\\ \\  \\           \\ \\  \\ \\ \\  \\\\\\  \\       \\ \\  \\____\\ \\  \\_|\\ \\ \\  \\ \\  \\ \\    / /   \\ \\  \\_|\\ \\ \n" +
                "   \\ \\__\\ \\__\\ \\__\\ \\__\\ \\__\\\\ \\__\\           \\ \\__\\ \\ \\_______\\       \\ \\_______\\ \\_______\\ \\__\\ \\__\\ \\__/ /     \\ \\_______\\\n" +
                "    \\|__|\\|__|\\|__|\\|__|\\|__| \\|__|            \\|__|  \\|_______|        \\|_______|\\|_______|\\|__|\\|__|\\|__|/       \\|_______|\n" +
                "                                                                                                                             \n" +
                "                                                                                                                             \n" +
                "                                                                                                                             ");
        System.out.println(ChatColor.GREEN + "HanToLeave Plugin");
        System.out.println(ChatColor.GREEN + "Developer GomQ, Github https://github.com/igomq");
    }

    @Override
    public void onDisable() {
        Bukkit.broadcastMessage(ChatColor.RED + "Disabling HanToLeave Plugin");
    }
    private void initializePlugin() throws Exception {
        ArrayList<ShapedRecipe> recipes = getRecipes();
        for (ShapedRecipe recipe : recipes) {
            Bukkit.addRecipe(recipe);
        }

        // Register events
        getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
    }
}
