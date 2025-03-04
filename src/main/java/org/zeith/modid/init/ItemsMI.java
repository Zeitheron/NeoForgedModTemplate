package org.zeith.modid.init;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import org.zeith.hammerlib.annotations.*;
import org.zeith.modid.ModId;

@SimplyRegister
public interface ItemsMI
{
	@RegistryName("test")
	Item TEST_ITEM = ModId.MOD_TAB.add(new Item(new Item.Properties())
	{
		@Override
		public InteractionResult useOn(UseOnContext context)
		{
			System.out.println(context.getItemInHand());
			return InteractionResult.SUCCESS;
		}
	});
}