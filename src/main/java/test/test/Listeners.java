package test.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Listeners implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent p) {

        Player e = p.getPlayer();

        p.setJoinMessage(ChatColor.YELLOW + e.getName() + "が戦場に参加したぞ！");
    }

    @EventHandler
    public void onKill(PlayerDeathEvent p) {

        Player e = p.getPlayer();
        ItemStack i = p.getPlayer().getItemInHand();

        p.setDeathMessage(ChatColor.RED + e.getName() + "が死亡した \n" + ChatColor.YELLOW  + "所持していたアイテム: " + i.getI18NDisplayName());
    }

    @EventHandler
    public void onDamaged(PlayerItemDamageEvent p) {




    }




}
