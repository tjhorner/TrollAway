package com.endercraftservers.geekygamer14;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class TrollAway extends JavaPlugin {

	public void onEnable(){
		getLogger().info("Starting up TrollAway by GeekyGamer14");
		getLogger().info("Bye bye trolls!!!");
	}
	
	public void onDisable(){
		
	}
	//Commands start
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player target = (Bukkit.getServer().getPlayer(args[0]));
		// Fake op
		if (cmd.getName().equalsIgnoreCase("fakeop")){
			if (args.length < 1) { 
				return false;
			} else {
				getLogger().info(sender.getName() + " fake opped " + target.getName());
				sender.sendMessage(target.getName() + " is now ''opped'' and on fire!.");
				target.sendMessage(ChatColor.YELLOW + "You are now op!");
				target.setCustomName("Definitely opped!");
				target.setCustomNameVisible(true);
				target.setFireTicks(1000000);
				return true;
			}
			
			
			// fake deop
		} else if (cmd.getName().equalsIgnoreCase("fakedeop"))
			{
			if(args.length < 1){
				return false;
			}else{
				getLogger().info(sender.getName() + " fake de-opped " + target.getName());
				sender.sendMessage(target.getName() + " is no longer ''opped''...");
				target.sendMessage(ChatColor.YELLOW + "You are no longer op!");
				target.setCustomNameVisible(false);
				target.setFireTicks(0);
				return true;
			}
			
			
			// fake gm1
		}else if (cmd.getName().equalsIgnoreCase("fakegm1")) {
			if(args.length < 1){
				return false;
			}else{
				{
					getLogger().info(sender.getName() + " fake GM 1'd " + target.getName());
					sender.sendMessage(target.getName() + " is now in ''creative mode''...");
					target.sendMessage("Your game mode has been updated to CREATIVE.");
					target.setFireTicks(0);
					target.setAllowFlight(true);
					return true;
				}
		}	
		}else if (cmd.getName().equalsIgnoreCase("fakegm0")) {
			if(args.length < 1){
				return false;
			}else{
				{
					getLogger().info(sender.getName() + " fake GM 0'd " + target.getName());
					sender.sendMessage(target.getName() + " is now in ''survival mode''...");
					target.sendMessage("Your game mode has been updated to SURVIVAL.");
					target.setAllowFlight(false);
					target.setFireTicks(100000000);
					return true;
				}
	}
}
	//Commands End
		return false;
	

	
}
}