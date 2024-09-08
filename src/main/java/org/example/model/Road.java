package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.prototype.IPrototype;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Road extends Vehicle implements IPrototype {

    private String tractionType;
    private String loadCapacity;
    private String cabinSize;

    public Road(){}

    public Road(String brand, String model, int manufactureYear, int pleasesAvailable, String color, String tractionType,String loadCapacity,String cabinSize) {
        super(brand,model,manufactureYear,pleasesAvailable,color);
        this.tractionType=tractionType;
        this.loadCapacity=loadCapacity;
        this.cabinSize=cabinSize;
    }

    @Override
    public IPrototype clone() {
        Road clone=new Road(this.getBrand(),this.getModel(),this.getManufactureYear(),this.getPleasesAvailable(),this.getColor(),this.tractionType,this.loadCapacity,this.cabinSize);
        return clone;
    }
    @Override
    public IPrototype deepClone() {
        return null;
    }
}
