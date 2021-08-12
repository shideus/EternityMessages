package sh1nakuma;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class EternityMessages extends JavaPlugin {

    public static EternityMessages plugin;
    PluginManager pluginManager = Bukkit.getServer().getPluginManager();

    @Override
    public void onEnable() {
        plugin = this;
        this.saveDefaultConfig();
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new QuitListener(), this);
    }

}
