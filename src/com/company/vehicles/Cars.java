package com.company.vehicles;

public class Cars {
    private String brand, carClass, weight, driver, motor;

    public static void start(){
        System.out.println("Let's go");
    }
    public static void stor(){
        System.out.println("Let's stop");
    }
    public static void turnRight(){
        System.out.println("Turn Right");
    }
    public static void turnLeft(){
        System.out.println("Turn Left");
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", motor=" + motor +
                '}';
    }
}