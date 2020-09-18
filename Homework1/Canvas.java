import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.function.ObjIntConsumer;

/**
 * @author : EZ4ZZW
 * @date : 2020/9/18
 * @email: ez4zzw@163.com
 */


public class Canvas {
    private JFrame frame;
    private JPanel panel;
    private Graphics2D g2d;
    private List<Object> shapes;
    private Image drawImage;


    private static Canvas drawPanel;

    public static Canvas getDrawPanel() {
        if(drawPanel == null) {
            drawPanel = new Canvas("Hello This is my JavaSEHomework", 500, 300);
        }
        return drawPanel;
    }

    public void setVisible() {
        if (g2d == null) {
            Dimension size = panel.getSize();
            drawImage = panel.createImage(size.width,size.height);
            g2d = (Graphics2D)drawImage.getGraphics();
            g2d.fillRect(0,0,size.width,size.height);
            g2d.setColor(Color.white);
        }
    }

    Canvas(String Title, int width, int height) {
        frame = new JFrame();
        panel = new JPanel();
        frame.setContentPane(panel);
        frame.setTitle(Title);
        frame.setLocation(100,100);
        panel.setPreferredSize(new Dimension(width, height));
        // Automatically Change the size
        frame.pack();
    }

    public void Draw(Shape shape) {
        g2d.fill(shape);
    }

    public void erase() {
        //shapes.remove(shapeToDelete);
        Dimension size = panel.getSize();
        g2d.fill(new Rectangle(0,0,size.width,size.height));
        redraw();
    }

    private void redraw() {
        erase();
    }

    private class shapeDetail {
        private Shape shape;

        public shapeDetail(Shape shape) {
            this.shape = shape;
        }

        public void draw(Graphics2D g2d) {
            g2d.fill(shape);
        }

    }

}
