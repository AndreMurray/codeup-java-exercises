package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle r = Rectangle(3, 4);
        System.out.println(r.getPerimeter());
        System.out.println(r.getArea());

        Square s = new Square(5);
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
    }
}
