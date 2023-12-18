package com.company.professions;

import com.company.Person;

public class Drivers extends Person{
    private String fullName;
    private int experience;

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + fullName + '\'' +
                "experience='" + experience + '\'' +
                '}';
    }
}
