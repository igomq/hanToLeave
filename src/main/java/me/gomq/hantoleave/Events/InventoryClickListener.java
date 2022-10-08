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
        ItemStack temp = new ItemStack(Material.RED_BANNER, 1);
        ItemMeta meta = temp.getItemMeta();

        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setDisplayName(ChatColor.RED + "[ \"ㅎ\" ]");
        temp.setItemMeta(meta);

        WORD_H = temp;
    }

    public static final ItemStack WORD_A;
    static {
        ItemStack temp = new ItemStack(Material.BLUE_BANNER, 1);
        ItemMeta meta = temp.getItemMeta();

        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setDisplayName(ChatColor.BLUE + "[ \"ㅏ\" ]");
        temp.setItemMeta(meta);

        WORD_A = temp;
    }
    public static final ItemStack WORD_N;
    static {
        ItemStack temp = new ItemStack(Material.WHITE_BANNER, 1);
        ItemMeta meta = temp.getItemMeta();

        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setDisplayName(ChatColor.WHITE + "[ \"ㄴ\" ]");
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

            // get random number 1~100
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;

            if (randomNumber <= 75) {
                e.getWhoClicked().sendMessage(ChatColor.BOLD + (ChatColor.RED + "응 실패 허접아"));
            } else if (randomNumber <= 90) {
                playerInventory.addItem(WORD_H);
                e.getWhoClicked().sendMessage(ChatColor.GREEN + "[ \"ㅎ\" ]이 나왔네? ㅊㅊ");
            } else if (randomNumber <= 98) {
                playerInventory.addItem(WORD_A);
                e.getWhoClicked().sendMessage(ChatColor.GREEN + "[ \"ㅏ\" ]가 나왔네? ㅊㅊ");
            } else {
                playerInventory.addItem(WORD_N);
                e.getWhoClicked().sendMessage(ChatColor.GREEN + "어라? [ \"ㄴ\" ]이 나왔네? ㅊㅊㅊ");
            }
        }
    }
}
