package fr.shakatar.reachlimit;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ReachLimit extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("ReachLimit Plugin >>> Enabled");
		PluginManager pm = getServer().getPluginManager();
		getCommand("reachlimit").setExecutor(new Command_ReachLimit());
		pm.registerEvents((Listener) new ReachLimitListeners(), this);
		System.out.println("CheatDisabled >>> Loaded");
	}
	
	@Override
	public void onDisable() {
		System.out.println("ReachLimit Plugin >>> Disabled");
	}

}

