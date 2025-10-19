package com.booksaw.betterTeams;

import org.bukkit.entity.Player;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

/**
 * Stub class for BetterTeams - allows compilation without the actual dependency
 */
public class Team {
    public List<UUID> getMembers() {
        return new ArrayList<>();
    }

    public static Team getTeam(Player player) {
        return null;
    }

    public String getID() {
        return "";
    }

    public boolean isAlly(String teamId) {
        return false;
    }
}
