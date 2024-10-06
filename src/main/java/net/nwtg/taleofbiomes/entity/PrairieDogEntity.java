
package net.nwtg.taleofbiomes.entity;

import net.nwtg.taleofbiomes.procedures.PrairieDogWanderAIConditionProcedure;
import net.nwtg.taleofbiomes.procedures.PrairieDogOnInitialEntitySpawnProcedure;
import net.nwtg.taleofbiomes.procedures.PrairieDogOnEntityTickUpdateProcedure;
import net.nwtg.taleofbiomes.procedures.PrairieDogLookAIConditionProcedure;
import net.nwtg.taleofbiomes.procedures.PrairieDogEntityIsHurtProcedure;
import net.nwtg.taleofbiomes.init.TaleOfBiomesModEntities;

import net.neoforged.neoforge.event.entity.SpawnPlacementRegisterEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

public class PrairieDogEntity extends PathfinderMob {
	public static final EntityDataAccessor<String> DATA_animation = SynchedEntityData.defineId(PrairieDogEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<Integer> DATA_animationTime = SynchedEntityData.defineId(PrairieDogEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_animationTimeDefault = SynchedEntityData.defineId(PrairieDogEntity.class, EntityDataSerializers.INT);

	public PrairieDogEntity(EntityType<PrairieDogEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_animation, "normal");
		builder.define(DATA_animationTime, 0);
		builder.define(DATA_animationTimeDefault, 600);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new PanicGoal(this, 1.2) {
			@Override
			public boolean canUse() {
				double x = PrairieDogEntity.this.getX();
				double y = PrairieDogEntity.this.getY();
				double z = PrairieDogEntity.this.getZ();
				Entity entity = PrairieDogEntity.this;
				Level world = PrairieDogEntity.this.level();
				return super.canUse() && PrairieDogWanderAIConditionProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 10) {
			@Override
			public boolean canUse() {
				double x = PrairieDogEntity.this.getX();
				double y = PrairieDogEntity.this.getY();
				double z = PrairieDogEntity.this.getZ();
				Entity entity = PrairieDogEntity.this;
				Level world = PrairieDogEntity.this.level();
				return super.canUse() && PrairieDogLookAIConditionProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, LivingEntity.class, (float) 10) {
			@Override
			public boolean canUse() {
				double x = PrairieDogEntity.this.getX();
				double y = PrairieDogEntity.this.getY();
				double z = PrairieDogEntity.this.getZ();
				Entity entity = PrairieDogEntity.this;
				Level world = PrairieDogEntity.this.level();
				return super.canUse() && PrairieDogLookAIConditionProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = PrairieDogEntity.this.getX();
				double y = PrairieDogEntity.this.getY();
				double z = PrairieDogEntity.this.getZ();
				Entity entity = PrairieDogEntity.this;
				Level world = PrairieDogEntity.this.level();
				return super.canUse() && PrairieDogWanderAIConditionProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new FloatGoal(this));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.rabbit.ambient"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.rabbit.jump")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.rabbit.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.rabbit.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		Entity sourceentity = damagesource.getEntity();
		Entity immediatesourceentity = damagesource.getDirectEntity();

		PrairieDogEntityIsHurtProcedure.execute(entity);
		return super.hurt(damagesource, amount);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
		PrairieDogOnInitialEntitySpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putString("Dataanimation", this.entityData.get(DATA_animation));
		compound.putInt("DataanimationTime", this.entityData.get(DATA_animationTime));
		compound.putInt("DataanimationTimeDefault", this.entityData.get(DATA_animationTimeDefault));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Dataanimation"))
			this.entityData.set(DATA_animation, compound.getString("Dataanimation"));
		if (compound.contains("DataanimationTime"))
			this.entityData.set(DATA_animationTime, compound.getInt("DataanimationTime"));
		if (compound.contains("DataanimationTimeDefault"))
			this.entityData.set(DATA_animationTimeDefault, compound.getInt("DataanimationTimeDefault"));
	}

	@Override
	public void baseTick() {
		super.baseTick();
		PrairieDogOnEntityTickUpdateProcedure.execute(this);
	}

	public static void init(SpawnPlacementRegisterEvent event) {
		event.register(TaleOfBiomesModEntities.PRAIRIE_DOG.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8), SpawnPlacementRegisterEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		return builder;
	}
}
