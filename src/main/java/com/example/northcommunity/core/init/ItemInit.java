package com.example.northcommunity.core.init;

import com.example.northcommunity.NorthCommunity;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NorthCommunity.MOD_ID);

    public static final RegistryObject<Item> NORTH_GOLD = ITEMS.register("north_gold",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> NORTH_COPPER = ITEMS.register("north_copper",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
