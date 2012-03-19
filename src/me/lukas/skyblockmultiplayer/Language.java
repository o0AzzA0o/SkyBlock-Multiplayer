package me.lukas.skyblockmultiplayer;

public enum Language {

	MSGS_SKYBLOCK("msgs.skyblock", "Use \"/skyblock help\" for more information."),
	MSGS_STOPPING("msgs.stopping", "Stopping SkyBlock..."),
	MSGS_PLAYERSINSB("msgs.playersInSb", "There are players in SkyBlock. SkyBlock can not be disabled!"),
	MSGS_ISNOWOFFLINE("msgs.isNowOffline", "SkyBlock is now offline."),
	MSGS_ISOFFLINE("msgs.isOffline", "SkyBlock is offline."),
	MSGS_ERROROCCURED("msgs.errorOccured", "An error occurred."),
	MSGS_STARTING("msgs.starting", "Starting SkyBlock..."),
	MSGS_ISNOWONLINE("msgs.isNowOnline", "SkyBlock is now online."),
	MSGS_MUSTBEOFFLINE("msgs.mustBeOffline", "SkyBlock must be offline before you can reset it."),
	MSGS_RESETING("msgs.reseting", "Reseting SkyBlock..."),
	MSGS_ISNOWRESETED("msgs.isNowReseted", "SkyBlock has been reseted."),
	MSGS_CONFIGRELOADED("msgs.configReloaded", "Config has been reloaded."),
	MSGS_LANGUAGERELOADED("msgs.languageReloaded", "Language has been reloaded."),
	MSGS_LANGUAGECHANGED("msgs.languageChanged", "Language has been changed."),
	MSGS_LANGUAGENOTCHANGED("msgs.languageNotChanged", "Language has not been changed."),
	MSGS_LANGUAGEFILENOTEXISTS("msgs.languageFileNotExists", "Language file does not exists."),
	MSGS_NOTAUTHORIZED("msgs.notAuthorized", "You are not authorized!"),
	MSGS_PVP_NOW_ON("msgs.pvpNowOn", "PvP is now on."),
	MSGS_PVP_NOW_OFF("msgs.pvpNowOff", "PvP is now off."),
	MSGS_STATUSOFFLINE("msgs.statusOffline", "Is Offline"),
	MSGS_STATUSONLINE("msgs.statusOnline", "Is Online."),
	MSGS_NUMBEROFISLANDS("msgs.numberOfIslands", "Number of islands: "),
	MSGS_NUMBEROFPLAYERS("msgs.numberOfPlayers", "Number of players: "),
	/**commands list**/
	MSGS_CMDJOIN("msgs.commands.join", "/skyblock join - join SkyBlock"),
	MSGS_CMDSTART("msgs.commands.start", "/skyblock start - get an island"),
	MSGS_CMDLEAVE("msgs.commands.leave", "/skyblock leave - leave SkyBlock"),
	MSGS_CMDNEWISLAND("msgs.commands.newIsland", "/skyblock newIsland [player] - give yourself or an other player a new island"),
	MSGS_CMDSETOFFLINE("msgs.commands.setOffline", "/skyblock set offline - deactivate SkyBlock"),
	MSGS_CMDSETONLINE("msgs.commands.setOnline", "/skyblock set online - activate SkyBlock"),
	MSGS_CMDSETLANGUAGE("msgs.commands.setLanguage", "/skyblock set language <language> - change language"),
	MSGS_CMDSETPVP("msgs.commands.setPVP", "/skyblock set PvP <option> - <on> or <off>"),
	MSGS_CMDRESET("msgs.commands.reset", "/skyblock reset - reset SkyBlock"),
	MSGS_CMDRELOADCONFIG("msgs.commands.reloadConfig", "/skyblock reload config - reload config"),
	MSGS_CMDRELOADLANGUAGE("msgs.commands.reloadLanguage", "/skyblock reload language - reload language"),
	MSGS_CMDSTATUS("msgs.commands.status", "/skyblock status - show status"),
	/**end of commands**/
	MSGS_WRONGARGS("msgs.wrongArgs", "Incorrect or missing arguments"),
	MSGS_WELCOME1("msgs.welcome1", "Welcome to the world SkyBlock for multiplayer! At the moment there are "),
	MSGS_WELCOME2("msgs.welcome2", " islands and  "),
	MSGS_WELCOME3("msgs.welcome3", " players. Use \"/skyblock start\" to get an own island."),
	MSGS_HADAISLAND("msgs.hadAIsland", "You already had an island."),
	MSGS_WELCOMEBACK("msgs.welcomeBack", "Welcome back "),
	MSGS_WELCOMEBROADCAST1("msgs.welcomeBroadcast1", "The player "),
	MSGS_WELCOMEBROADCAST2("msgs.welcomeBroadcast2", " has joined the SkyBlock game."),
	MSGS_TONEWPLAYER("msgs.toNewPlayer", "Do not fall and make no obsidian :-)."),
	MSGS_showIslandNumber("msgs.showIslandNumber", "You are on island number "),
	MSGS_LEFTSKYBLOCK("msgs.leftSkyblock", "You left SkyBlock."),
	MSGS_NOEMPTYINVENTORYLEAVE("msgs.noEmptyInventoryLeave", "You cannot leave skyblock with content in your inventory."),
	MSGS_NOEMPTYINVENTORYSTART("msgs.noEmptyInventoryStart", "You can not play with content in your inventory."),
	MSGS_WRONEPLAYERNAME("msgs.wrongPlayerName", "There is no player with that name. Or the player is not in SkyBlock."),
	MSGS_NEWISLANDPLAYER1("msgs.newIslandPlayer1", "The player "),
	MSGS_NEWISLANDPLAYER2("msgs.newIslandPlayer2", " has a new island."),
	MSGS_GOTNEWISLAND1("msgs.gotNewIsland1", "The player "),
	MSGS_GOTNEWISLAND2("msgs.gotNewIsland2", " has given you a new island."),
	MSGS_SIGN1LINE1("msgs.sign1Line1", "Welcome to"),
	MSGS_SIGN1LINE2("msgs.sign1Line2", "SkyBlock-"),
	MSGS_SIGN1LINE3("msgs.sign1Line3", "Multiplayer"),
	MSGS_SIGN2LINE1("msgs.sign2Line1", "For more"),
	MSGS_SIGN2LINE2("msgs.sign2Line2", "informations"),
	MSGS_SIGN2LINE3("msgs.sign2Line3", "/skyblock help"),
	MSGS_SIGN2LINE4("msgs.sign2Line4", "Good luck!"),
	MSGS_PLAYERDIED1("msgs.playerDied1", "One player died. There are "),
	MSGS_PLAYERDIED2("msgs.playerDied2", " players remaining."),
	MSGS_PLAYERWINBROADCAST1("msgs.playerWinBroadcast1", "The player "),
	MSGS_PLAYERWINBROADCAST2("msgs.playerWinBroadcast2", " won the game. Congratulations!"),
	MSGS_NONAME("msgs.noName", "No player with this name exists."),
	MSGS_BETTERSPECIFY("msgs.betterSpecify", "There are more players that begin with this name."),
	MSGS_GAMEMODECHANGED("msgs.gameModeChanged", "Game mode has been changed."),
	MSGS_FRIENDREMOVED("msgs.friendRemoved", "Friend removed"),
	MSGS_FRIENDADDED("msgs.friendAdded", "Friend added"),
	MSGS_NOTFRIENDFROMYOU("msgs.notFriendFromYou", "Not possible, you are not in the players home list!"),
	MSGS_SOMEONEADDEDYOU("msgs.playerAddedYou", " added you to his friend list."),
	MSGS_ISNOWCLOSED("msgs.isNowClosed", "SkyBlock is now closed."),
	MSGS_ISNOWOPENED("msgs.isOpened", "SkyBlock is now open."),
	MSGS_ISCLOSED("msgs.isNowClosed", "SkyBlock is closed."),
	MSGS_ISOPENED("msgs.isOpened", "SkyBlock is open."),
	MSGS_AREABORDERS("msgs.areaBorders", "Protected area or protected borders.");

	public String path;
	public String sentence;

	private Language(String path, String sentence) {
		this.path = path;
		this.sentence = sentence;
	}
}
