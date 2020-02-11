package net.noyark;

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class FireListener implements Listener {

    private Random random

    FireListener(){
        random = new Random()
    }
    @EventHandler
    void onPlayerJoin(PlayerJoinEvent e){
        if(random.nextBoolean()){
            e.getPlayer().fireTicks = 1000
        }
    }
}
