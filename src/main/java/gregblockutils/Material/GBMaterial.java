package gregblockutils.Material;

import gregtech.api.unification.material.IMaterialHandler;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.type.DustMaterial;

import static gregtech.api.unification.material.type.DustMaterial.MatFlags.*;

@IMaterialHandler.RegisterMaterialHandler
public class GBMaterial implements IMaterialHandler {
    @Override
    public void onMaterialsInit() {
        addOreGen(Materials.Alunite);
        addOreGen(Materials.Andradite);
        addOreGen(Materials.Asbestos);
        addOreGen(Materials.BasalticMineralSand);
        addOreGen(Materials.Diatomite);
        addOreGen(Materials.Dolomite);
        addOreGen(Materials.FullersEarth);
        addOreGen(Materials.GarnetSand);
        addOreGen(Materials.Glauconite);
        addOreGen(Materials.GlauconiteSand);
        addOreGen(Materials.GraniticMineralSand);
        addOreGen(Materials.Gypsum);
        addOreGen(Materials.Kaolinite);
        addOreGen(Materials.Kyanite);
        addOreGen(Materials.Mica);
        addOreGen(Materials.Pollucite);
        addOreGen(Materials.Trona);
        addOreGen(Materials.Vermiculite);
        addOreGen(Materials.Wollastonite);
        addOreGen(Materials.Zeolite);
    }

    protected static void addOreGen(DustMaterial mat){
        mat.addFlag(GENERATE_ORE);
    }
}
