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
