package net.wilmo.wilmoquests.quests;

public class QuestTask {
    private final QuestActions action;
    private final int amount;
    private final QuestReward reward;

    public QuestTask(QuestActions action, int amount, QuestReward reward) {
        this.action = action;
        this.amount = amount;
        this.reward = reward;
    }

    public QuestActions getAction() {
        return action;
    }

    public int getAmount() {
        return amount;
    }

    public QuestReward getReward() {
        return reward;
    }
}