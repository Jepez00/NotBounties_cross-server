package com.massivecraft.factions;

import com.massivecraft.factions.struct.Relation;
import java.util.UUID;

/**
 * Stub class for Factions - allows compilation without the actual dependency
 */
public class Faction {
    public java.util.List<UUID> getMembers() {
        return new java.util.ArrayList<>();
    }

    public boolean isSystemFaction() {
        return false;
    }

    public boolean isWilderness() {
        return false;
    }

    public Rel getRelationTo(FPlayer other) {
        return null;
    }

    public Relation getRelationTo(Faction other) {
        return null;
    }

    public String getId() {
        return "";
    }
}
