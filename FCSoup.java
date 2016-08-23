package net.minecraft.src;

public class FCSoup extends ItemFood
{
    public FCSoup(int par1, int par2)
    {
        super(par1, par2, false);
        setMaxStackSize(1);
    }

    public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        return new ItemStack(Item.bowlEmpty);
    }
}
