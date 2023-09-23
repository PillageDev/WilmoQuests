package net.wilmo.wilmoquests.quests;

import org.bukkit.inventory.ItemStack;

public class QuestReward {
    private String command;
    private ItemStack item;
    private float money;
    public QuestReward(String command) {
        this.command = command;
    }

    public QuestReward(ItemStack item) {
        this.item = item;
    }

    public QuestReward(float money) {
        this.money = money;
    }

    public String getCommand() {
        return command;
    }

    public ItemStack getItem() {
        return item;
    }

    public float getMoney() {
        return money;
    }
}
