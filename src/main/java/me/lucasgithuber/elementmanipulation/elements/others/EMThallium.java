package me.lucasgithuber.elementmanipulation.elements.others;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import me.lucasgithuber.elementmanipulation.Items;
import me.lucasgithuber.elementmanipulation.utils.RecipeTypes;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class EMThallium extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {
    public EMThallium(ItemGroup c) {

        super(c, Items.EMThallium, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{
                null, null, null,
                null,null,null
                ,null,null,null
        });

    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return PlayerRightClickEvent::cancel;
    }
}