package test.test;

import org.bukkit.*;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.Sound.BLOCK_STONE_HIT;

public class Listeners implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player p = e.getPlayer();

        e.setJoinMessage(ChatColor.YELLOW + p.getName() + "が戦場に参加したぞ！");
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player p = e.getPlayer();
        ItemStack item = p.getItemInHand();

        e.setDeathMessage(e.getPlayer() + "は死んだ\n" + "所持していたアイテム[ " + item.getItemMeta().getDisplayName() + " ]");
    }
    @EventHandler
    public void onAttack(EntityDamageEvent e) {
        if(e.getEntityType() != EntityType.PLAYER) {
            return;
        }

        Location loc = e.getEntity().getLocation();
        byAttackAuthor(loc);
    }

    public void byAttackAuthor(Location loc) {
        loc.getWorld().playSound(loc, BLOCK_STONE_HIT, 2, 1);
    }




}
