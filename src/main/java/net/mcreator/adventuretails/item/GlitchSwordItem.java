
package net.mcreator.adventuretails.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.adventuretails.procedures.GlitchSwordLivingEntityIsHitWithToolProcedure;

import java.util.List;

public class GlitchSwordItem extends SwordItem {
	public GlitchSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 99999;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 100008f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, 96f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		GlitchSwordLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"I\u0335\u030D\u0352\u031A\u035D\u0341\u0305\u0349\u0331\u0356\u0348\u0353\u0356t\u0337\u0307\u0312\u0360\u0316\u0345\u0349\u0325s\u0335\u0360\u0358\u035B\u033E\u0328\u0349\u0326\u032E\u0327\u0332 \u0337\u0313\u0310\u030B\u033D\u031A\u0355\u035A\u0317\u0318\u0326\u0322t\u0334\u0360\u030E\u0306\u034B\u0360\u0315\u031C\u0339\u033Ao\u0338\u0350\u0342\u035D\u0303\u0309\u031F\u0326o\u0335\u0302\u0313\u034D \u0338\u030E\u035D\u032E\u032Es\u0335\u0302\u031B\u0306\u033D\u035B\u031Ct\u0337\u0300\u035D\u0304\u0321\u0323\u034E\u033A\u0320r\u0334\u0350\u0344\u0360\u0351\u0355o\u0334\u0300\u0343\u0344\u031A\u030C\u0360\u033C\u031C\u0353\u0353n\u0337\u0342\u034C\u0319g\u0338\u030A\u030A\u0341\u034C\u0340\u0356"));
	}
}
