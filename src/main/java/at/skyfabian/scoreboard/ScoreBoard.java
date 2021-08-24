package at.skyfabian.scoreboard;

import at.skyfabian.data.Prefixes;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class ScoreBoard {

    public static Scoreboard getBaseScoreboard(Player player) {
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("main", "main");
        objective.setDisplayName(Prefixes.servername());
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        //✖ » ✕
        objective.getScore("§1").setScore(0);
        objective.getScore("§7✕ Name:").setScore(5);
        objective.getScore(" §8» §3" + player.getName()).setScore(4);
        objective.getScore("§2").setScore(3);
        objective.getScore("§7✕ Online:").setScore(2);
        objective.getScore("§3").setScore(6);

        Team team = scoreboard.registerNewTeam("online");
        team.addEntry(ChatColor.AQUA + "" + ChatColor.RED);
        objective.getScore(ChatColor.AQUA + "" + ChatColor.RED).setScore(1);

        team.setPrefix(" §8» §b" + Bukkit.getOnlinePlayers().size() + "§8/§b100");
        return scoreboard;
    }

    public void updateScoreboard(final Player player) {

        if (player.getScoreboard() == null || player.getScoreboard().getObjective(DisplaySlot.SIDEBAR) == null)
            return;
        player.getScoreboard().getTeam("online").setPrefix(" §8» §b" + Bukkit.getOnlinePlayers().size() + "§8/§b100");

    }
}
