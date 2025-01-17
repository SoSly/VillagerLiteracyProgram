package org.sosly.vlp.mixins.entities.npc;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.level.Level;
import org.sosly.vlp.api.entity.IVillager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Villager.class)
public abstract class VillagerMixin implements IVillager {
    @Shadow protected abstract void updateTrades();

    @Unique
    public void vlp$UpdateTrades() {
        this.updateTrades();
    }
}
