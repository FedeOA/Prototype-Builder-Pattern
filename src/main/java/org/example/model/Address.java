package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Address {

    private String province;
    private String locality;
    private String street;
    private String number;

    public Address(){}
}
