package net.wilmo.wilmoquests.guis.impl;

import net.wilmo.wilmoquests.guis.QuestsGui;
import net.wilmo.wilmoquests.quests.QuestReward;
import net.wilmo.wilmoquests.quests.Quests;
import net.wilmo.wilmoquests.utils.GuiUtils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.bukkit.ChatColor.GRAY;

public class DailyQuests extends GuiUtils implements QuestsGui, Listener {
    private List<Quests> quests = new ArrayList<>(List.of(Quests.values()));
    private ArrayList<Quests> randomQuests;
    private final Inventory inv;
    private final Player p;
    public DailyQuests(Player player) {
        inv = Bukkit.createInventory(null, 27, GRAY + "Daily quests");
        p = player;

        initItems();
    }

    @Override
    public void openGui() {
        p.openInventory(inv);
    }

    @Override
    public void initItems() {
        /*for (int i = 0; i < 5; i++) {
            randomQuests = quests.get(new Random(System.currentTimeMillis()).nextInt(Quests.values().length));
        }*/
        inv.setItem(0, item(Quests.MINE_10_COBBLE.getName(), Quests.MINE_10_COBBLE.getMaterial(), 0, Quests.MINE_10_COBBLE.getDesc()));
    }

    @Override
    public void onInventoryClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getCurrentItem() == null || e.getSlotType() != InventoryType.SlotType.CONTAINER)
            return;

        if (e.getCurrentItem().getType() == Material.COBBLESTONE)
            p.sendMessage("You need to " + Quests.MINE_10_COBBLE.getDesc() + " to complete the quest!");
            // TODO: We'll need to create a listener for this quest

        e.setCancelled(true);
    }
}