package be.intecbrussel.opdrachten;

public abstract class Shape {

    private int x;
    private int y;
    private static int count;

    {
        System.out.println("Super Class shape code block triggered!");
        count++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract int getArea();

    public abstract int getPerimeter();

    public static int getCount() {
        return count;
    }
}
