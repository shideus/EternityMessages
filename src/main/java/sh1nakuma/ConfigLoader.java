package sh1nakuma;

import org.bukkit.configuration.Configuration;

import java.util.List;

public class ConfigLoader {

    public static Configuration config = EternityMessages.plugin.getConfig();
    public static List<String> welcomeMessages = config.getStringList("welcomeMessages");
    public static List<String> joinMessages = config.getStringList("joinMessages");
    public static List<String> quitMessages = config.getStringList("quitMessages");
}
