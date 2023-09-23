package net.wilmo.wilmoquests.guis.impl;

import net.wilmo.wilmoquests.guis.QuestsGui;
import net.wilmo.wilmoquests.utils.GuiUtils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.meta.ItemMeta;

import static org.bukkit.ChatColor.GRAY;

import java.util.Objects;

public class QuestsMain extends GuiUtils implements QuestsGui, Listener {
    private final Inventory inv;
    private final Player p;

    public QuestsMain(Player player) {
        inv = Bukkit.createInventory(null, 9, GRAY + "Quests");
        p = player;

        initItems();
    }

    @Override
    public void openGui() {
        p.openInventory(inv);
    }

    @Override
    public void initItems() {
        inv.setItem(2, item("&aDaily Quests", Material.CLOCK, 0, "&7Click here to view your daily quests!"));
        inv.setItem(6, item("&aWeekly Quests", Material.GOLD_BLOCK, 0, "&7Click here to view weekly your quests!"));
    }

    @Override
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getCurrentItem() == null || e.getSlotType() != InventoryType.SlotType.CONTAINER)
            return;

        if (e.getCurrentItem().getType() == Material.CLOCK)
            new DailyQuests(p).openGui();

        e.setCancelled(true);
    } // i am going to push to github and restart + go eat
    // so if you want to work you can
}