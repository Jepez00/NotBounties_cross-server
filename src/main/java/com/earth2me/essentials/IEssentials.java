package com.earth2me.essentials;

import org.bukkit.inventory.ItemStack;

/**
 * Stub interface for EssentialsX - allows compilation without the actual dependency
 */
public interface IEssentials {
    Worth getWorth();

    interface Worth {
        java.math.BigDecimal getPrice(IEssentials essentials, ItemStack stack);
    }
}
