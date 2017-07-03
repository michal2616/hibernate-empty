package com.gwiazda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by michal on 03.07.17.
 */

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String lastName;

    public Person() {
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
