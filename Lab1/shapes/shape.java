public class shape {
    public static void main(String[] args) {
        Circle circle = new Circle(new myPoint(5, 5), 3.5);
        Trapezoid trapezoid = new Trapezoid(
                new myPoint(1, 1),
                new myPoint(4, 1),
                new myPoint(7, -2),
                new myPoint(0, -2)
        );
        System.out.println("The Circle's Area is " + circle.getArea());
        System.out.println("The Trapezoid's Area is " + trapezoid.getAreaByShape());
        System.out.println("The Trapezoid's Area is " + trapezoid.getAreaByVector());
    }
}
