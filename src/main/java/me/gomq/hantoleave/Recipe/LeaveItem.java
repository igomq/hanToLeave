package me.gomq.hantoleave.Recipe;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

import static me.gomq.hantoleave.Events.InventoryClickListener.*;

public class LeaveItem {
    public static ItemStack finalItem;
    static {
        ItemStack scroll = new ItemStack(Material.BOOK, 1);
        ItemMeta meta = scroll.getItemMeta();

        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setDisplayName(ChatColor.GOLD + "서버 퇴장권");
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "게임을 끝낼 수 있는 아이템이다.\n우클릭하면 사용할 수 있다."));
        scroll.setItemMeta(meta);

        finalItem = scroll;
    }

    public static ShapedRecipe getRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("itm_b"), finalItem);
        recipe.shape(
                "   ",
                " AN",
                " HL"
        );

        recipe.setIngredient('H', WORD_H);
        recipe.setIngredient('A', WORD_A);
        recipe.setIngredient('N', WORD_N);
        recipe.setIngredient('L', Material.LEATHER);

        return recipe;
    }
}
