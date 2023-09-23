package net.wilmo.wilmoquests.quests;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum Quests {
    MINE_10_COBBLE("Mine 10 Cobblestone", Material.COBBLESTONE, new QuestTask(QuestActions.MINE, 10, new QuestReward(new ItemStack(Material.DIAMOND))), "Mine 10 cobblestone");

    private final Material material;
    private final String name;
    private final QuestTask task;
    private final String[] desc;

    Quests(String name, Material material, QuestTask task, String... desc) {
        this.name = name;
        this.task = task;
        this.material = material;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public QuestTask getTask() {
        return task;
    }

    public String[] getDesc() {
        return desc;
    }

    public Material getMaterial() {
        return material;
    }
}