package io.github.sylviameows.gameruleblocker;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        saveResource("config.yml", false);

        Command command = new Command(this);
        getCommand("gamerule").setTabCompleter(command);
        getCommand("gamerule").setExecutor(command);

        getLogger().info("Plugin loaded!");
    }

    public Component getMessage() {
        String raw = getConfig().getString("message", "<red>When setting a gamerule you should be using <u>/mv gamerule</u>. If you meant to use the vanilla gamerule command use <u>/minecraft:gamerule</u>");
        return MiniMessage.miniMessage().deserialize(raw);
    }
}
