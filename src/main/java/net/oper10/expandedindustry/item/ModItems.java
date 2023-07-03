package net.oper10.expandedindustry.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oper10.expandedindustry.ExpandedIndustry;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExpandedIndustry.MOD_ID);
    public static final RegistryObject<Item> SMALL_FUSE = ITEMS.register("lv_fuse",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INDUSTRY_TAB)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INDUSTRY_TAB)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INDUSTRY_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
