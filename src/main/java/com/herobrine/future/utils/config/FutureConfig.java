package com.herobrine.future.utils.config;

import com.herobrine.future.FutureJava;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Ignore;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.Type;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = FutureJava.MODID, name = FutureConfig.CONFIG_NAME)
public class FutureConfig {
    private static final String MODID = "future-mc";
    static final String CONFIG_NAME = MODID + "/" + MODID;
    @Name("General")
    @Comment("Most config options for the mod are found here.")
    public static General a = new General();

    @Name("Flowers")
    @Comment("Config options related to the new flowers are found here.")
    public static Flowers b = new Flowers();

    @Name("Developer")
    @Comment({"Developer options. Features that are incomplete are found here.",
            "These options can crash your game and may corrupt your worlds, so make " +
            "sure that you backup your worlds before enabling these options."})
    public static Developer c = new Developer();

    @Name("New Config Alert")
    @Comment("Whether the game alerts the user about this new config")
    //
    public static boolean newconfigalert = false;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        //if(event.getModID().equals(FutureJava.MODID)) {
            ConfigManager.sync(FutureJava.MODID, Type.INSTANCE);
        //}
    }

    public static class General {
        @Name("Trident")
        @Comment("Whether the Trident weapon is added to the game.")
        public boolean trident = true;

        @Name("Lantern")
        @Comment("Whether the Lantern block is added to the game.")
        public boolean lantern = true;

        @Name("Stonecutter")
        @Comment({"Whether the Stonecutter block is added to the game.",
                "This block is decorative. If you would like to enable functionality,",
                "go to the 'c' section of this config."})
        public boolean stonecutter = true;

        @Name("Loom")
        @Comment({"Whether the Loom block is added to the game.",
                "This block is decorative only."})
        public boolean loom = true;

        @Name("Barrel")
        @Comment("Whether the Barrel storage block is added to the game.")
        public boolean barrel = true;

        @Name("Berry Bush")
        @Comment({"Whether the Berry Bush is added to the game.",
                "If disabled, sweetberries are also disabled."})
        public boolean berrybush = true;

        @Name("Berry Bush generates")
        @Comment("Whether the Berry Bush naturally generates in the world.")
        public boolean berrybushgen = true;

        @Name("Sweetberries")
        @Comment({"Whether the Sweetberry food is added to the game,",
                "and whether you can harvest the Berry Bush."})
        public boolean sweetberry = true;

        @Name("Campfire")
        @Comment("Whether the Campfire block is added to the game.")
        public boolean campfire = true;

        @Name("Campfire damage")
        @Comment("Whether the Campfire hurts you when you walk on it.")
        public boolean campfiredmg = true;

        @Name("New Wall Variants")
        @Comment("Whether the 1.14 Wall Variants are added.")
        public boolean newwallvariants = true;

        @Name("Stripped Logs")
        @Comment({"Whether stripped logs are added to the game, ",
                "and whether using an axe on a log will strip the log"})
        public boolean strippedlogs = true;

        @Ignore
        @Name("Old Stonecutter model")
        @Comment("Uses the old Minecraft PE model for the stonecutter. It will still have functionality though.")
        public boolean oldstonecutter = false;

        @Name("Smooth Stone")
        @Comment("Whether the smooth stone block is added to the game.")
        public boolean smoothstone = true;
    }

    public static class Flowers {
        @Name("Lily of the Valley")
        @Comment("Whether the Lily of the Valley flower is added to the game.")
        public boolean lily = true;

        @Name("Lily of the Valley generates")
        @Comment("Whether the Lily of the Valley flower naturally generates in the world.")
        public boolean lilygen = true;

        @Name("Cornflower")
        @Comment("Whether the Cornflower flower is added to the game.")
        public boolean cornflower = true;

        @Name("Cornflower generates")
        @Comment("Whether the Cornflower flower naturally generates in the world.")
        public boolean cornflowergen = true;

        @Name("Wither Rose")
        @Comment("Whether the Wither Rose flower is added to the game.")
        public boolean witherrose = true;

        @Name("Wither Rose Damage")
        @Comment("Whether the Wither Rose flower will deal damage when walked on.")
        public boolean witherrosedmg = true;

        @Name("New Dyes")
        @Comment("Whether the new dyes from 1.14 are added to the game.")
        public boolean dyes = true;

        @Name("Suspicious Stew")
        @Comment("Whether the Suspicious Stew item is added to the game.")
        public boolean suspiciousstew = true;

        @Name("Suspicious Stew effects")
        @Comment("Whether the Suspicious Stew item gives an effect when consumed.")
        public boolean suspicioussteweffect = true;
    }
    public static class Developer {
        //@Name("Trident is throwable")
        //@Comment({"If enabled, allows the Trident to be thrown.",
                //"This option is incomplete, and may not work properly."})
        //public boolean tridentthrow = false;

        @Name("Debug messages")
        @Comment({"When enabled, certain extra things will be printed to the log.", "This is an option that the author uses to test out the mod before publishing. You don't need this."})
        public boolean debug = false;

        //@Name("Stonecutter functions")
        //@Comment({"Rough version of stonecutter functionality. Shift click only crafts one by one, and not all recipes are added."})
        //public boolean stonecutterFunction = false;
    }
}