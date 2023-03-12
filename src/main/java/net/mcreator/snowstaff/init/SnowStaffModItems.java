
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snowstaff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.snowstaff.item.WolfStaffItem;
import net.mcreator.snowstaff.item.ThepillItem;
import net.mcreator.snowstaff.item.SnowstaffItem;
import net.mcreator.snowstaff.item.PowerPillowItem;
import net.mcreator.snowstaff.item.MetalPipeItem;
import net.mcreator.snowstaff.item.HambatItem;
import net.mcreator.snowstaff.SnowStaffMod;

public class SnowStaffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SnowStaffMod.MODID);
	public static final RegistryObject<Item> HAMBAT = REGISTRY.register("hambat", () -> new HambatItem());
	public static final RegistryObject<Item> SNOWSTAFF = REGISTRY.register("snowstaff", () -> new SnowstaffItem());
	public static final RegistryObject<Item> THEPILL = REGISTRY.register("thepill", () -> new ThepillItem());
	public static final RegistryObject<Item> POWER_PILLOW = REGISTRY.register("power_pillow", () -> new PowerPillowItem());
	public static final RegistryObject<Item> WOLF_STAFF = REGISTRY.register("wolf_staff", () -> new WolfStaffItem());
	public static final RegistryObject<Item> METAL_PIPE = REGISTRY.register("metal_pipe", () -> new MetalPipeItem());
}
