package gregblockutils.Machines;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gregtech.api.gui.ModularUI;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityHolder;
import gregtech.api.metatileentity.multiblock.IMultiblockAbilityPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.render.Textures;
import gregtech.common.metatileentities.electric.multiblockpart.MetaTileEntityMultiblockPart;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nullable;
import java.util.List;

public class CokeItemBus extends MetaTileEntityMultiblockPart implements IMultiblockAbilityPart<IItemHandlerModifiable> {
    private static final int INVENTORY_SIZE = 1;
    private final boolean isExportHatch = true;

    public CokeItemBus(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, 0);
        this.initializeInventory();
    }

    public MetaTileEntity createMetaTileEntity(MetaTileEntityHolder holder) {
        return new CokeItemBus(this.metaTileEntityId);
    }

    public void update() {
        super.update();
        if (!this.getWorld().isRemote && this.getTimer() % 5L == 0L) {
            if (this.isExportHatch) {
                this.pushItemsIntoNearbyHandlers(this.getFrontFacing());
            } else {
                this.pullItemsFromNearbyHandlers(this.getFrontFacing());
            }
        }

    }

    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        Textures.COKE_BRICKS.render(renderState, translation, pipeline);
        (this.isExportHatch ? Textures.PIPE_OUT_OVERLAY : Textures.PIPE_IN_OVERLAY).renderSided(this.getFrontFacing(), renderState, translation, pipeline);
    }

    private int getInventorySize() {
        return INVENTORY_SIZE;
    }

    protected IItemHandlerModifiable createExportItemHandler() {
        return this.isExportHatch ? new ItemStackHandler(this.getInventorySize()) : new ItemStackHandler(0);
    }

    protected IItemHandlerModifiable createImportItemHandler() {
        return this.isExportHatch ? new ItemStackHandler(0) : new ItemStackHandler(this.getInventorySize());
    }

    public MultiblockAbility<IItemHandlerModifiable> getAbility() {
        return this.isExportHatch ? MultiblockAbility.EXPORT_ITEMS : MultiblockAbility.IMPORT_ITEMS;
    }

    public void registerAbilities(List<IItemHandlerModifiable> abilityList) {
        abilityList.add(this.isExportHatch ? this.exportItems : this.importItems);
    }

    protected ModularUI createUI(EntityPlayer entityPlayer) {
        return null;
    }

    public boolean onRightClick(EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return false;
    }

    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        tooltip.add(I18n.format("gregtech.universal.tooltip.item_storage_capacity", this.getInventorySize()));
    }
}