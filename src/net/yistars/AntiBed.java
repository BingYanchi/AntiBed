package net.yistars;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class AntiBed extends org.bukkit.plugin.java.JavaPlugin implements org.bukkit.event.Listener
{
    public void onEnable()
    {
    	getServer().getPluginManager().registerEvents(this, this);
	}
 
@EventHandler(ignoreCancelled=true, priority=EventPriority.LOWEST)
public void onPlayerBed(PlayerBedEnterEvent evt)
{
	evt.setCancelled(true);
}
  
@EventHandler(ignoreCancelled=true, priority=EventPriority.LOWEST)
public void onUseBed(PlayerInteractEvent evt)
{
	if (evt.getAction() == org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK)
	{
		if ((evt.getClickedBlock().getType() == Material.BED) || (evt.getClickedBlock().getType() == Material.BED_BLOCK))
		{
			evt.setCancelled(true);
			}
		}
   	}
}