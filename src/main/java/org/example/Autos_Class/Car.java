package org.example.Autos_Class;

public class Car {
    String brand;
    String model;
    String color;
    int year;
    int velocity;
    Car(String brand, String model, String color, int year, int velocity) {

    }

    public void startup(String brand, String model) {
        System.out.println("The " + brand + " " + model + " is starting.");
    }
    public void beschleunigen(String model, int velocity) {
        int i = 0;
        while(i<=velocity){
            System.out.println("velocity of "+  model +" : " + i);
            i += 10;
        }
    }}
