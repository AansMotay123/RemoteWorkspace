
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.adventuretails.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.adventuretails.block.GLitcheMineBlock;
import net.mcreator.adventuretails.block.CaveStrokePortalBlock;
import net.mcreator.adventuretails.AdventureTailsMod;

public class AdventureTailsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AdventureTailsMod.MODID);
	public static final RegistryObject<Block> CAVE_STROKE_PORTAL = REGISTRY.register("cave_stroke_portal", () -> new CaveStrokePortalBlock());
	public static final RegistryObject<Block> G_LITCHE_MINE = REGISTRY.register("g_litche_mine", () -> new GLitcheMineBlock());
}
