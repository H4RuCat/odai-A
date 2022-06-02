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
    public void onDeath(PlayerDeathEvent p) {
        Player e = p.getPlayer();

        e.getInventory().getItemInMainHand().getType();

        p.setDeathMessage(e.getPlayer() + "は死んだ\n" + "所持していたアイテム[ " + e.getItemInHand() + " ]");
            }

    @EventHandler
    public void onDamaged(PlayerItemDamageEvent p) {




    }




}
