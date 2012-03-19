package me.lukas.skyblockmultiplayer.listeners;

import me.lukas.skyblockmultiplayer.Data;
import me.lukas.skyblockmultiplayer.Permissions;
import me.lukas.skyblockmultiplayer.PlayerInfo;
import me.lukas.skyblockmultiplayer.SkyBlockMultiplayer;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

public class PlayerUseBucketListener implements Listener {

	SkyBlockMultiplayer plugin;

	public PlayerUseBucketListener(SkyBlockMultiplayer instance) {
		this.plugin = instance;
	}

	@EventHandler
	public void onPlayerBucketEmpty(PlayerBucketEmptyEvent event) {
		Player player = event.getPlayer();
		Block b = event.getBlockClicked();

		if (!Data.SKYBLOCK_ONLINE) {
			return;
		}

		if (player.getWorld().equals(SkyBlockMultiplayer.getSkyBlockWorld())) { // Check if player is in world SkyBlockMultiplayer
			return;
		}

		if (Permissions.SKYBLOCK_BUILD.has(player)) {
			return;
		}

		if (event.getPlayer().getLocation().getBlockX() >= -20 && event.getPlayer().getLocation().getBlockX() <= 20) {
			if (event.getPlayer().getLocation().getBlockZ() >= -20 && event.getPlayer().getLocation().getBlockZ() <= 20) {
				event.setCancelled(true);
				return;
			}
		}

		if (Data.GAMEMODE_SELECTED == Data.GAMEMODE.PVP) {
			return;
		}

		if (Data.GAMEMODE_SELECTED == Data.GAMEMODE.BUILD) {
			if (Data.BUILD_WITHPROTECTEDAREA) {
				PlayerInfo pi = Data.PLAYERS.get(player.getName());
				if (pi == null) {
					return;
				}

				PlayerInfo owner = this.getOwner(b.getLocation());
				if (owner == null) {
					if (this.canPlayerDoThat(pi, b.getLocation())) {
						return;
					}
					event.setCancelled(true);
					return;
				}

				if (owner.getPlayerName().equalsIgnoreCase(player.getName())) {
					return;
				}

				if (owner.getFriends().contains(player.getName())) {
					return;
				}
				event.setCancelled(true);
				return;
			}
		}
	}

	private boolean canPlayerDoThat(PlayerInfo pi, Location l) {
		int islandX = pi.getIslandLocation().getBlockX();
		int islandZ = pi.getIslandLocation().getBlockZ();

		int blockX = l.getBlockX();
		int blockZ = l.getBlockZ();

		int dist = Data.ISLAND_DISTANCE / 2 - 3;

		if (islandX + dist >= blockX && islandX - dist <= blockX) {
			if (islandZ + dist >= blockZ && islandZ - dist <= blockZ) {
				return true;
			}
		}
		return false;
	}

	private PlayerInfo getOwner(Location l) {
		for (PlayerInfo pi : Data.PLAYERS.values()) {
			int islandX = pi.getIslandLocation().getBlockX();
			int islandZ = pi.getIslandLocation().getBlockZ();

			int blockX = l.getBlockX();
			int blockZ = l.getBlockZ();

			int dist = (Data.ISLAND_DISTANCE / 2) - 3;

			if (islandX + dist >= blockX && islandX - dist <= blockX) {
				if (islandZ + dist >= blockZ && islandZ - dist <= blockZ) {
					return pi;
				}
			}
		}
		return null;
	}
}
