package net.minecraft.src; 

import java.util.Random; 

public class FCNonStackItem extends Item 
{ 

        public FCNonStackItem (int i) 
        { 
                super(i); 
                maxStackSize = 1;
        }
}
