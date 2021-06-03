package be.intecbrussel;

import be.intecbrussel.Car;

public class Virus {

    public static void main(String[] args) {

        Car car = new Car("Mazda", "MX5", "White");

        car.color = "Red";

        System.out.println(car);
    }
}
