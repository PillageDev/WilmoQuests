package net.wilmo.wilmoquests;

import net.wilmo.wilmoquests.commands.*;
import net.wilmo.wilmoquests.guis.impl.*;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WilmoQuests extends JavaPlugin {
    private static WilmoQuests instance = null;

    @Override
    public void onEnable() {
        if (instance == null)
            instance = this;

        registerCommands();
        registerListeners();

        saveDefaultConfig();
        getLogger().info("WilmoQuests has been enabled  with Bukkit version: " + Bukkit.getVersion());
    }

    @Override
    public void onDisable() {
        getLogger().info("WilmoQuests has been disabled!");
    }
    private void registerCommands() {
        try { // Impossible to fail, unless you didn't register the command in the plugin.yml file
            getCommand("quests").setExecutor(new QuestsCommand());
            getLogger().info("Registered quest command");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void registerListeners() { // Not useful, listeners do not throw exceptions
        try {  
            getServer().getPluginManager().registerEvents(new QuestsMain(null), this);
            getLogger().info("Registered quest listener");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        try {
            getServer().getPluginManager().registerEvents(new DailyQuests(null), this);
            getLogger().info("Registered daily quest listener");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WilmoQuests getInstance() {
        return instance;
    }
}
