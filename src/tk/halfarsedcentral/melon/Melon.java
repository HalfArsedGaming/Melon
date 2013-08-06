package tk.halfarsedcentral.melon;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Melon extends JavaPlugin{
public void onEnable() {
		
		Bukkit.broadcastMessage(ChatColor.GREEN + "Melon Enabled");
		 Bukkit.getServer().getPluginManager()
		    .registerEvents(new MelonListeners(), this);
	}
}
