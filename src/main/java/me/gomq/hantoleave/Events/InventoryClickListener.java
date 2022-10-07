package me.gomq.hantoleave.Events;

import me.gomq.hantoleave.Recipe.RandomItem;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Random;

public class InventoryClickListener implements Listener {
    public static final ItemStack WORD_H;
    static {
        ItemStack temp = new ItemStack(Material.BLACK_BANNER, 1);
        ItemMeta meta = temp.getItemMeta();

        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setDisplayName(ChatColor.BLACK + "\'ㅎ\'");
        temp.setItemMeta(meta);

        WORD_H = temp;
    }

    public static final ItemStack WORD_A;
    static {
        ItemStack temp = new ItemStack(Material.RED_BANNER, 1);
        ItemMeta meta = temp.getItemMeta();

        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setDisplayName(ChatColor.BLACK + "\'ㅏ\'");
        temp.setItemMeta(meta);

        WORD_A = temp;
    }
    public static final ItemStack WORD_N;
    static {
        ItemStack temp = new ItemStack(Material.BLUE_BANNER, 1);
        ItemMeta meta = temp.getItemMeta();

        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setDisplayName(ChatColor.BLACK + "\'ㄴ\'");
        temp.setItemMeta(meta);

        WORD_N = temp;
    }

    @EventHandler
    public void onInventoryClick (InventoryClickEvent e) {
        if (e.getClick().isLeftClick()) return;
        e.setCancelled(true);

        ItemStack clickedItem = e.getCurrentItem();
        assert clickedItem != null;

        if (clickedItem.isSimilar(RandomItem.scrollItem)) {
            e.getWhoClicked().getInventory().removeItem(RandomItem.scrollItem);
            Inventory playerInventory = e.getWhoClicked().getInventory();

            // get random number 1~10
            Random random = new Random();
            int randomNumber = random.nextInt(10) + 1;

            // get random item (70%, 20%, 10%)
            if (randomNumber <= 7) {
                playerInventory.addItem(WORD_H);
            } else if (randomNumber <= 9) {
                playerInventory.addItem(WORD_A);
            } else {
                playerInventory.addItem(WORD_N);
            }
        }
    }
}
