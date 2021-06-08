package be.intecbrussel.opdrachten;

public class App {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, -27, 25, 88);
        Rectangle sameContent = new Rectangle(4, -27, 25, 88);
        Rectangle differentContent = new Rectangle(4, 99, 55, 86);

        System.out.println("rectangle equals sameContent: " + rectangle.equals(sameContent));

        System.out.println("rectangle hashcode: " + rectangle.hashCode());
        System.out.println("sameContent hashcode: " + sameContent.hashCode());

        System.out.println("");

        System.out.println("rectangle equals differentContent: " + rectangle.equals(differentContent));

        System.out.println("rectangle hashcode: " + rectangle.hashCode());
        System.out.println("differentContent hashcode: " + differentContent.hashCode());

        System.out.println(null instanceof Rectangle);

        // ****************************************************

        Triangle triangle = new Triangle(24, 55, 23);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(55, 75);
        Circle circle = new Circle(14, 5, 88);
        Square square = new Square(25, 81, 74);


        System.out.println(triangle);
        System.out.println(isoscelesTriangle);
        System.out.println(circle);
        System.out.println(square);

        // ******************************************

        System.out.println();

        Shape[] shapes = new Shape[10];

        shapes[0] = rectangle;
        shapes[1] = sameContent;
        shapes[2] = differentContent;
        shapes[3] = triangle;
        shapes[4] = isoscelesTriangle;
        shapes[5] = circle;
        shapes[6] = square;
        shapes[7] = square;
        shapes[8] = square;
        shapes[9] = square;

        for (int i = 0; i < shapes.length; i++) {

            System.out.println(shapes[i].getArea());
            System.out.println(shapes[i].getPerimeter());
            System.out.println("(" + shapes[i].getX() + " " + shapes[i].getY() + ")");


        }

    }

}
