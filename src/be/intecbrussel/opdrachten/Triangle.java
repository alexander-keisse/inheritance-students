package be.intecbrussel.opdrachten;

public class Triangle extends Shape {

    public static final int ANGLES = 3;
    private static int count = 0;

    private int height;
    private int width;
    private int perpendicular;

    {
        count++;
    }

    public Triangle() {

    }

    public Triangle(int width, int height, int perpendicular) {
        setWidth(width);
        setHeight(height);
        setPerpendicular(perpendicular);
    }

    public Triangle(int x, int y, int height, int width, int perpendicular) {
        setX(x);
        setY(y);
        this.height = height;
        this.width = width;
        this.perpendicular = perpendicular;
    }

    public Triangle(Triangle triangle) {
        this(triangle.getX(), triangle.getY(), triangle.getHeight(), triangle.getWidth(), triangle.getPerpendicular());
    }

    public static int getCount() {
        return count;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height < 0 ? -height : height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width < 0 ? -width : width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular < 0 ? -perpendicular : perpendicular;
    }

    @Override
    public double getArea() {
        return (getWidth() * getHeight()) / 2;
    }

    @Override
    public double getPerimeter() {
        return width + Math.hypot(height,perpendicular) + Math.hypot(height,(width-perpendicular));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        if (getHeight() != triangle.getHeight()) return false;
        if (getWidth() != triangle.getWidth()) return false;
        return getPerpendicular() == triangle.getPerpendicular();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getHeight();
        result = 31 * result + getWidth();
        result = 31 * result + getPerpendicular();
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                "} " + super.toString();
    }
}
