package de.mennomax.astikoorcarts.entity.ai;

import de.mennomax.astikoorcarts.capabilities.PullProvider;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIPullCart extends EntityAIBase
{
    private final EntityLiving living;

    public EntityAIPullCart(EntityLiving livingIn)
    {
        this.living = livingIn;
        this.setMutexBits(3);
    }

    @Override
    public boolean shouldExecute()
    {
        if (living.hasCapability(PullProvider.PULL, null))
        {
            return living.getCapability(PullProvider.PULL, null).getDrawn() != null;
        }
        return false;
    }
}
