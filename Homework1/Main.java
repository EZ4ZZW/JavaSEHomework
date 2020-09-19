
public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.makeVisible();
        Circle circle = new Circle();
        circle.makeVisible();
        square.slowMoveVertical(100);
    }
}