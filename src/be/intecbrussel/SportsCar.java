package be.intecbrussel;

public class SportsCar extends Car {

    private int hp;
    private String serialNumber;

    public SportsCar(String brand, String model, String color) {
        super(brand, model, color);
        hp = 110;
    }

    public SportsCar(String brand, String model, String color, int hp) {
        super(brand, model, color);
        setHp(hp);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp > 110 && hp < 1000) {
            this.hp = hp;
        } else {
            this.hp = 110;
        }
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "hp=" + hp +
                " serialNumber=" + serialNumber +
                "} " + super.toString();
    }
}
