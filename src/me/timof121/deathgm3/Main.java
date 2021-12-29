package me.timof121.deathgm3;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new Listener1(), this);
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
}
