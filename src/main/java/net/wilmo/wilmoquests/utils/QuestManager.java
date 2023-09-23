package net.wilmo.wilmoquests.utils;

import net.wilmo.wilmoquests.WilmoQuests;
import net.wilmo.wilmoquests.quests.Quests;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class QuestManager {
    private static final WilmoQuests plugin = WilmoQuests.getInstance();
    private static final FileConfiguration config = plugin.getConfig();

    public static void saveQuest(Player player, Quests quest, int progress) {
        String uuid = player.getUniqueId().toString();

        config.set("players." + uuid + ".quests." + quest.getName(), MathUtil.percentage(progress, quest));
        plugin.saveConfig();
    }

    public static boolean isCompleted(Player player, Quests quest) {
        return config.getDouble("players." + player.getUniqueId() + ".quests." + quest.getName()) == 1;
    }
}