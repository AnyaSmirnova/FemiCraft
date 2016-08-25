package net.minecraft.src;

public class FCJuice extends ItemBucketMilk
{
    public FCJuice(int par1)
    {
        super(par1);
        setMaxStackSize(1);
    }
	
	public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		par1ItemStack.stackSize--;
		
        if (par1ItemStack.stackSize <= 0)
        {
            return new ItemStack(Item.glassBottle);
        }
        else
        {
            return par1ItemStack;
        }
    }
}