package org.example.model.abstractclasses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Vehicle{

    protected String brand;
    protected String model;
    protected int manufactureYear;
    protected int pleasesAvailable;
    protected String color;

    public Vehicle() {}
}
