
package net.mcreator.bubblegumsimulator.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.bubblegumsimulator.itemgroup.BgsItemGroup;
import net.mcreator.bubblegumsimulator.BubbleGumSimulatorModElements;

@BubbleGumSimulatorModElements.ModElement.Tag
public class Bgsst2Item extends BubbleGumSimulatorModElements.ModElement {
	@ObjectHolder("bubble_gum_simulator:bgsst_2")
	public static final Item block = null;
	public Bgsst2Item(BubbleGumSimulatorModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, BubbleGumSimulatorModElements.sounds.get(new ResourceLocation("bubble_gum_simulator:bgsst2")),
					new Item.Properties().group(BgsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("bgsst_2");
		}
	}
}
