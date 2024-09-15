package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.builder.IBuilder;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Contact {

    private String phone;
    private String email;
    private Address address;

    public Contact(){}


    public static class ContactBuilder implements IBuilder{

        private String phone;
        private String email;
        private Address address;

        public ContactBuilder setPhone(String phone){
            this.phone=phone;
            return this;
        }

        public ContactBuilder setEmail(String email){
            this.email=email;
            return this;
        }

        public ContactBuilder setAddress(Address address){
            this.address=address;
            return this;
        }

        public ContactBuilder setAddress(String province,String locality,String street,String number){

            this.address= new Address(province,locality,street,number);
            return this;
        }

        @Override
        public Contact build() {
            return new Contact(phone,email,address);
        }

    }
}
