package be.intecbrussel;

public class App {

    public static void main(String[] args) {

        Car mazda = new Car("Mazda", "RX7", "Yellow");

        mazda.accelerate();
        mazda.slowDown();
        mazda.turnLeft();
        mazda.slowDown();

        System.out.println(mazda + " is reaching her destination.");

        // *****************************************************

        SUV jeep = new SUV("Toyota", "Land Cruiser", "Green");

        jeep.accelerate();
        jeep.slowDown();

        jeep.turnRight();

        jeep.slowDown();

        System.out.println(jeep + " is reaching her destination.");


        // ******************************************************

        ElectricCar tesla = new ElectricCar("Tesla", "X", "White", 99.9F);

        tesla.accelerate();
        tesla.slowDown();

        tesla.turnLeft();

        tesla.slowDown();
        tesla.chargeBattery(50);

        System.out.println(tesla);

        // ************************************************************

        SportsCar rx8 = new SportsCar("Mazda", "RX8", "White", -200);

        rx8.setHp(-200);

        System.out.println(rx8);

        // ***************************************************************

        Convertible mx5 = new Convertible("Mazda", "MX5", "Red");
        mx5.switchRoof();

    }

}
