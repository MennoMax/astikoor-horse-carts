package de.mennomax.astikorcarts.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

public interface PlowExecutor {
    void tillBlock(final PlayerEntity player, final BlockPos pos);
}
