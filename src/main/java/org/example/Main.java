package org.example;

import org.example.model.*;
import org.example.model.abstractclasses.Vehicle;

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
        * we create an employee list using builder pattern
         * * where we create a contact for each of employees using builder pattern also
        * */

        Address addressEmployee1= new Address("Buenos Aires","CABA","AV. Cordoba","1231");


        Contact contactEmployee1= new Contact.ContactBuilder()
                .setAddress(addressEmployee1)
                .setEmail("hola@gmial.com")
                .setPhone("112321231")
                .build();

        Contact contactEmployee2=new Contact.ContactBuilder()
                .setAddress("Buenos Aires","CABA","Suipacha","1000")
                .setEmail("holacomoteva@gmail.com")
                .setPhone("1123432222")
                .build();

        Employee employee1=new Employee.EmployeeBuilder()
                .setName("Jose")
                .setLastName("Hernandez")
                .setDni("11222333")
                .setPosition("Seller")
                .setAccountNumber("119993292900")
                .setContact(contactEmployee1)
                .build();

        Employee employee2=new Employee.EmployeeBuilder()
                .setName("Juan")
                .setLastName("Herrera")
                .setDni("49812322")
                .setPosition("Seller")
                .setAccountNumber("118882822800")
                .setContact(contactEmployee2)
                .build();

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(employee2);
        employeeList.add(employee1);

        /**
         * we create a Branch and we add all our vehicles
         * */
        Branch branch1=new Branch.BranchBuilder()
                .setAddress("Buenos Aires","CABA","Av. Del Libertador","999")
                .setEmployeeList(employeeList)
                .setVehicleList(vehicleList)
                .build();




        System.out.println("Branch: ");
        System.out.println(branch1.getAddress().getLocality());
        System.out.println("\n");

        /**
         * we show all of our employees
         * */
        System.out.println("Employees: ");
        for (Employee employee:branch1.getEmployees()){
            System.out.println(employee);
        }

        /**
         * we show all of our cars available to sell
         * */
        System.out.println("\n");
        System.out.println("Cars available: ");
        for(Vehicle vehicle:branch1.getVehicles()){
            if(vehicle instanceof Car){
                System.out.println(vehicle);
            }
        }

        /**
         * we show all of our motorcycles available to sell
         * */
        System.out.println("\n");
        System.out.println("Motorcycles available: ");
        for(Vehicle vehicle:branch1.getVehicles()){
            if(vehicle instanceof Motorcycle){
                System.out.println(vehicle);
            }
        }
    }
}