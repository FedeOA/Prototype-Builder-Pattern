package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.builder.IBuilder;
import org.example.model.abstractclasses.Vehicle;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Branch {

    private Address address;
    private List<Vehicle> vehicles;
    private List<Employee> employees;

    public Branch(){}

    public static class BranchBuilder implements IBuilder{
        private Address address;
        private List<Vehicle> vehicles=new ArrayList<>();
        private List<Employee> employees=new ArrayList<>();

        public BranchBuilder(){}

        public BranchBuilder setAddress(String province,String locality,String street,String number){
            this.address=new Address(province,locality,street,number);
            return this;
        }

        public BranchBuilder setAddress(Address address){
            this.address=address;
            return this;
        }

        public BranchBuilder setVehicleList(Vehicle vehicle) {
            this.vehicles.add(vehicle);
            return this;
        }

        public BranchBuilder setVehicleList(List<Vehicle> vehicles) {
            this.vehicles.addAll(vehicles);
            return this;
        }

        public BranchBuilder setEmployeeList(Employee employee) {
            this.employees.add(employee);
            return this;
        }

        public BranchBuilder setEmployeeList(List<Employee> employees) {
            this.employees.addAll(employees);
            return this;
        }

        @Override
        public Branch build() {
            return new Branch(address,vehicles,employees);
        }
    }
}
