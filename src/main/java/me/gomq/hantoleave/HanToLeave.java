package me.gomq.hantoleave;

import me.gomq.hantoleave.Events.InventoryClickListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import static me.gomq.hantoleave.Recipe.RecipeManager.getRecipes;

public class HanToLeave extends JavaPlugin {
    @Override
    public void onEnable() {
        try {
            initializePlugin();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Bukkit.getLogger().log(new LogRecord(Level.INFO,ChatColor.GRAY + "Loading plugin"));
        Bukkit.getLogger().log(new LogRecord(Level.INFO, ChatColor.GRAY + "\n ___  ___  ________  ________           _________  ________          ___       _______   ________  ___      ___ _______      \n" +
                "|\\  \\|\\  \\|\\   __  \\|\\   ___  \\        |\\___   ___\\\\   __  \\        |\\  \\     |\\  ___ \\ |\\   __  \\|\\  \\    /  /|\\  ___ \\     \n" +
                "\\ \\  \\\\\\  \\ \\  \\|\\  \\ \\  \\\\ \\  \\       \\|___ \\  \\_\\ \\  \\|\\  \\       \\ \\  \\    \\ \\   __/|\\ \\  \\|\\  \\ \\  \\  /  / | \\   __/|    \n" +
                " \\ \\   __  \\ \\   __  \\ \\  \\\\ \\  \\           \\ \\  \\ \\ \\  \\\\\\  \\       \\ \\  \\    \\ \\  \\_|/_\\ \\   __  \\ \\  \\/  / / \\ \\  \\_|/__  \n" +
                "  \\ \\  \\ \\  \\ \\  \\ \\  \\ \\  \\\\ \\  \\           \\ \\  \\ \\ \\  \\\\\\  \\       \\ \\  \\____\\ \\  \\_|\\ \\ \\  \\ \\  \\ \\    / /   \\ \\  \\_|\\ \\ \n" +
                "   \\ \\__\\ \\__\\ \\__\\ \\__\\ \\__\\\\ \\__\\           \\ \\__\\ \\ \\_______\\       \\ \\_______\\ \\_______\\ \\__\\ \\__\\ \\__/ /     \\ \\_______\\\n" +
                "    \\|__|\\|__|\\|__|\\|__|\\|__| \\|__|            \\|__|  \\|_______|        \\|_______|\\|_______|\\|__|\\|__|\\|__|/       \\|_______|\n" +
                "                                                                                                                             \n" +
                "                                                                                                                             \n" +
                "                                                                                                                             "));
        Bukkit.getLogger().log(new LogRecord(Level.INFO, ChatColor.GREEN + "HanToLeave Plugin"));
        Bukkit.getLogger().log(new LogRecord(Level.INFO, ChatColor.GREEN + "Developer GomQ, Github https://github.com/igomq"));
    }

    @Override
    public void onDisable() { Bukkit.getLogger().log(new LogRecord(Level.INFO, ChatColor.RED + "Disabling HanToLeave Plugin")); }
    private void initializePlugin() throws Exception {
        ArrayList<ShapedRecipe> recipes = getRecipes();
        for (ShapedRecipe recipe : recipes) {
            Bukkit.addRecipe(recipe);
        }

        // Register events
        getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
    }
}
