package org.zeith.modid;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLModContainer;
import org.slf4j.*;
import org.zeith.hammerlib.api.items.CreativeTab;
import org.zeith.hammerlib.core.adapter.LanguageAdapter;
import org.zeith.hammerlib.core.init.ItemsHL;
import org.zeith.hammerlib.proxy.HLConstants;
import org.zeith.hammerlib.util.mcf.Resources;

@Mod(org.zeith.modid.ModId.MOD_ID)
public class ModId
{
	public static final Logger LOG = LoggerFactory.getLogger(org.zeith.modid.ModId.class);
	
	public static final String MOD_ID = "modid";
	
	@CreativeTab.RegisterTab
	public static final CreativeTab MOD_TAB = new CreativeTab(id("root"),
			builder -> builder
					.icon(() -> ItemsHL.COPPER_GEAR.getDefaultInstance())
					.withTabsBefore(HLConstants.HL_TAB.id())
	);
	
	public ModId(FMLModContainer container, IEventBus modEventBus, Dist dist)
	{
		LanguageAdapter.registerMod(MOD_ID);
	}
	
	public static ResourceLocation id(String path)
	{
		return Resources.location(MOD_ID, path);
	}
}