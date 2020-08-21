package com.matt3948.mystictoilet.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MysticForgeStructureBlock extends Block {
    public MysticForgeStructureBlock() {
        super(Block.Properties.create(Material.GLASS)
                .hardnessAndResistance(2.5f,1.0f)
                .sound(SoundType.GLASS)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
