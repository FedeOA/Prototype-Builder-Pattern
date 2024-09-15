package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.builder.IBuilder;
import org.example.model.abstractclasses.Person;
@Getter
@Setter
public class Employee extends Person {

    private String position;
    private String accountNumber;

    public Employee(){}

    public Employee(String name,String lastName,String dni,Contact contact,String position,String accountNumber){
        super(name,lastName,dni,contact);
        this.position=position;
        this.accountNumber=accountNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni='" + dni + '\'' +
                ", contact=" + contact +
                '}';
    }

    public static class EmployeeBuilder implements IBuilder{

        private String name;
        private String lastName;
        private String dni;
        private Contact contact;
        private String position;
        private String accountNumber;

        public EmployeeBuilder(){}

        public EmployeeBuilder setPosition(String position){
            this.position=position;
            return this;
        }

        public EmployeeBuilder setName(String name){
            this.name=name;
            return this;
        }

        public EmployeeBuilder setLastName(String lastName){
            this.lastName=lastName;
            return this;
        }

        public EmployeeBuilder setDni(String dni){
            this.dni=dni;
            return this;
        }

        public EmployeeBuilder setContact(Contact contact){
            this.contact=contact;
            return this;
        }

        public EmployeeBuilder setContact(String phone,String email,Address address){
            this.contact=new Contact(phone,email,address);
            return this;
        }

        public EmployeeBuilder setAccountNumber(String accountNumber){
            this.accountNumber=accountNumber;
            return this;
        }
        @Override
        public Employee build() {
            return new Employee(name,lastName,dni,contact,position,accountNumber);
        }
    }
}