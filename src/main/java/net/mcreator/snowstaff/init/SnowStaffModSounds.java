
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snowstaff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.snowstaff.SnowStaffMod;

public class SnowStaffModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SnowStaffMod.MODID);
	public static final RegistryObject<SoundEvent> METAL_PIPE_RIGHT_CLICK = REGISTRY.register("metal_pipe_right_click", () -> new SoundEvent(new ResourceLocation("snow_staff", "metal_pipe_right_click")));
}
