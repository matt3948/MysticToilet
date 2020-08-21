package com.matt3948.mystictoilet.util;

import com.matt3948.mystictoilet.blocks.BlockItemBase;
import com.matt3948.mystictoilet.blocks.MysticForgeStoneBlock;
import com.matt3948.mystictoilet.items.ItemBase;
import com.matt3948.mystictoilet.mystictoilet;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//All items, blocks, etc. in the registry
public class RegistryHandler {
    //Deferred Register can use items
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, mystictoilet.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, mystictoilet.MOD_ID);

    //Store register commands (registers all items)
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> MYSTIC_FORGE_STONE = ITEMS.register("mystic_forge_stone", ItemBase::new); //armor/weapon upgrades
    public static final RegistryObject<Item> PHILOSOPHERS_STONE = ITEMS.register("philosophers_stone", ItemBase::new); //used for increasing amount of items (maybe ender pearls?)
    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard", ItemBase::new); //???
    public static final RegistryObject<Item> MYSTIC_COIN = ITEMS.register("mystic_coin", ItemBase::new); //????
    public static final RegistryObject<Item> GLOB_OF_ECTOPLASM = ITEMS.register("glob_of_ectoplasm", ItemBase::new); //armor/weapons upgrades
    public static final RegistryObject<Item> MYSTIC_CRYSTAL = ITEMS.register("mystic_crystal", ItemBase::new); //armor/weapon upgrades
    //person's weapon, ? mystic forge stones, 5 glob of ectos, 10 mystic crystals - person's armor, ? mystic forge stones, 5 glob of ectos, 10 mystic crystals

    //Blocks (thing that is placed on the ground)
    public static final RegistryObject<Block> MYSTIC_FORGE_STONE_BLOCK = BLOCKS.register("mystic_forge_stone_block", MysticForgeStoneBlock::new);

    //Block Items (thing you hold in your hand)
    public static final RegistryObject<Item> MYSTIC_FORGE_STONE_BLOCK_ITEM = ITEMS.register("mystic_forge_stone_block", () -> new BlockItemBase(MYSTIC_FORGE_STONE_BLOCK.get()));

}
