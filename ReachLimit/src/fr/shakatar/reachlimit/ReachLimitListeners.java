package fr.shakatar.reachlimit;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class ReachLimitListeners implements Listener {
	
	public static double ReachLimit = 3.0;
	@EventHandler
	public void onHit(EntityDamageByEntityEvent event){
    	if (event.getDamager() instanceof Player){
            Player damager = (Player)event.getDamager();
            Entity damaged = event.getEntity();
            double damager_reach = damager.getLocation().distance(damaged.getLocation());
            if(damager_reach > ReachLimit){
            		event.setCancelled(true);  	
            }
        }
    }
}
