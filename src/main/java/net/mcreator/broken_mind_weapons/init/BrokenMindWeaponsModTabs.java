
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.broken_mind_weapons.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BrokenMindWeaponsModTabs {
	public static CreativeModeTab TAB_BROKENMINDWEAPONS;

	public static void load() {
		TAB_BROKENMINDWEAPONS = new CreativeModeTab("tabbrokenmindweapons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BrokenMindWeaponsModItems.POWER_PILLOW.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
