package dev.aangepast.aomcosmeticsblocker;

import dev.aangepast.aomcosmeticsblocker.commands.cosmetics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("cosmetics").setExecutor(new cosmetics());


        Plugin minehutCosmetics = Bukkit.getPluginManager().getPlugin("MinehutCosmetics");
        if(minehutCosmetics != null){
            Bukkit.getPluginManager().disablePlugin(minehutCosmetics);
        } else {
            getLogger().info("Cosmetics plugin not found.");
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
