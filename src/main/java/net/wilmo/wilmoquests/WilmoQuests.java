package net.wilmo.wilmoquests;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class WilmoQuests extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("WilmoQuests has been enabled!");

    }

    @Override
    public void onDisable() {
        getLogger().info("WilmoQuests has been disabled!");
    }
}
