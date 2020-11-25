package io.github.spikey84.spikeydragonbuff;


import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;


public class eListener implements Listener {
    @EventHandler
    public void onMobSpawn(EntitySpawnEvent e) {

        Entity E = e.getEntity();

        if (E.getType() != EntityType.ENDER_DRAGON) return;
        ((LivingEntity) E).getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(3000);
        ((LivingEntity) E).setHealth(2048);

        ((LivingEntity) E).getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(40);
        ((LivingEntity) E).getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(2);

    }
}



