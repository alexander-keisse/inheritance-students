package be.intecbrussel;

public class Car {

    private String brand;
    private String model;
    protected String color;

    protected static int carCount;

    {
        carCount++;
    }

    protected Car() {

    }

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void accelerate() {
        System.out.println("This car is accelerating!");
    }

    public void slowDown() {
        System.out.println("This car is slowing down!");
    }

    public void turnLeft() {
        System.out.println("This car is turning left.");
    }

    public void turnRight() {
        System.out.println("This car is turning right.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
