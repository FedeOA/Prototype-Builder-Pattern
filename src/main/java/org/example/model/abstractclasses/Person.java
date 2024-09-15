package org.example.model.abstractclasses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.model.Contact;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Person {

    protected String name;
    protected String lastName;
    protected String dni;
    protected Contact contact;

    public Person(){}
}
