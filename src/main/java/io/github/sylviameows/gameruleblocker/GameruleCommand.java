package io.github.sylviameows.gameruleblocker;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class GameruleCommand implements CommandExecutor, TabExecutor {
    private final GameruleBlocker plugin;

    public GameruleCommand(GameruleBlocker plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatUtil.translate(plugin.getMessage()));
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        return List.of("");
    }
}
