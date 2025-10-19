package com.massivecraft.factions;

import org.bukkit.entity.Player;

/**
 * Stub class for Factions - allows compilation without the actual dependency
 */
public class FPlayers {
    public static FPlayers getInstance() {
        return new FPlayers();
    }

    public FPlayer getByPlayer(Player player) {
        return null;
    }
}
