package fr.shakatar.reachlimit;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_ReachLimit implements CommandExecutor {
	public static boolean isNumeric(String str)
	{
	  return str.matches("-?\\d+(\\.\\d+)?");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
		if(sender instanceof Player){
			Player player = (Player)sender;
			if(args.length == 1){
				if(isNumeric(args[0])){
					ReachLimitListeners.ReachLimit = Double.valueOf(args[0]);
					player.sendMessage("§aReach limit was set to "+args[0]);
				}else{
					player.sendMessage("§c"+args[0]+" is not a number");
				}
			}else {
				player.sendMessage("§c Usage : /reachlimit <number>");
				player.sendMessage("§c Example : /reachlimit 3.0");
			}
		}
		return false;
	}

}
