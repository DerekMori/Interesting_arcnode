package io.github.Nitralow.Interesting;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Interesting extends JavaPlugin{	
	public final Logger Logger = java.util.logging.Logger.getLogger("Minecraft");
    public static Interesting plaugin;
    
    @Override
    public void onDisable() {
    	PluginDescriptionFile pdffile = this.getDescription();
    	this.Logger.info(pdffile.getFullName()+ "Has been Disabled! =(");
    }
    
    @Override
    public void onEnable() {
    	PluginDescriptionFile pdffile = this.getDescription();
    	this.Logger.info(pdffile.getFullName() + "version" + pdffile.getVersion() + "Has been Enabled! =)");
    }
    
    
public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args){
	Player player = (Player) sender;
	if (commandLabel.equalsIgnoreCase("heal") || commandLabel.equalsIgnoreCase("h")); {
		if(args.length() == 0){ //heal = o args /heal Bench3 = 1 args
			player.setHealth(20);
			player.sendMessage(ChatColor.GREEN + "You have been Healed by a Friend");
		}else if(args.length() == 1){
			if (player.getServer().getPlayer(args) != null);
			Player targetPlayer = player.getServer().getPlayer(args);
			targetPlayer.setHealth(20);
		}else{
			player.sendMessage(ChatColor.DARK_RED + "Player you are try to heal is not online try another time");
		}
	}
    
	return false;
}
public boolean onCommand1(CommandSender sender, Command cmd, String commandLabel, String args){
	Player player = (Player) sender;
	if (commandLabel.equalsIgnoreCase("Fart")); {
		if(args.length() == 0 ){
			player.sendMessage(ChatColor.DARK_GREEN + "I'm better");
		}
	}
	return false;
  } 
}

 