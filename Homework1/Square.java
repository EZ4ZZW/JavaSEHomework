import java.awt.*;

/**
 * @author : EZ4ZZW
 * @date : 2020/9/18
 * @email: ez4zzw@163.com
 */


public class Square {
    private int xPoint;
    private int yPoint;
    private int width;
    private int height;

    public Square(int xPoint, int yPoint, int width, int height) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
        this.width = width;
        this.height = height;
    }

    Canvas canvas = Canvas.getDrawPanel();

    public void draw() {
        canvas.Draw(new Rectangle(xPoint, yPoint, width, height));
    }



}
