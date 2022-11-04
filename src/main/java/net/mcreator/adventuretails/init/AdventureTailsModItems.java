
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.adventuretails.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.adventuretails.item.GlitchSwordItem;
import net.mcreator.adventuretails.item.GlitchOreItem;
import net.mcreator.adventuretails.item.GlitchArmourItem;
import net.mcreator.adventuretails.item.FireswordItem;
import net.mcreator.adventuretails.item.FireBallItem;
import net.mcreator.adventuretails.item.FireArmourItem;
import net.mcreator.adventuretails.item.CaveStrokeItem;
import net.mcreator.adventuretails.AdventureTailsMod;

public class AdventureTailsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AdventureTailsMod.MODID);
	public static final RegistryObject<Item> FIREG_OLEM = REGISTRY.register("fireg_olem_spawn_egg",
			() -> new ForgeSpawnEggItem(AdventureTailsModEntities.FIREG_OLEM, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FIRE_ARMOUR_HELMET = REGISTRY.register("fire_armour_helmet", () -> new FireArmourItem.Helmet());
	public static final RegistryObject<Item> FIRE_ARMOUR_CHESTPLATE = REGISTRY.register("fire_armour_chestplate",
			() -> new FireArmourItem.Chestplate());
	public static final RegistryObject<Item> FIRE_ARMOUR_LEGGINGS = REGISTRY.register("fire_armour_leggings", () -> new FireArmourItem.Leggings());
	public static final RegistryObject<Item> FIRE_ARMOUR_BOOTS = REGISTRY.register("fire_armour_boots", () -> new FireArmourItem.Boots());
	public static final RegistryObject<Item> FIRESWORD = REGISTRY.register("firesword", () -> new FireswordItem());
	public static final RegistryObject<Item> FIRE_BALL = REGISTRY.register("fire_ball", () -> new FireBallItem());
	public static final RegistryObject<Item> CAVE_STROKE = REGISTRY.register("cave_stroke", () -> new CaveStrokeItem());
	public static final RegistryObject<Item> BLOB = REGISTRY.register("blob_spawn_egg",
			() -> new ForgeSpawnEggItem(AdventureTailsModEntities.BLOB, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BLUE_WATERBOSS = REGISTRY.register("blue_waterboss_spawn_egg",
			() -> new ForgeSpawnEggItem(AdventureTailsModEntities.BLUE_WATERBOSS, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GLITCH_SWORD = REGISTRY.register("glitch_sword", () -> new GlitchSwordItem());
	public static final RegistryObject<Item> GLITCH_INGOT = REGISTRY.register("glitch_ingot", () -> new GlitchOreItem());
	public static final RegistryObject<Item> G_LITCHE_MINE = block(AdventureTailsModBlocks.G_LITCHE_MINE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GLITCH_ARMOUR_HELMET = REGISTRY.register("glitch_armour_helmet", () -> new GlitchArmourItem.Helmet());
	public static final RegistryObject<Item> GLITCH_ARMOUR_CHESTPLATE = REGISTRY.register("glitch_armour_chestplate",
			() -> new GlitchArmourItem.Chestplate());
	public static final RegistryObject<Item> GLITCH_ARMOUR_LEGGINGS = REGISTRY.register("glitch_armour_leggings",
			() -> new GlitchArmourItem.Leggings());
	public static final RegistryObject<Item> GLITCH_ARMOUR_BOOTS = REGISTRY.register("glitch_armour_boots", () -> new GlitchArmourItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
