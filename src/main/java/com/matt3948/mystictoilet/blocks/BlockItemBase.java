package com.matt3948.mystictoilet.blocks;

import com.matt3948.mystictoilet.mystictoilet;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(mystictoilet.TAB));
    }
}
