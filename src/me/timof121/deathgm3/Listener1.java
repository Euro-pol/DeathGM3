package me.timof121.deathgm3;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.entity.Player;
import org.bukkit.GameMode;

public class Listener1 implements Listener {
	@EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
		Player player = event.getEntity();
		player.setGameMode(GameMode.SPECTATOR);
    }
}
