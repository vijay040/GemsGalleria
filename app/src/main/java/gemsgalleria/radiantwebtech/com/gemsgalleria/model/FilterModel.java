package gemsgalleria.radiantwebtech.com.gemsgalleria.model;

import java.util.ArrayList;

/**
 * Created by RADIANT on 1/2/2017.
 */

public class FilterModel {

    private ArrayList<PurityOfMetal> PurityOfMetal;

    private PriceRange PriceRange;

    private ArrayList<Jewellerys> Jewellerys;

    private ArrayList<MetalType> MetalType;

    private ArrayList<Rhodiumcolor> Rhodiumcolor;

    private ArrayList<JewelleryType> Jewellery_Type;

    public ArrayList<gemsgalleria.radiantwebtech.com.gemsgalleria.model.PurityOfMetal> getPurityOfMetal() {
        return PurityOfMetal;
    }

    public void setPurityOfMetal(ArrayList<gemsgalleria.radiantwebtech.com.gemsgalleria.model.PurityOfMetal> purityOfMetal) {
        PurityOfMetal = purityOfMetal;
    }

    public gemsgalleria.radiantwebtech.com.gemsgalleria.model.PriceRange getPriceRange() {
        return PriceRange;
    }

    public void setPriceRange(gemsgalleria.radiantwebtech.com.gemsgalleria.model.PriceRange priceRange) {
        PriceRange = priceRange;
    }

    public ArrayList<gemsgalleria.radiantwebtech.com.gemsgalleria.model.Jewellerys> getJewellerys() {
        return Jewellerys;
    }

    public void setJewellerys(ArrayList<gemsgalleria.radiantwebtech.com.gemsgalleria.model.Jewellerys> jewellerys) {
        Jewellerys = jewellerys;
    }

    public ArrayList<gemsgalleria.radiantwebtech.com.gemsgalleria.model.MetalType> getMetalType() {
        return MetalType;
    }

    public void setMetalType(ArrayList<gemsgalleria.radiantwebtech.com.gemsgalleria.model.MetalType> metalType) {
        MetalType = metalType;
    }

    public ArrayList<gemsgalleria.radiantwebtech.com.gemsgalleria.model.Rhodiumcolor> getRhodiumcolor() {
        return Rhodiumcolor;
    }

    public void setRhodiumcolor(ArrayList<gemsgalleria.radiantwebtech.com.gemsgalleria.model.Rhodiumcolor> rhodiumcolor) {
        Rhodiumcolor = rhodiumcolor;
    }

    public ArrayList<JewelleryType> getJewellery_Type() {
        return Jewellery_Type;
    }

    public void setJewellery_Type(ArrayList<JewelleryType> jewellery_Type) {
        Jewellery_Type = jewellery_Type;
    }
}
