package com.matt3948.mystictoilet.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GlobOfEctoplasmBlock extends Block {
    public GlobOfEctoplasmBlock() {
        super(Block.Properties.create(Material.ORGANIC)
                .hardnessAndResistance(0.0f,0.0f)
                .sound(SoundType.SLIME)
                .harvestLevel(0)
                .jumpFactor(3)
        );
    }
}
