package net.minecraft.src;

import java.util.*;

// Welcome in my code! @Anya_Smirnova
public class mod_FemiCraft extends BaseMod
        {

// Added items
public static final Item PigmanSword = (new ItemSword(203, EnumToolMaterial.HELL)).setItemName("PigmanSword");
public static final Item DirtySalt = new FCItem(5000).setItemName("DirtySalt");
public static final Item Salt = new ItemFood(5001, 1, 0.1F, false).setPotionEffect(Potion.harm.id, 1, 0, 0.2F).setItemName("Salt");
public static final Item ButterBottle = new FCBottle(5004).setItemName("ButterBottle");
public static final Item CutApple = new ItemFood(5005, 2, 0.1F, false).setItemName("CutApple");
public static final Item ScrambledEggs = new ItemFood(5006, 6, 0.6F, false).setItemName("ScrambledEggs");
public static final Item Chocolate = new ItemFood(5007, 3, 0.1F, false).setItemName("Chocolate");
public static final Item MilkBottle = new FCMilkBottle(5008).setItemName("MilkBottle");
public static final Item PumpkinPie = new ItemFood(5009, 8, 0.3F, false).setItemName("PumpkinPie");
public static final Item Potato = new ItemFood(5010, 1, 0.2F, false).setItemName("Potato");
public static final Item PoisonousPotato = new ItemFood(5011, 2, 0.4F, false).setPotionEffect(Potion.poison.id, 4, 0, 0.6F).setItemName("PoisonousPotato");
public static final Item BakedPotato = new ItemFood(5012, 6, 0.6F, false).setItemName("BakedPotato");
public static final Item Carrot = new ItemFood(5013, 3, 0.3F, false).setItemName("Carrot");
public static final Item RawFrenchFries = new FCItem(5014).setItemName("RawFrenchFries");
public static final Item FrenchFries = new ItemFood(5015, 6, 0.7F, false).setItemName("FrenchFries");
public static final Item Cheese = new FCItem(5016).setItemName("Cheese");
public static final Item Tomato = new ItemFood(5017, 2, 0.4F, false).setItemName("Tomato");
public static final Item Mayonnaise = new FCBottle(5021).setItemName("Mayonnaise");
public static final Item Ketchup = new FCBottle(5022).setItemName("Ketchup");
public static final Item Meal = new FCItem(5023).setItemName("Meal");
public static final Item RawCookie = new FCItem(5024).setItemName("RawCookie");
public static final Item RawCake = new FCCake(5025).setItemName("RawCake");
public static final Item RawBread = new FCItem(5026).setItemName("RawBread");
public static final Item ApplePie = new ItemFood(5027, 6, 0.2F, false).setItemName("ApplePie");
public static final Item RawBacon = new ItemFood(5028, 1, 0.1F, true).setItemName("RawBacon");
public static final Item Bacon = new ItemFood(5029, 2, 0.2F, true).setItemName("Bacon");
public static final Item BaconAndEggs = new ItemFood(5030, 8, 0.8F, false).setItemName("BaconAndEggs");
public static final Item Sausage = new ItemFood(5031, 1, 0.1F, true).setItemName("Sausage");
public static final Item FriedSausage = new ItemFood(5032, 2, 0.2F, true).setItemName("FriedSausage");
public static final Item Dough = new FCItem(5033).setItemName("Dough");
public static final Item RawSausageInTheDough = new FCItem(5034).setItemName("RawSausageInTheDough");
public static final Item SausageInTheDough = new ItemFood(5035, 2, 0.2F, false).setItemName("SausageInTheDough");
public static final Item RawHotDog = new FCItem(5036).setItemName("RawHotDog");
public static final Item HotDog = new ItemFood(5037, 4, 0.4F, false).setItemName("HotDog");
public static final Item CutSausage = new FCItem(5038).setItemName("CutSausage");
public static final Item Grater = new FCGrater(5039).setItemName("Grater");
public static final Item GratedCheese = new FCItem(5040).setItemName("GratedCheese");
public static final Item RawPizza = new FCPizza(5041).setItemName("RawPizza");
public static final Item Pizza = new FCPizza(5042).setItemName("Pizza");
public static final Item CutPizza = new ItemFood(5043, 10, 1F, false).setItemName("CutPizza");
public static final Item RawCutlet = new FCItem(5044).setItemName("RawCutlet");
public static final Item Cutlet = new ItemFood(5045, 3, 0.3F, true).setItemName("Cutlet");
public static final Item RawBreadRoll = new FCItem(5046).setItemName("RawBreadRoll");
public static final Item BreadRoll = new ItemFood(5047, 3, 0.4F, false).setItemName("BreadRoll");
public static final Item CutBreadRoll = new ItemFood(5048, 1, 0.2F, false).setItemName("CutBreadRoll");
public static final Item Lettuce = new ItemFood(5049, 2, 0.1F, false).setItemName("Lettuce");
public static final Item CutTomato = new FCItem(5050).setItemName("CutTomato");
public static final Item Hamburger = new ItemFood(5051, 8, 1.2F, false).setItemName("Hamburger");
public static final Item AppleJuice = new FCJuice(5052).setItemName("AppleJuice");
public static final Item CarrotJuice = new FCJuice(5053).setItemName("CarrotJuice");
public static final Item PumpkinJuice = new FCJuice(5054).setItemName("PumpkinJuice");
public static final Item RawRusks = new FCItem(5055).setItemName("RawRusks");
public static final Item Rusks = new ItemFood(5056, 1, 0.1F, false).setItemName("Rusks");
public static final Item CaesarSalad = new FCSalad(5057, 8).setPotionEffect(Potion.regeneration.id, 10, 0, 1F).setItemName("CaesarSalad");
public static final Item CutCarrot = new FCItem(5058).setItemName("CutCarrot");
public static final Item VegetableSalad = new FCSalad(5059, 4).setPotionEffect(Potion.regeneration.id, 5, 0, 1F).setItemName("VegetableSalad");
public static final Item CarrotSoup = new FCSoup(5060, 6).setItemName("CarrotSoup");

// Added blocks
public static final Block SaltOre = new FCOre(160, 0).setStepSound(Block.soundStoneFootstep).setBlockName("SaltOre").setHardness(3F).setResistance(15F);

// Ores generation
public void generateSurface(World world, Random random, int i, int j)
{
        for (int k = 0; k < 10; k++)
        {
                int randPosX = i + random.nextInt(8);
                int randPosY = random.nextInt(56);
                int randPosZ = j + random.nextInt(8);
                (new WorldGenMinable(SaltOre.blockID, 17)).generate(world, random, randPosX, randPosY, randPosZ);
        }
}

// New fuels
public int addFuel(int par1, int par2)
{
    if (par1 == mod_FemiCraft.ButterBottle.shiftedIndex)
    {
        return 2400;
    }
	    return 0;
}

public void load()
        {

// Items textures
PigmanSword.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/pigmansword.png");
DirtySalt.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/dirtysalt.png");
Salt.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/salt.png");
ButterBottle.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/butterbottle.png");
CutApple.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/cutapple.png");
ScrambledEggs.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/scramledeggs.png");
Chocolate.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/chocolate.png");
MilkBottle.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/milkbottle.png");
PumpkinPie.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/pumpkinpie.png");
Potato.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/potato.png");
PoisonousPotato.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/poisonouspotato.png");
BakedPotato.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/bakedpotato.png");
Carrot.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/carrot.png");
RawFrenchFries.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/rawfrenchfries.png");
FrenchFries.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/frenchfries.png");
Cheese.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/cheese.png");
Tomato.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/tomato.png");
Mayonnaise.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/mayonnaise.png");
Ketchup.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/ketchup.png");
Meal.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/meal.png");
RawCookie.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/rawcookie.png");
RawCake.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/rawcake.png");
RawBread.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/rawbread.png");
ApplePie.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/applepie.png");
RawBacon.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/rawbacon.png");
Bacon.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/bacon.png");
BaconAndEggs.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/baconandeggs.png");
Sausage.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/sausage.png");
FriedSausage.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/friedsausage.png");
Dough.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/dough.png");
RawSausageInTheDough.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/rawsausageinthedough.png");
SausageInTheDough.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/sausageinthedough.png");
RawHotDog.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/rawhotdog.png");
HotDog.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/hotdog.png");
CutSausage.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/cutsausage.png");
Grater.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/grater.png");
GratedCheese.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/gratedcheese.png");
RawPizza.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/rawpizza.png");
Pizza.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/pizza.png");
CutPizza.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/cutpizza.png");
RawCutlet.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/rawcutlet.png");
Cutlet.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/cutlet.png");
RawBreadRoll.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/rawbreadroll.png");
BreadRoll.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/breadroll.png");
CutBreadRoll.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/cutbreadroll.png");
Lettuce.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/lettuce.png");
CutTomato.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/cuttomato.png");
Hamburger.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/hamburger.png");
AppleJuice.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/applejuice.png");
CarrotJuice.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/carrotjuice.png");
PumpkinJuice.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/pumpkinjuice.png");
RawRusks.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/rawrusks.png");
Rusks.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/rusks.png");
CaesarSalad.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/caesarsalad.png");
CutCarrot.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/cutcarrot.png");
VegetableSalad.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/vegetablesalad.png");
CarrotSoup.iconIndex = ModLoader.addOverride("/gui/items.png", "/FemiCraft/textures/items/carrotsoup.png");

// Blocks textures
SaltOre.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/FemiCraft/textures/blocks/saltore.png");

// Registered blocks
ModLoader.registerBlock(SaltOre);

// Items names
ModLoader.addName(PigmanSword, "Golden Sword");
ModLoader.addName(DirtySalt, "Dirty Salt");
ModLoader.addName(Salt, "Salt");
ModLoader.addName(ButterBottle, "Butter Bottle");
ModLoader.addName(CutApple, "Cut Apple");
ModLoader.addName(ScrambledEggs, "Scrambled Eggs");
ModLoader.addName(Chocolate, "Chocolate Slice");
ModLoader.addName(MilkBottle, "Milk Bottle");
ModLoader.addName(PumpkinPie, "Pumpkin Pie");
ModLoader.addName(Potato, "Potato");
ModLoader.addName(PoisonousPotato, "Poisonous Potato");
ModLoader.addName(BakedPotato, "Baked Potato");
ModLoader.addName(Carrot, "Carrot");
ModLoader.addName(RawFrenchFries, "Raw French Fries");
ModLoader.addName(FrenchFries, "French Fries");
ModLoader.addName(Cheese, "Cheese");
ModLoader.addName(Tomato, "Tomato");
ModLoader.addName(Mayonnaise, "Mayonnaise");
ModLoader.addName(Ketchup, "Ketchup");
ModLoader.addName(Meal, "Meal");
ModLoader.addName(RawCookie, "Raw Cookie");
ModLoader.addName(RawCake, "Raw Cake");
ModLoader.addName(RawBread, "Raw Bread");
ModLoader.addName(ApplePie, "Apple Pie");
ModLoader.addName(RawBacon, "Raw Bacon");
ModLoader.addName(Bacon, "Bacon");
ModLoader.addName(BaconAndEggs, "Bacon and Eggs");
ModLoader.addName(Sausage, "Sausage");
ModLoader.addName(FriedSausage, "Fried Sausage");
ModLoader.addName(Dough, "Dough");
ModLoader.addName(RawSausageInTheDough, "Raw Sausage in the Dough");
ModLoader.addName(SausageInTheDough, "Sausage in the Dough");
ModLoader.addName(RawHotDog, "Raw Hot Dog");
ModLoader.addName(HotDog, "Hot Dog");
ModLoader.addName(CutSausage, "Cut Sausage");
ModLoader.addName(Grater, "Grater");
ModLoader.addName(GratedCheese, "Grated Cheese");
ModLoader.addName(RawPizza, "Raw Pizza");
ModLoader.addName(Pizza, "Pizza");
ModLoader.addName(CutPizza, "Cut Pizza");
ModLoader.addName(RawCutlet, "Raw Cutlet");
ModLoader.addName(Cutlet, "Cutlet");
ModLoader.addName(RawBreadRoll, "Raw Bread Roll");
ModLoader.addName(BreadRoll, "Bread Roll");
ModLoader.addName(CutBreadRoll, "Cut Bread Roll");
ModLoader.addName(Lettuce, "Lettuce");
ModLoader.addName(CutTomato, "Cut Tomato");
ModLoader.addName(Hamburger, "Hamburger");
ModLoader.addName(AppleJuice, "Apple Juice");
ModLoader.addName(CarrotJuice, "Carrot Juice");
ModLoader.addName(PumpkinJuice, "Pumpkin Juice");
ModLoader.addName(RawRusks, "Raw Rusks");
ModLoader.addName(Rusks, "Rusks");
ModLoader.addName(CaesarSalad, "Caesar Salad");
ModLoader.addName(CutCarrot, "Cut Carrot");
ModLoader.addName(VegetableSalad, "Vegetable Salad");
ModLoader.addName(CarrotSoup, "Carrot Soup");

// Blocks names
ModLoader.addName(SaltOre, "Salt Ore");

// Recipes
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.ButterBottle, 1), new Object [] {"R", "B", 'R', Item.reed, 'B', Item.glassBottle});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.Chocolate, 8), new Object [] {"CMC", 'C', new ItemStack(Item.dyePowder, 1, 3), 'M', mod_FemiCraft.MilkBottle});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.MilkBottle, 8), new Object [] {"BBB", "BMB", "BBB", 'B', Item.glassBottle, 'M', Item.bucketMilk});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.Mayonnaise, 3), new Object [] {" A ", "#O@", "BBB", 'A', mod_FemiCraft.ButterBottle, '#', Item.sugar, 'O', Item.egg, '@', mod_FemiCraft.Salt, 'B', Item.glassBottle});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.Mayonnaise, 3), new Object [] {" A ", "@O#", "BBB", 'A', mod_FemiCraft.ButterBottle, '#', Item.sugar, 'O', Item.egg, '@', mod_FemiCraft.Salt, 'B', Item.glassBottle});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.Ketchup, 1), new Object [] {"T", "B", 'T', mod_FemiCraft.Tomato, 'B', Item.glassBottle});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.RawCookie, 8), new Object [] {"DCD",  'D', mod_FemiCraft.Dough, 'C', new ItemStack(Item.dyePowder, 1, 3)});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.RawCake, 1), new Object [] {"MMM", "SES", "DDD", 'M', Item.bucketMilk, 'S', Item.sugar, 'E', Item.egg, 'D', mod_FemiCraft.Dough});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.RawBread, 1), new Object [] {"DDD", 'D', mod_FemiCraft.Dough});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.Sausage, 8), new Object [] {"  P", " B ", "P  ", 'P', Item.porkRaw, 'B', Item.beefRaw});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.Dough, 8), new Object [] {"MMM", "MWM", "MMM", 'M', mod_FemiCraft.Meal, 'W', Item.bucketWater});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.RawHotDog, 8), new Object [] {" D ", "KSM", " D ", 'D', mod_FemiCraft.Dough, 'K', mod_FemiCraft.Ketchup, 'S', mod_FemiCraft.Sausage, 'M', mod_FemiCraft.Mayonnaise});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.RawHotDog, 8), new Object [] {" D ", "MSK", " D ", 'D', mod_FemiCraft.Dough, 'K', mod_FemiCraft.Ketchup, 'S', mod_FemiCraft.Sausage, 'M', mod_FemiCraft.Mayonnaise});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.Grater, 1), new Object [] {" I", "I ", 'I', Item.ingotIron});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.RawPizza, 1), new Object [] {"CCC", "SKS", "DDD", 'C', mod_FemiCraft.GratedCheese, 'S', mod_FemiCraft.CutSausage, 'K', mod_FemiCraft.Ketchup, 'D', mod_FemiCraft.Dough});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.RawCutlet, 16), new Object [] {"PPP", "PPP", 'P', Item.porkRaw});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.RawCutlet, 16), new Object [] {"BBB", "BBB", 'B', Item.beefRaw});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.RawBreadRoll, 2), new Object [] {"DD", "DD", 'D', mod_FemiCraft.Dough});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.Hamburger, 1), new Object [] {" R ", "TCL", " R ", 'R', mod_FemiCraft.CutBreadRoll, 'T', mod_FemiCraft.CutTomato, 'C', mod_FemiCraft.Cutlet, 'L', mod_FemiCraft.Lettuce});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.AppleJuice, 3), new Object [] {" A ", "BBB", 'A', Item.appleRed, 'B', Item.glassBottle});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.CarrotJuice, 1), new Object [] {"C", "B", 'C', mod_FemiCraft.Carrot, 'B', Item.glassBottle});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.PumpkinJuice, 8), new Object [] {"BBB", "BPB", "BBB", 'P', Block.pumpkin, 'B', Item.glassBottle});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.CaesarSalad, 1), new Object [] {"CRC", "LLL", "SBS", 'C', mod_FemiCraft.GratedCheese, 'R', mod_FemiCraft.Rusks, 'L', mod_FemiCraft.Lettuce, 'S', mod_FemiCraft.Salt, 'B', Item.bowlEmpty});
ModLoader.addRecipe(new ItemStack(mod_FemiCraft.VegetableSalad, 1), new Object [] {"CTC", "LLL", "SBS", 'C', mod_FemiCraft.CutCarrot, 'T', mod_FemiCraft.CutTomato, 'L', mod_FemiCraft.Lettuce, 'S', mod_FemiCraft.Salt, 'B', Item.bowlEmpty});

ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.CutApple, 2), new Object[] {Item.swordSteel, Item.appleRed});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.RawFrenchFries, 1), new Object[] {Item.swordSteel, mod_FemiCraft.Potato});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.RawBacon, 3), new Object[] {Item.swordSteel, Item.porkRaw});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.CutSausage, 1), new Object[] {Item.swordSteel, mod_FemiCraft.Sausage});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.CutPizza, 8), new Object[] {Item.swordSteel, mod_FemiCraft.Pizza});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.CutBreadRoll, 2), new Object[] {Item.swordSteel, mod_FemiCraft.BreadRoll});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.CutTomato, 1), new Object[] {Item.swordSteel, mod_FemiCraft.Tomato});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.RawRusks, 8), new Object[] {Item.swordSteel, Item.bread});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.CutCarrot, 1), new Object[] {Item.swordSteel, mod_FemiCraft.Carrot});

ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.GratedCheese, 8), new Object[] {mod_FemiCraft.Cheese, mod_FemiCraft.Grater});

ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.PumpkinPie, 1), new Object[] {Block.pumpkin, Item.egg, Item.sugar});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.Meal, 1), new Object[] {Item.wheat});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.ApplePie, 1), new Object[] {Item.appleRed, Item.egg, Item.sugar});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.BaconAndEggs, 1), new Object[] {mod_FemiCraft.Bacon, mod_FemiCraft.ScrambledEggs});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.RawSausageInTheDough, 1), new Object[] {mod_FemiCraft.Sausage, mod_FemiCraft.Dough});
ModLoader.addShapelessRecipe(new ItemStack(mod_FemiCraft.CarrotSoup, 1), new Object[] {mod_FemiCraft.Carrot, mod_FemiCraft.Carrot, Item.bowlEmpty});

