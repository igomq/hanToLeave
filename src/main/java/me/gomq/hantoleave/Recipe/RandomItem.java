package me.gomq.hantoleave.Recipe;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class RandomItem {
    public static ItemStack scrollItem;
    static {
        ItemStack scroll = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = scroll.getItemMeta();

        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setDisplayName(ChatColor.BLUE + "아이템 획득 스크롤");
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "한글날에 필요한 아이템을 획득할 수 있는 스크롤이다.\n우클릭하면 사용할 수 있다."));
        scroll.setItemMeta(meta);

        scrollItem = scroll;
    }

    public static ShapedRecipe getRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("itm_s"), scrollItem);
        recipe.shape(
                "E  ",
                " PP",
                " PD"
        );

        recipe.setIngredient('E', Material.EGG);
        recipe.setIngredient('P', Material.PAPER);
        recipe.setIngredient('D', Material.DIAMOND);

        return recipe;
    }
}
