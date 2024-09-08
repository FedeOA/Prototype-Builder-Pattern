package org.example;

import org.example.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * we create an Address for the branch
         * */
        Address address=new Address("Buenos Aires","CABA","Av del Libertador","5004");

        /**
         * we create our prototype WhiteFordMustangGT2024 (i love Lana's song)
         * */
        Car whiteFordMustang2024Prototype= new Car("Ford","Mustang GT",2024,5,"white",2);

        /**
         * we create our prototype BlackFordMustangGT
         * */
        Car blackFordMustang2024Prototype= new Car("Ford","Mustang GT",2024,5,"black",2);

        /**
         * we create our prototype RedBMWR1250GS
         * */

        Motorcycle redBMWR1250GSPrototype=new Motorcycle("BMW","R1250GS",2024,2,"Red",2);

        /**
         * we create a List of Vehicles
         * we clone 3 of all the types of vehicles that we have
         * */;

         Collection<Vehicle> vehicles=new ArrayList<>();

         for(int i=0;i<3;i++){
             vehicles.add((Car) whiteFordMustang2024Prototype.clone());
             vehicles.add((Car) blackFordMustang2024Prototype.clone());
             vehicles.add((Motorcycle) redBMWR1250GSPrototype.clone());
         }

        List<Vehicle> vehicleList = new ArrayList<>(vehicles);

        /**
         * we create a Branch and we add all our vehicles
         * */
        Branch branch1=new Branch(address,vehicleList);



        System.out.println("Branch: ");
        System.out.println(branch1.getAddress().getLocality());
        System.out.println("\n");

        /**
         * we show all of our cars available to sell
         * */
        System.out.println("Cars available: ");
        for(Vehicle vehicle:branch1.getVehicleList()){
            System.out.println("\n");
            if(vehicle instanceof Car){
                System.out.println(vehicle);
                System.out.println("\n");
            }
        }

        /**
         * we show all of our motorcycles available to sell
         * */
        System.out.println("Motorcycles available: ");
        for(Vehicle vehicle:branch1.getVehicleList()){
            System.out.println("\n");
            if(vehicle instanceof Motorcycle){
                System.out.println(vehicle);
                System.out.println("\n");
            }
        }
    }
}