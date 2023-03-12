
package net.mcreator.snowstaff.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.snowstaff.procedures.SnowstaffRangedItemUsedProcedure;
import net.mcreator.snowstaff.init.SnowStaffModTabs;

public class SnowstaffItem extends SwordItem {
	public SnowstaffItem() {
		super(new Tier() {
			public int getUses() {
				return 1080;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.SNOWBALL));
			}
		}, 3, -2.4f, new Item.Properties().tab(SnowStaffModTabs.TAB_BROKENMINDWEAPONS));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		SnowstaffRangedItemUsedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}
}
