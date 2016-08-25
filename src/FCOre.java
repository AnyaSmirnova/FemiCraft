package net.minecraft.src;

import java.util.Random;

public class FCOre extends Block
{
        public FCOre(int par1, int par2)
        {
                super(par1, par2, Material.rock);
        }

        public int quantityDropped(int par1)
        {
                return (1);
        }
		
public int idDropped(int par1, Random par2Random, int par3)
{
	 return mod_FemiCraft.DirtySalt.shiftedIndex;
}
}