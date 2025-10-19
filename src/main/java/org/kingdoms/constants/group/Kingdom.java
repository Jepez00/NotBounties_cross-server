package org.kingdoms.constants.group;

import org.kingdoms.constants.player.KingdomPlayer;
import org.kingdoms.constants.group.model.relationships.KingdomRelation;
import java.util.Set;
import java.util.HashSet;

/**
 * Stub class for Kingdoms - allows compilation without the actual dependency
 */
public class Kingdom {
    public Set<KingdomPlayer> getMembers() {
        return new HashSet<>();
    }

    public Nation getNation() {
        return null;
    }

    public KingdomRelation getRelationWith(Kingdom other) {
        return null;
    }
}
