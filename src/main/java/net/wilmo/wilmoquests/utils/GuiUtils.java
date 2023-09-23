package net.wilmo.wilmoquests.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class GuiUtils {
    public ItemStack item(String name, Material material, int slot, String... lore) {
        name = ChatColor.translateAlternateColorCodes('&', name);
        List<String> loreList = Arrays.asList(ChatColor.translateAlternateColorCodes('&', Arrays.toString(lore)));
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(name);
        meta.setLore(loreList);

        item.setItemMeta(meta);

        return item;
    }
}