package be.intecbrussel.opdrachten;

public class Rectangle {

    private static int count;
    public static final int ANGLES = 4;

    private int x;
    private int y;
    private int width;
    private int height;

    {
        count++;
    }

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Rectangle.count = count;
    }

    public static int getANGLES() {
        return ANGLES;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width < 0 ? -width : width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height < 0 ? -height : height;
    }

    public void grow(int d) {
        width += d;
        height += d;
        if (width < 0) width = 0;
        if (height < 0) height = 0;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return (width + height) * 2;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
