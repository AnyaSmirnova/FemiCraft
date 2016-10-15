package net.minecraft.src;

public enum EnumArmorMaterial
{
    CLOTH(5, new int[] {
        0, 0, 0, 0
    }, 15),
    CHAIN(5, new int[] {
        0, 0, 0, 0
    }, 12),
    IRON(5, new int[] {
        0, 0, 0, 0
    }, 9),
    GOLD(5, new int[] {
        0, 0, 0, 0
    }, 25),
    DIAMOND(5, new int[] {
        0, 0, 0, 0
    }, 10);

    /**
     * Holds the maximum damage factor (each piece multiply this by it's own value) of the material, this is the item
     * damage (how much can absorb before breaks)
     */
    private int maxDamageFactor;
    private int damageReductionAmountArray[];

    /** Return the enchantability factor of the material */
    private int enchantability;

    private EnumArmorMaterial(int par3, int par4ArrayOfInteger[], int par5)
    {
        maxDamageFactor = par3;
        damageReductionAmountArray = par4ArrayOfInteger;
        enchantability = par5;
    }

    /**
     * Returns the durability for a armor slot of for this type.
     */
    public int getDurability(int par1)
    {
        return ItemArmor.getMaxDamageArray()[par1] * maxDamageFactor;
    }

    /**
     * Return the damage reduction (each 1 point is a half a shield on gui) of the piece index passed (0 = helmet, 1 =
     * plate, 2 = legs and 3 = boots)
     */
    public int getDamageReductionAmount(int par1)
    {
        return damageReductionAmountArray[par1];
    }

    /**
     * Return the enchantability factor of the material.
     */
    public int getEnchantability()
    {
        return enchantability;
    }
}
