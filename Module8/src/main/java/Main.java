public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape parallelepiped = new Parallelepiped();
        ShapePrinter shapePrinter = new ShapePrinter();

       // System.out.println(circle.getName());

        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(quad);
        shapePrinter.printShapeName(triangle);
        shapePrinter.printShapeName(rectangle);
        shapePrinter.printShapeName(parallelepiped);

    }
}
class ShapePrinter{
    public void printShapeName(Shape shape){

        System.out.println(shape.getName());
    }
}