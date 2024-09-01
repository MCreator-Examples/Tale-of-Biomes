package net.nwtg.taleofbiomes.procedures;

import org.checkerframework.checker.units.qual.s;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SetPlayerTemperatureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Entity ePlayer = null;
		double nTemperature = 0;
		if (TaleOfBiomesModVariables.MapVariables.get(world).temperatureTimer == 20) {
			ePlayer = entity;
			SetPlayerHeightTemperatureModifierProcedure.execute(world, entity);
			SetPlayerBiomeTemperatureModifierProcedure.execute(world, entity);
			nTemperature = TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureC + ePlayer.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerHeightTemperature
					+ ePlayer.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerBiomeTemperature;
			if (world.isClientSide()) {
				{
					TaleOfBiomesModVariables.PlayerVariables _vars = ePlayer.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
					_vars.clientTemperatureC = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("##.#").format(nTemperature));
					_vars.syncPlayerVariables(ePlayer);
				}
				{
					TaleOfBiomesModVariables.PlayerVariables _vars = ePlayer.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
					_vars.clientTemperatureF = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new java.text.DecimalFormat("##.#").format(nTemperature * 1.8 + 32));
					_vars.syncPlayerVariables(ePlayer);
				}
			}
			if (!world.isClientSide()) {
				ePlayer.getPersistentData().putDouble("tobTemperatureC", new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##.#").format(nTemperature)));
				ePlayer.getPersistentData().putDouble("tobTemperatureF", new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##.#").format(nTemperature * 1.8 + 32)));
			}
		}
	}
}
