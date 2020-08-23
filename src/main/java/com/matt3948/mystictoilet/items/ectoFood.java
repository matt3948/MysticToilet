package com.matt3948.mystictoilet.items;

import com.matt3948.mystictoilet.mystictoilet;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ectoFood extends Item {
    public ectoFood() {
        super(new Item.Properties()
            .group(mystictoilet.TAB)
            .food(new Food.Builder()
                    .hunger(4)
                    .saturation(1.2f)
                    .effect(new EffectInstance(Effects.ABSORPTION,100,1),1)
                    .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 100, 1),1)
                    .effect(new EffectInstance(Effects.NIGHT_VISION, 1000, 1),1)
                    .effect(new EffectInstance(Effects.SLOW_FALLING,100,1),1)
                    .setAlwaysEdible()
                    .build())
        );
    }
}
