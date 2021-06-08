package be.intecbrussel.opdrachten;

public class Circle extends Shape {

    private int radius;
    public static final int ANGLES = 0;
    private static int count;

    {
        count++;
    }

    public Circle() {
        this(0,0,0);
    }

    public Circle(int radius) {
        this(radius,0,0);
    }

    public Circle(int radius, int x, int y) {
        setPosition(x,y);
        setRadius(radius);
    }

    public Circle(Circle circle) {
        this(circle.radius,circle.getX(),circle.getY());
    }

    public void setRadius(int radius){
        this.radius = (radius<0)?-radius:radius;
    }

    public int getRadius() {
        return radius;
    }

    public void grow(int dr) {
        radius+=dr;
        if(radius <0) radius = 0;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return getRadius() == circle.getRadius();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getRadius();
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}

