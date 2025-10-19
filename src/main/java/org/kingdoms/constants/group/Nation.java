package org.kingdoms.constants.group;

import org.kingdoms.constants.group.model.relationships.KingdomRelation;
import java.util.Set;
import java.util.HashSet;

/**
 * Stub class for Kingdoms - allows compilation without the actual dependency
 */
public class Nation {
    public Set<Kingdom> getKingdoms() {
        return new HashSet<>();
    }

    public KingdomRelation getRelationWith(Nation other) {
        return null;
    }
}
