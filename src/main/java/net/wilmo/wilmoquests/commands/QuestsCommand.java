package net.wilmo.wilmoquests.commands;

import net.wilmo.wilmoquests.guis.impl.QuestsMain;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.jetbrains.annotations.NotNull;

import static org.bukkit.ChatColor.*;

public class QuestsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(RED + "This command should only be executed by players!");
            return true;
        }

        Player player = (Player)sender;
        QuestsMain gui = new QuestsMain(player);

        gui.openGui();

        return true;
    }
}