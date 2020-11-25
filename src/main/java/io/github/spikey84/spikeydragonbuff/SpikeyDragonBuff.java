package io.github.spikey84.spikeydragonbuff;

import org.bukkit.plugin.java.JavaPlugin;

public class SpikeyDragonBuff extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new eListener(),this);
        getLogger().info("Test");
    }

    @Override
    public void onDisable() {}
}
