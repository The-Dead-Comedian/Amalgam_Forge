package com.dead_comedian.amalgam.entity.living;

import com.dead_comedian.amalgam.registry.AmalgamEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

public class SpreaderEntity extends Zombie {
    public SpreaderEntity(EntityType<? extends SpreaderEntity> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static boolean checkHuskSpawnRules(EntityType<Husk> pHusk, ServerLevelAccessor pLevel, MobSpawnType pSpawnType, BlockPos pPos, RandomSource pRandom) {
        return checkMonsterSpawnRules(pHusk, pLevel, pSpawnType, pPos, pRandom) && (pSpawnType == MobSpawnType.SPAWNER || pLevel.canSeeSky(pPos));
    }

    protected boolean isSunSensitive() {
        return false;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.HUSK_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.HUSK_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.HUSK_DEATH;
    }

    protected SoundEvent getStepSound() {
        return SoundEvents.HUSK_STEP;
    }

    @Override
    public boolean hurt(DamageSource pSource, float pAmount) {
        int a = random.nextInt(20);

        if(a == 3 || a ==7){
            BlockPos blockPos = this.blockPosition();
            PufferEntity pufferEntity = new PufferEntity(AmalgamEntities.PUFFER.get(), this.level());
            this.level().addFreshEntity(pufferEntity);

            pufferEntity.moveTo(blockPos, pufferEntity.getYRot(), pufferEntity.getXRot());
        }
        if(a == 15 ){
            BlockPos blockPos = this.blockPosition();
            PodlingEntity podlingEntity = new PodlingEntity(AmalgamEntities.PODLING.get(), this.level());
            this.level().addFreshEntity(podlingEntity);

            podlingEntity.moveTo(blockPos, podlingEntity.getYRot(), podlingEntity.getXRot());
        }

        return super.hurt(pSource, pAmount);
    }

    protected ItemStack getSkull() {
        return ItemStack.EMPTY;
    }


    public void setBaby(boolean pChildZombie) {
     

    }
}
