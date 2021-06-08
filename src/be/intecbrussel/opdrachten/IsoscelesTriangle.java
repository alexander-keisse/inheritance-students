package be.intecbrussel.opdrachten;

public class IsoscelesTriangle extends Triangle {

    private static int count;

    {
        count++;
    }

    public IsoscelesTriangle() {
    }

    public IsoscelesTriangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public IsoscelesTriangle(int x, int y, int height, int width) {
        this(width, height);
        setPosition(x, y);
    }

    public IsoscelesTriangle(IsoscelesTriangle triangle) {
        super(triangle);
    }


    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setPerpendicular(width/2);
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
        super.setWidth(perpendicular*2);
    }

    public static int getCount() {
        return count;
    }
}
