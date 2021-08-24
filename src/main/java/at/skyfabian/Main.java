package at.skyfabian;

import at.skyfabian.data.Prefixes;
import at.skyfabian.events.Listener;
import at.skyfabian.scoreboard.ScoreBoard;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        listernerRegister();
        System.out.println(Prefixes.servernameconsole() + "Plugin wird geladen.");
        System.out.println(Prefixes.servernameconsole() + "Das Plugin von SkyFabian wurde erfolgreich geladen.");
        //Scoreboard-Updater
        Bukkit.getScheduler().scheduleAsyncRepeatingTask(this, new Runnable() {
            public void run() {
                for (Player all : Bukkit.getOnlinePlayers()) {
                    new ScoreBoard().updateScoreboard(all);
                }
            }
        }, 0 , 20 );

    }

    @Override
    public void onDisable() {
        System.out.println(Prefixes.servernameconsole() + "Der Server ist nun offline.");
    }

    private void listernerRegister() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new Listener(), this);
    }

}


