package org.example.model;

import lombok.Getter;
import lombok.Setter;
import org.example.model.abstractclasses.Vehicle;
import org.example.prototype.IPrototype;

@Getter
@Setter
public class Motorcycle extends Vehicle implements IPrototype {

    private int wheels;

    public Motorcycle(){}

    public Motorcycle(String brand, String model, int manufactureYear, int pleasesAvailable, String color, int wheels) {
        super(brand,model,manufactureYear,pleasesAvailable,color);
        this.wheels=wheels;
    }

    @Override
    public IPrototype clone() {
        Motorcycle clone=new Motorcycle(this.getBrand(),this.getModel(),this.getManufactureYear(),this.getPleasesAvailable(),this.getColor(),this.wheels);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        return null;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "wheels=" + wheels +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", pleasesAvailable=" + pleasesAvailable +
                ", color='" + color + '\'' +
                '}';
    }
}
