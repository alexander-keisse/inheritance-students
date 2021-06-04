package be.intecbrussel.opdrachten;

public class SquareApp {

    public static void main(String[] args) {

        Square square = new Square();

        square.setHeight(15);
        square.setWidth(24);
        square.setPosition(1, -7);

        System.out.println("Square height: " + square.getHeight());
        System.out.println("Square width: " + square.getWidth());
        System.out.println("Square position (x, y): " + square.getX() + " " + square.getY());

        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());

        square.setSide(5);

        System.out.println("Square height: " + square.getHeight());
        System.out.println("Square width: " + square.getWidth());

        System.out.println("Square side is: " + square.getSide());

        square.setSide(-14);
        System.out.println("Square side is: " + square.getSide());



    }

}
