
public class Main {
    public static void main(String[] args) {


//        Square square = new Square();
//        square.makeVisible();
//        Circle circle = new Circle();
//        circle.makeVisible();
//        circle.slowMoveVertical(100);


        // 使用Canvas类的wait方法便于观察


        // 练习1-1
        Square square = new Square();
        Circle circle = new Circle();
        circle.makeVisible();
        square.makeVisible();


        // 练习1-2
        circle.moveDown(50); Canvas.wait(1000*2);
        circle.moveDown(50); Canvas.wait(1000*2);
        circle.moveDown(50); Canvas.wait(1000*2);
        circle.makeInVisible(); Canvas.wait(1000*2);
        circle.makeInVisible(); Canvas.wait(1000*2);


        // 练习1-3
        Circle circle1 = new Circle();
        circle1.makeVisible(); Canvas.wait(2000);
        circle1.moveHorizontal(-70); Canvas.wait(2000);


        // 练习1-16
        circle1.moveHorizontal(70); Canvas.wait(2000);
        circle1.slowMoveVertical(500);


    }
}