package gregblockutils.Machines;

import gregblockutils.GregBlockUtils;
import gregblockutils.Recipes.GBRecipeMaps;
import gregicadditions.GregicAdditions;
import gregtech.api.GregTechAPI;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.render.Textures;
import net.minecraft.util.ResourceLocation;

public class GBTileEntities {
    public static CokeFluidHatch COKE_FLUID_HATCH ;
    public static CokeItemBus COKE_ITEM_BUS;
    public static CokeOven COKE_OVEN;

    public static SimpleMachineMetaTileEntity[] ELECTRIC_SIEVE = new SimpleMachineMetaTileEntity[8];
    public static SimpleMachineMetaTileEntity[] BEE_ATTRACTOR = new SimpleMachineMetaTileEntity[8];

    public static SteamPump STEAM_PUMP;
    public static SteamSieve STEAM_SIEVE;
    public static SteamMixer STEAM_MIXER;

    public static SteamRockBreaker STEAM_BREAKER;

    public static void init() {
        COKE_OVEN = GregTechAPI.registerMetaTileEntity(2500, new CokeOven(new ResourceLocation(GregicAdditions.MODID,"ga_coke_oven")));
        COKE_FLUID_HATCH = GregTechAPI.registerMetaTileEntity(2509, new CokeFluidHatch(new ResourceLocation(GregicAdditions.MODID,"ga_coke_fluid_hatch")));
        COKE_ITEM_BUS = GregTechAPI.registerMetaTileEntity(2508, new CokeItemBus(new ResourceLocation(GregicAdditions.MODID,"ga_coke_item_bus")));

        STEAM_MIXER = GregTechAPI.registerMetaTileEntity(2221, new SteamMixer(new ResourceLocation(GregicAdditions.MODID,"steam_mixer"), false));
        STEAM_SIEVE = GregTechAPI.registerMetaTileEntity(2749, new SteamSieve(location("sieve.steam"), false));

        ELECTRIC_SIEVE[0] = GregTechAPI.registerMetaTileEntity(2750, new SimpleMachineMetaTileEntity(location("sieve.lv"), GBRecipeMaps.SIEVE_RECIPES, Textures.SIFTER_OVERLAY, 1));
        ELECTRIC_SIEVE[1] = GregTechAPI.registerMetaTileEntity(2751, new SimpleMachineMetaTileEntity(location("sieve.mv"), GBRecipeMaps.SIEVE_RECIPES, Textures.SIFTER_OVERLAY, 2));
        ELECTRIC_SIEVE[2] = GregTechAPI.registerMetaTileEntity(2752, new SimpleMachineMetaTileEntity(location("sieve.hv"), GBRecipeMaps.SIEVE_RECIPES, Textures.SIFTER_OVERLAY, 3));
        ELECTRIC_SIEVE[3] = GregTechAPI.registerMetaTileEntity(2753, new SimpleMachineMetaTileEntity(location("sieve.ev"), GBRecipeMaps.SIEVE_RECIPES, Textures.SIFTER_OVERLAY, 4));
        ELECTRIC_SIEVE[4] = GregTechAPI.registerMetaTileEntity(2754, new SimpleMachineMetaTileEntity(location("sieve.iv"), GBRecipeMaps.SIEVE_RECIPES, Textures.SIFTER_OVERLAY, 5));
        ELECTRIC_SIEVE[5] = GregTechAPI.registerMetaTileEntity(2755, new SimpleMachineMetaTileEntity(location("sieve.luv"), GBRecipeMaps.SIEVE_RECIPES, Textures.SIFTER_OVERLAY, 6));
        ELECTRIC_SIEVE[6] = GregTechAPI.registerMetaTileEntity(2756, new SimpleMachineMetaTileEntity(location("sieve.zpm"), GBRecipeMaps.SIEVE_RECIPES, Textures.SIFTER_OVERLAY, 7));
        ELECTRIC_SIEVE[7] = GregTechAPI.registerMetaTileEntity(2757, new SimpleMachineMetaTileEntity(location("sieve.uv"), GBRecipeMaps.SIEVE_RECIPES, Textures.SIFTER_OVERLAY, 8));

        STEAM_PUMP = GregTechAPI.registerMetaTileEntity(2758, new SteamPump(location("pump.steam")));

        BEE_ATTRACTOR[0] = GregTechAPI.registerMetaTileEntity(2759, new SimpleMachineMetaTileEntity(location("attractor.lv"), GBRecipeMaps.ATTRACTOR_RECIPES, GBTextures.BEE_ATTRACTOR, 1));
        BEE_ATTRACTOR[1] = GregTechAPI.registerMetaTileEntity(2760, new SimpleMachineMetaTileEntity(location("attractor.mv"), GBRecipeMaps.ATTRACTOR_RECIPES, GBTextures.BEE_ATTRACTOR, 2));
        BEE_ATTRACTOR[2] = GregTechAPI.registerMetaTileEntity(2761, new SimpleMachineMetaTileEntity(location("attractor.hv"), GBRecipeMaps.ATTRACTOR_RECIPES, GBTextures.BEE_ATTRACTOR, 3));
        BEE_ATTRACTOR[3] = GregTechAPI.registerMetaTileEntity(2762, new SimpleMachineMetaTileEntity(location("attractor.ev"), GBRecipeMaps.ATTRACTOR_RECIPES, GBTextures.BEE_ATTRACTOR, 4));
        BEE_ATTRACTOR[4] = GregTechAPI.registerMetaTileEntity(2763, new SimpleMachineMetaTileEntity(location("attractor.iv"), GBRecipeMaps.ATTRACTOR_RECIPES, GBTextures.BEE_ATTRACTOR, 5));
        BEE_ATTRACTOR[5] = GregTechAPI.registerMetaTileEntity(2764, new SimpleMachineMetaTileEntity(location("attractor.luv"), GBRecipeMaps.ATTRACTOR_RECIPES, GBTextures.BEE_ATTRACTOR, 6));
        BEE_ATTRACTOR[6] = GregTechAPI.registerMetaTileEntity(2765, new SimpleMachineMetaTileEntity(location("attractor.zpm"), GBRecipeMaps.ATTRACTOR_RECIPES, GBTextures.BEE_ATTRACTOR, 7));
        BEE_ATTRACTOR[7] = GregTechAPI.registerMetaTileEntity(2766, new SimpleMachineMetaTileEntity(location("attractor.uv"), GBRecipeMaps.ATTRACTOR_RECIPES, GBTextures.BEE_ATTRACTOR, 8));

        STEAM_BREAKER = GregTechAPI.registerMetaTileEntity(2767, new SteamRockBreaker(location("rock_breaker.steam")));
    }

    private static ResourceLocation location(String name) {
        return new ResourceLocation(GregBlockUtils.MODID, name);
    }
}
