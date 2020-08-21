package com.matt3948.mystictoilet.util;

import com.matt3948.mystictoilet.items.ItemBase;
import com.matt3948.mystictoilet.mystictoilet;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//All items, blocks, etc. in the registry
public class RegistryHandler {
    //Deferred Register can use items
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, mystictoilet.MOD_ID);

    //Store register commands (registers all items)
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> MysticForgeStone = ITEMS.register("mystic_forge_stone", ItemBase::new); //armor/weapon upgrades
    public static final RegistryObject<Item> PhilosophersStone = ITEMS.register("philosophers_stone", ItemBase::new); //used for increasing amount of items (maybe ender pearls?)
    public static final RegistryObject<Item> ObsidianShard = ITEMS.register("obsidian_shard", ItemBase::new); //???
    public static final RegistryObject<Item> MysticCoin = ITEMS.register("mystic_coin", ItemBase::new); //????
    public static final RegistryObject<Item> GlobOfEctoplasm = ITEMS.register("glob_of_ectoplasm", ItemBase::new); //armor/weapons upgrades
    public static final RegistryObject<Item> MysticCrystal = ITEMS.register("mystic_crystal", ItemBase::new); //armor/weapon upgrades

    //Items for upgrading equipment
    //person's weapon, ? mystic forge stones, 5 glob of ectos, 10 mystic crystals
    //person's armor, ? mystic forge stones, 5 glob of ectos, 10 mystic crystals
    //
}
