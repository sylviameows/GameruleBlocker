package io.github.sylviameows.gameruleblocker;

import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class GameruleBlocker extends JavaPlugin {
    @Override
    public void onEnable() {
        saveResource("config.yml", false);

        GameruleCommand command = new GameruleCommand(this);
        PluginCommand bukkitCommand = getCommand("gamerule");
        if (bukkitCommand == null) {
            getLogger().severe("Command doesn't exist in this plugin's plugin.yml! Please contact the developer to fix this.");
            return;
        }

        bukkitCommand.setTabCompleter(command);
        bukkitCommand.setExecutor(command);

        getLogger().info("Plugin loaded successfully!");
    }

    public String getMessage() {
        return getConfig().getString("message", "&cWhen setting a gamerule you should be using &n/mv gamerule&r&c. If you meant to use the vanilla gamerule command use &n/minecraft:gamerule&r&c");
    }
}
