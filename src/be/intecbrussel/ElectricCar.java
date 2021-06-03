package be.intecbrussel;

public class ElectricCar extends Car {

    private float batteryCharge = 100;

    public ElectricCar(String brand, String model, String color) {
        super(brand, model, color);
    }

    public ElectricCar(String brand, String model, String color, float batteryCharge) {
        super(brand, model, color);
        this.batteryCharge = batteryCharge;
    }

    public float getBatteryCharge() {
        return batteryCharge;
    }

    public void chargeBattery(float batteryCharge) {
        this.batteryCharge += batteryCharge;

        if (this.batteryCharge > 100) {
            this.batteryCharge = 100;
        }
    }

    @Override
    public void accelerate() {
        System.out.println("This is different from the accelerate method in the Super Class!");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCharge=" + batteryCharge +
                "} " + super.toString();
    }
}
