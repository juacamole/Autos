package org.example.Autos_Class;

public class Autos {
    public static void main(String[] args) {
        Car myCar = new Car ("koenigsegg", "regera", "grau", 2015, 400);
        myCar.startup("koenigsegg", "regera");
        Car fastCar = new Car ("koenigsegg", "gemera", "grün", 2023, 550);
        myCar.beschleunigen("regera", 400);
        fastCar.startup("koenigsegg", "gemera");
        fastCar.beschleunigen("gemera", 550);

    }
}