ModLoader.addSmelting(mod_FemiCraft.SaltOre.blockID, new ItemStack(mod_FemiCraft.Salt, 1));
ModLoader.addSmelting(mod_FemiCraft.DirtySalt.shiftedIndex, new ItemStack(mod_FemiCraft.Salt, 1));
ModLoader.addSmelting(Item.egg.shiftedIndex, new ItemStack(mod_FemiCraft.ScrambledEggs, 1));
ModLoader.addSmelting(mod_FemiCraft.Potato.shiftedIndex, new ItemStack(mod_FemiCraft.BakedPotato, 1));
ModLoader.addSmelting(mod_FemiCraft.RawFrenchFries.shiftedIndex, new ItemStack(mod_FemiCraft.FrenchFries, 1));
ModLoader.addSmelting(Item.bucketMilk.shiftedIndex, new ItemStack(mod_FemiCraft.Cheese, 8));
ModLoader.addSmelting(mod_FemiCraft.RawCookie.shiftedIndex, new ItemStack(Item.cookie, 1));
ModLoader.addSmelting(mod_FemiCraft.RawCake.shiftedIndex, new ItemStack(Item.cake, 1));
ModLoader.addSmelting(mod_FemiCraft.RawBread.shiftedIndex, new ItemStack(Item.bread, 1));
ModLoader.addSmelting(mod_FemiCraft.RawBacon.shiftedIndex, new ItemStack(mod_FemiCraft.Bacon, 1));
ModLoader.addSmelting(mod_FemiCraft.Sausage.shiftedIndex, new ItemStack(mod_FemiCraft.FriedSausage, 1));
ModLoader.addSmelting(mod_FemiCraft.RawSausageInTheDough.shiftedIndex, new ItemStack(mod_FemiCraft.SausageInTheDough, 1));
ModLoader.addSmelting(mod_FemiCraft.RawHotDog.shiftedIndex, new ItemStack(mod_FemiCraft.HotDog, 1));
ModLoader.addSmelting(mod_FemiCraft.RawPizza.shiftedIndex, new ItemStack(mod_FemiCraft.Pizza, 1));
ModLoader.addSmelting(mod_FemiCraft.RawCutlet.shiftedIndex, new ItemStack(mod_FemiCraft.Cutlet, 1));
ModLoader.addSmelting(mod_FemiCraft.RawBreadRoll.shiftedIndex, new ItemStack(mod_FemiCraft.BreadRoll, 1));
ModLoader.addSmelting(mod_FemiCraft.RawRusks.shiftedIndex, new ItemStack(mod_FemiCraft.Rusks, 1));

        }

// Mod info
public String getVersion()
            {
                return "1.2.5";
            }
        }
