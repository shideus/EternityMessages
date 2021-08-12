package sh1nakuma;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Random;

public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (player.hasPlayedBefore()) {
            int listSize = ConfigLoader.joinMessages.size();
            Random random = new Random();
            String randomMessage = ConfigLoader.joinMessages.get(random.nextInt(listSize));
            event.setJoinMessage(Utils.format(randomMessage, player.getName()));
        } else {
            int listSize = ConfigLoader.welcomeMessages.size();
            Random random = new Random();
            String randomMessage = ConfigLoader.welcomeMessages.get(random.nextInt(listSize));
            event.setJoinMessage(Utils.format(randomMessage, player.getName()));
        }
    }

}
