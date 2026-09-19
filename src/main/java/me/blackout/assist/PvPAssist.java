package me.blackout.assist;

import net.fabricmc.api.ModInitializer;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PvPAssist implements ModInitializer {
	public static final String MOD_ID = "pvp-assist";
	public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);

	public static Minecraft mc;

	@Override
	public void onInitialize() {
		LOG.info("Initializing PvP Assist");

		mc = Minecraft.getInstance();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
