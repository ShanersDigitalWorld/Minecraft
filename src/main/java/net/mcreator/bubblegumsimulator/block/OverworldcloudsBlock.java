
package net.mcreator.bubblegumsimulator.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.bubblegumsimulator.itemgroup.BgsItemGroup;
import net.mcreator.bubblegumsimulator.BubbleGumSimulatorModElements;

import java.util.List;
import java.util.Collections;

@BubbleGumSimulatorModElements.ModElement.Tag
public class OverworldcloudsBlock extends BubbleGumSimulatorModElements.ModElement {
	@ObjectHolder("bubble_gum_simulator:overworldclouds")
	public static final Block block = null;
	public OverworldcloudsBlock(BubbleGumSimulatorModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(BgsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(-1, 3600000).lightValue(0));
			setRegistryName("overworldclouds");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
