import java.awt.*;

public class Square {
    private int xPoint;
    private int yPoint;
    private int width;
    private int height;
    private String color;
    private boolean isVisible;

    public Square() {
        xPoint = 233;
        yPoint = 233;
        width = 233;
        height = 233;
        color = "blue";
        isVisible = false;
    }

    public void makeVisible() {
        isVisible = true;
        draw();
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

    public void slowMoveHorizontal(int dis) {

        int per;

        if (dis < 0) {
            per = -1;
            dis = Math.abs(dis);
        } else {
            per = 1;
        }

        for (int i = 0; i < dis; i++) {
            Canvas.wait(500);
            xPoint += per;
            draw();
        }

    }

    public void slowMoveVertical(int dis) {

        int per;

        if (dis < 0) {
            per = -1;
            dis = Math.abs(dis);
        } else {
            per = 1;
        }

        for (int i = 0; i < dis; i++) {
            Canvas.wait(500);
            yPoint += per;
            draw();
        }

    }

    public void changeSize(int newWidth, int newHeight) {
        erase();
        width = newWidth;
        height = newHeight;
        draw();
    }

    public void changeColor(String newColor) {
        color = newColor;
        draw();
    }

    private void draw() {
        if (isVisible) {
            Canvas canvas = Canvas.getSingleCanvas();
            canvas.draw(this, color, new Rectangle(xPoint, yPoint, width, height));
            canvas.wait(1000);
        }
    }

    private void erase() {
        if (isVisible) {
            Canvas canvas = Canvas.getSingleCanvas();
            canvas.erase(this);
        }
    }




}