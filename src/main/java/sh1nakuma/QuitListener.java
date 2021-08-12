package sh1nakuma;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.Random;

public class QuitListener implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        int listSize = ConfigLoader.quitMessages.size();
        Random random = new Random();
        String randomMessage = ConfigLoader.quitMessages.get(random.nextInt(listSize));
        event.setQuitMessage(Utils.format(randomMessage, player.getName()));
    }

}
