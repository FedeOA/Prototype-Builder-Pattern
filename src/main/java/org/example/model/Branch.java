package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Branch {

    private Address address;
    private List<Vehicle> vehicleList;

    public Branch(){}
}
