package org.example.model;

import lombok.Getter;
import lombok.Setter;
import org.example.model.abstractclasses.Vehicle;
import org.example.prototype.IPrototype;

@Getter
@Setter
public class Car extends Vehicle implements IPrototype {

    private int doors;

    public Car(String brand,String model,int manufactureYear,int pleasesAvailable,String color,int doors){
        super(brand,model,manufactureYear,pleasesAvailable,color);
        this.doors=doors;
    }

    public Car(int doors) {
        this.doors = doors;
    }

    @Override
    public IPrototype clone() {

        Car clone=new Car(this.getBrand(),this.getModel(),this.getManufactureYear(),this.getPleasesAvailable(),this.getColor(),this.doors);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        return null;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", pleasesAvailable=" + pleasesAvailable +
                ", color='" + color + '\'' +
                '}';
    }
}
