package net.minecraft.block;

import net.minecraft.block.material.Material;

public class BlockBase extends Block {

    public BlockBase(String name, Material material, float hardness, float resistanse, SoundType soundType) {

        super(material);

        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setHardness(hardness);
        this.setResistance(resistanse);
        this.setSoundType(soundType);
    }
}
