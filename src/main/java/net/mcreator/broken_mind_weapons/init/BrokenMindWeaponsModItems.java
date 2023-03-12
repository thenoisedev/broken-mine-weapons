
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.broken_mind_weapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.broken_mind_weapons.item.WolfStaffItem;
import net.mcreator.broken_mind_weapons.item.ThepillItem;
import net.mcreator.broken_mind_weapons.item.SnowstaffItem;
import net.mcreator.broken_mind_weapons.item.PowerPillowItem;
import net.mcreator.broken_mind_weapons.item.PeashooterItem;
import net.mcreator.broken_mind_weapons.item.MetalPipeItem;
import net.mcreator.broken_mind_weapons.item.HambatItem;
import net.mcreator.broken_mind_weapons.BrokenMindWeaponsMod;

public class BrokenMindWeaponsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BrokenMindWeaponsMod.MODID);
	public static final RegistryObject<Item> HAMBAT = REGISTRY.register("hambat", () -> new HambatItem());
	public static final RegistryObject<Item> SNOWSTAFF = REGISTRY.register("snowstaff", () -> new SnowstaffItem());
	public static final RegistryObject<Item> THEPILL = REGISTRY.register("thepill", () -> new ThepillItem());
	public static final RegistryObject<Item> POWER_PILLOW = REGISTRY.register("power_pillow", () -> new PowerPillowItem());
	public static final RegistryObject<Item> WOLF_STAFF = REGISTRY.register("wolf_staff", () -> new WolfStaffItem());
	public static final RegistryObject<Item> METAL_PIPE = REGISTRY.register("metal_pipe", () -> new MetalPipeItem());
	public static final RegistryObject<Item> PEASHOOTER = REGISTRY.register("peashooter", () -> new PeashooterItem());
}
