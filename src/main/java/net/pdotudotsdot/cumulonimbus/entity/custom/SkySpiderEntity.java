package net.pdotudotsdot.cumulonimbus.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.ArmadilloEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SkySpiderEntity extends HostileEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;


    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new SwimGoal(this));
        this.goalSelector.add(2, new FleeEntityGoal<>(this, ArmadilloEntity.class, 6.0F, 1.0, 1.2, entity -> !((ArmadilloEntity)entity).isNotIdle()));
        this.goalSelector.add(3, new PounceAtTargetGoal(this, 0.4F));
        this.goalSelector.add(4, new AttackGoal(this));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 0.8));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(6, new LookAroundGoal(this));
        this.targetSelector.add(1, new RevengeGoal(this));
        this.targetSelector.add(2, new SkySpiderEntity.TargetGoal<>(this, PlayerEntity.class));
        this.targetSelector.add(3, new SkySpiderEntity.TargetGoal<>(this, IronGolemEntity.class));

    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 16.0)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f)
                .add(EntityAttributes.GENERIC_FALL_DAMAGE_MULTIPLIER, 0.0f);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SPIDER_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_SPIDER_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_SPIDER_DEATH;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_SPIDER_STEP, 0.15F, 1.0F);
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout<=0) {
            this.idleAnimationTimeout = 0;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    public void tick() {
        super.tick();

        if (!this.getStatusEffects().contains(StatusEffects.SLOW_FALLING)) {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, -1, 0,true, false));
        }



        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
        }
    }


    @Override
    public boolean canHaveStatusEffect(StatusEffectInstance effect) {
        return !effect.equals(StatusEffects.POISON) && super.canHaveStatusEffect(effect);
    }

    public SkySpiderEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void slowMovement(BlockState state, Vec3d multiplier) {
        if (!state.isOf(Blocks.COBWEB)) {
            super.slowMovement(state, multiplier);
        }
    }

    static class AttackGoal extends MeleeAttackGoal {
        public AttackGoal(SkySpiderEntity SkySpider) {
            super(SkySpider, 1.0, true);
        }

        @Override
        public boolean canStart() {
            return super.canStart() && !this.mob.hasPassengers();
        }

        @Override
        public boolean shouldContinue() {
            if (this.mob.getRandom().nextInt(100) == 0) {
                this.mob.setTarget(null);
                return false;
            } else {
                return super.shouldContinue();
            }
        }
    }

    public static class SkySpiderData implements EntityData {
        @Nullable
        public RegistryEntry<StatusEffect> effect;

        public void setEffect(Random random) {
            this.effect = StatusEffects.SLOW_FALLING;
        }
    }

    static class TargetGoal<T extends LivingEntity> extends ActiveTargetGoal<T> {
        public TargetGoal(SkySpiderEntity SkySpider, Class<T> targetEntityClass) {
            super(SkySpider, targetEntityClass, true);
        }
    }
    public void onInitialize() {
        this.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, -1));
    }
}
