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
        getCommand("quests").setExecutor(new QuestsCommand());
    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new QuestsMain(null), this);
        getServer().getPluginManager().registerEvents(new DailyQuests(null), this);
    }

    public static WilmoQuests getInstance() {
        return instance;
    }
}