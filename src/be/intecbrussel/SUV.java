package be.intecbrussel;

public class SUV extends Car {

    private boolean isFourWheelDrive;

    public SUV(String brand, String model, String color) {
        super(brand, model, color);
    }

    public SUV(String brand, String model, String color, boolean isFourWheelDrive) {
        super(brand, model, color);
        this.isFourWheelDrive = isFourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    public void setFourWheelDrive(boolean isFourWheelDrive) {
        this.isFourWheelDrive = isFourWheelDrive;
    }
}
