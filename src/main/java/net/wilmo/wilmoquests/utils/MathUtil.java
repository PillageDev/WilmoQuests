package net.wilmo.wilmoquests.utils;

import net.wilmo.wilmoquests.quests.Quests;

public class MathUtil {
    public static float percentage(final int progress, final Quests quest) {
        return (float) (progress * quest.getTask().getAmount()) / 100;
    }
}