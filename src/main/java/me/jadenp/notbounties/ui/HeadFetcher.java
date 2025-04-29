package me.jadenp.notbounties.ui;

import me.jadenp.notbounties.NotBounties;
import me.jadenp.notbounties.ui.gui.PlayerGUInfo;
import me.jadenp.notbounties.utils.LoggedPlayers;
import me.jadenp.notbounties.utils.tasks.HeadLoader;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.profile.PlayerProfile;

import java.util.*;

public class HeadFetcher {
    private static final Map<UUID, ItemStack> savedHeads = new HashMap<>();

    public void loadHeads(Player player, PlayerGUInfo guInfo, List<QueuedHead> heads) {
        HeadLoader headLoader = new HeadLoader(player, guInfo, heads, savedHeads);
        headLoader.setTaskImplementation(NotBounties.getServerImplementation().async().runAtFixedRate(headLoader, 1, 4));
    }


    public static ItemStack getUnloadedHead(UUID uuid) {
        if (savedHeads.containsKey(uuid))
            return savedHeads.get(uuid);
        ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) head.getItemMeta();
        assert meta != null;
        try {
            meta.setOwningPlayer(Bukkit.getOfflinePlayer(uuid));
        } catch (NullPointerException e) {
            if (NotBounties.getServerVersion() >= 18) {
                try {
                    PlayerProfile profile = Bukkit.createPlayerProfile(uuid, LoggedPlayers.getPlayerName(uuid));
                    meta.setOwnerProfile(profile);
                } catch (IllegalArgumentException ignored) {
                    // The name of the profile is longer than 16 characters
                    NotBounties.debugMessage("Could not get an unloaded head for: " + LoggedPlayers.getPlayerName(uuid), true);
                }
            }
        }
        head.setItemMeta(meta);
        return head;
    }
}
