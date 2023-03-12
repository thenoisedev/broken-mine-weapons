
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snowstaff.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SnowStaffModTabs {
	public static CreativeModeTab TAB_BROKENMINDWEAPONS;

	public static void load() {
		TAB_BROKENMINDWEAPONS = new CreativeModeTab("tabbrokenmindweapons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SnowStaffModItems.SNOWSTAFF.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
