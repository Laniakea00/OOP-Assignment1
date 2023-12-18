package com.company.details;

public class Engine {
    private int power;
    private String manufactor;

    @Override
    public String toString() {
        return "Engine{" +
                "manufactor='" + manufactor + '\'' +
                "power='" + power + '\'' +
                '}';
    }
}
