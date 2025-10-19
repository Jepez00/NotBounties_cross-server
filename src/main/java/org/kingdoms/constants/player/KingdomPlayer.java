package org.kingdoms.constants.player;

import org.kingdoms.constants.group.Kingdom;
import org.kingdoms.constants.group.Nation;
import org.kingdoms.constants.group.model.relationships.KingdomRelation;
import org.bukkit.entity.Player;
import java.util.UUID;

/**
 * Stub class for Kingdoms - allows compilation without the actual dependency
 */
public class KingdomPlayer {
    public static KingdomPlayer getKingdomPlayer(Player player) {
        return null;
    }

    public static KingdomPlayer getKingdomPlayer(UUID uuid) {
        return null;
    }

    public Kingdom getKingdom() {
        return null;
    }

    public Nation getNation() {
        return null;
    }

    public KingdomRelation getRelationWith(KingdomPlayer other) {
        return null;
    }

    public KingdomRelation getRelationWith(Nation nation) {
        return null;
    }
}
