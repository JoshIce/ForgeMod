package vegakuma.forgemod.items;

import vegakuma.forgemod.Constants;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemVegakuma extends Item {
    private String name = "vegakumaItem";

    public ItemVegakuma() {

        setUnlocalizedName(Constants.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(CreativeTabs.tabMaterials);
        setTextureName(Constants.MODID + ":" + name);
    }
}
