package at.skyfabian.events;

import at.skyfabian.scoreboard.ScoreBoard;
import at.skyfabian.tablist.TabList;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        event.setJoinMessage("§8[§a+§8] §7" + player.getName());
        event.getPlayer().setScoreboard(ScoreBoard.getBaseScoreboard(event.getPlayer()));

        ScoreBoard.getBaseScoreboard(event.getPlayer());
        TabList.setTablist(event.getPlayer());

    }

    public void onLeave(PlayerQuitEvent event) {
        event.setQuitMessage("§8[§c-§8] §7" + Bukkit.getName());
    }
}
