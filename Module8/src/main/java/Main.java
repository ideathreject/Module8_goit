public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape parallelepiped = new Parallelepiped();
        System.out.println(circle.getName());
        System.out.println(quad.getName());
        System.out.println(triangle.getName());
        System.out.println(rectangle.getName());
        System.out.println(parallelepiped.getName());
    }
}
