package net.mcreator.broken_mind_weapons.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;

public class HambatToolInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
