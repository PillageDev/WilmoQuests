package net.wilmo.wilmoquests.guis;

import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;

public interface QuestsGui {
    void openGui();
    void initItems();

    @EventHandler
    void onInventoryClick(InventoryClickEvent e);
}
