import java.awt.geom.Ellipse2D;

public class Circle {
    private int xPoint;
    private int yPoint;
    private int r;
    private String color;
    private boolean isVisible;

    public Circle() {
        xPoint = 100;
        yPoint = 100;
        r = 100;
        color = "red";
        isVisible = false;
    }

    public void makeVisible() {
        isVisible = true;
        draw();
    }

    public void makeInVisible() {
        erase();
        isVisible = false;
    }

    public void moveRight(int dis) {
        moveHorizontal(dis);
    }

    public void moveLeft(int dis) {
        moveHorizontal(-dis);
    }

    public void moveUp(int dis) {
        moveVertical(-dis);
    }

    public void moveDown(int dis) {
        moveVertical(dis);
    }


    public void moveHorizontal(int dis) {
        erase();
        xPoint += dis;
        draw();
    }

    public void moveVertical(int dis) {
        erase();
        yPoint += dis;
        draw();
    }

    public void slowMoveVertical(int dis) {

        int per;

        if (dis > 0) per = 5;
        else per = -5;

//        if (dis > 0) per = 1;
//        else per = -1;


        dis = (dis > 0 ? dis : Math.abs(dis));

        for (int i = 0; i < dis; i++) {
            Canvas.wait(500);
            yPoint += per;
            draw();
        }
    }

    public void slowMoveHorizontal(int dis) {

        int per;

        if (dis > 0) per = 1;
        else per = -1;

        dis = (dis > 0 ? dis : Math.abs(dis));

        for (int i = 0; i < dis; i++) {
            Canvas.wait(500);
            xPoint += per;
            draw();
        }
    }

    public void changeColor(String newColor) {
        color = newColor;
        draw();
    }

    public void changeSize(int d) {
        erase();
        r = d;
        draw();
    }

    private void draw() {
        if (isVisible) {
            Canvas canvas = Canvas.getSingleCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPoint,yPoint,r,r));
            canvas.wait(10);
        }
    }

    private void erase() {
        if (isVisible) {
            Canvas canvas = Canvas.getSingleCanvas();
            canvas.erase(this);
        }
    }

}
