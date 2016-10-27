package net.minecraft.src;

public class RecipesArmor
{
    private String recipePatterns[][] =
    {
        {
            "XXX", "X X"
        }, {
            "X X", "XXX", "XXX"
        }, {
            "XXX", "X X", "X X"
        }, {
            "X X", "X X"
        }
    };
    private Object recipeItems[][];

    public RecipesArmor()
    {
        recipeItems = (new Object[][]
                {
                    new Object[] {
                        Item.leather, mod_FemiCraft.IronNugget, mod_FemiCraft.DiamondNugget, Item.goldNugget
                    }, new Object[] {
                        Item.helmetLeather, Item.helmetSteel, Item.helmetDiamond, Item.helmetGold
                    }, new Object[] {
                        Item.plateLeather, Item.plateSteel, Item.plateDiamond, Item.plateGold
                    }, new Object[] {
                        Item.legsLeather, Item.legsSteel, Item.legsDiamond, Item.legsGold
                    }, new Object[] {
                        Item.bootsLeather, Item.bootsSteel, Item.bootsDiamond, Item.bootsGold
                    }
                });
    }

    /**
     * Adds the armor recipes to the CraftingManager.
     */
    public void addRecipes(CraftingManager par1CraftingManager)
    {
        for (int i = 0; i < recipeItems[0].length; i++)
        {
            Object obj = recipeItems[0][i];

            for (int j = 0; j < recipeItems.length - 1; j++)
            {
                Item item = (Item)recipeItems[j + 1][i];
                par1CraftingManager.addRecipe(new ItemStack(item), new Object[]
                        {
                            recipePatterns[j], 'X', obj
                        });
            }
        }
    }
}
