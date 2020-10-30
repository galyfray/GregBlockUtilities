package gregblockutils.Recipes;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import stanhebben.zenscript.annotations.ZenProperty;

@SuppressWarnings("Unchecked")
public class GBRecipeMaps {
    @ZenProperty
    public static final RecipeMap<SimpleRecipeBuilder> SIEVE_RECIPES;
    public static final RecipeMap<SimpleRecipeBuilder> ATTRACTOR_RECIPES;
    static {
        SIEVE_RECIPES = (new RecipeMapExtended("electric_sieve", 2, 2, 1, 24, 0, 0, 0, 0, new SimpleRecipeBuilder()).setProgressBar(GuiTextures.PROGRESS_BAR_SIFT, ProgressWidget.MoveType.HORIZONTAL));
        ATTRACTOR_RECIPES = (new RecipeMap("attractor", 0, 1, 1, 6, 1, 1, 0, 0,  new SimpleRecipeBuilder()).setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressWidget.MoveType.HORIZONTAL));
    }
}
