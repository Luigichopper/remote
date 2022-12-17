
package net.mcreator.eternal.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class LettuceItem extends Item {

	public LettuceItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(2.4f)

						.build()));
	}

}
