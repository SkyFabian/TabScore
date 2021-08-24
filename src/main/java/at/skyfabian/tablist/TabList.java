package at.skyfabian.tablist;

import com.connorlinfoot.titleapi.TitleAPI;
import org.bukkit.entity.Player;

public class TabList {

    public static void setTablist(Player player){
        TitleAPI.sendTitle(player, 5, 5, 5, "Willkommen");
        TitleAPI.sendTabTitle(player, "\n§r §b§lNetzwerk§8§l.§b§lat §7Netzwerk §8» §c§l§nBETA§r \n §3Server §8» §b§lLobby \n"
                , "\n §7Twitter §8» @§3NetzwerkAT \n §7Discord §8» §3discord.gg/link" );
    }
}
