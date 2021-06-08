package be.intecbrussel.opdrachten;

public abstract class Shape {

    private int x;
    private int y;
    private static int count;

    {
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

    public abstract double getArea();

    public abstract double getPerimeter();

    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        if (x != shape.x) return false;
        return y == shape.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
