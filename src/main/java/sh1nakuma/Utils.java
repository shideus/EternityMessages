package sh1nakuma;

import org.bukkit.ChatColor;

public class Utils {

    public static String format(String message, String playerName) {
        return ChatColor.translateAlternateColorCodes('&', message).replace("%player%", playerName);
    }

}
