package be.intecbrussel.test;

import be.intecbrussel.Car;

public class Convertible extends Car {

    private boolean openRoof;
    protected int carCount;

    public Convertible(String brand, String model, String color) {
        super(brand, model, color);
        openRoof = true;  // Redundant
    }

    public boolean isOpenRoof() {
        return openRoof;
    }

    public void switchRoof() {
        if (openRoof) {
            System.out.println("This car with the color: " + super.color + " is taking it's top down, nice weather all around!");
        } else {
            System.out.println("Seems like rain, better close the top down of this" + super.color + " car.");
        }

        System.out.println("There are: " + carCount + " cars around.");
        openRoof = !openRoof;
    }

    @Override
    public void accelerate() {
        System.out.println("Car is driving with an open roof: " + openRoof);
//        super.accelerate();
    }
}
