import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Canvas {

    private static Canvas singleCanvas;

    // get the singleCanvas to draw
    public static Canvas getSingleCanvas() {
        if (singleCanvas == null) {
            singleCanvas = new Canvas("Homework", 1000, 800, Color.white);
        }
        singleCanvas.setVisible(true);
        return singleCanvas;
    }

    // Variable and Instance
    private JFrame frame;
    private CanvasPane canvas;
    private Graphics2D g2d;
    private Color background;
    private Image canvasImage;
    private List<Object> objects;
    private HashMap<Object, myShape> shapes;

    // creator
    private Canvas(String title, int width, int height, Color color) {
        frame = new JFrame();
        canvas = new CanvasPane();
        frame.setContentPane(canvas);
        frame.setTitle(title);
        frame.setLocation(30, 30);
        canvas.setPreferredSize(new Dimension(width,height));
        background = color;
        frame.pack();
        objects = new ArrayList<Object>();
        shapes = new HashMap<Object, myShape>();
    }

    // Change the visibility
    public void setVisible(boolean isVisible) {
        if (g2d == null) {
            Dimension size = canvas.getSize();
            canvasImage = canvas.createImage(size.width, size.height);
            g2d = (Graphics2D)canvasImage.getGraphics();
            g2d.setColor(background);
            g2d.fillRect(0, 0, size.width, size.height);
            g2d.setColor(Color.black);
        }
        frame.setVisible(isVisible);
    }

    // Draw the shapes
    public void draw(Object object, String color, Shape shape) {

        // wait to add list and hash map
        objects.remove(object);
        objects.add(object);
        shapes.put(object, new myShape(shape, color));
        redraw();
    }

    // erase one shape
    public void erase(Object objectToDelete) {
        objects.remove(objectToDelete);
        shapes.remove(objectToDelete);
        redraw();
    }

    // Clean the canvas
    // @email Maybe have bugs
    private void erase() {
        Color original = g2d.getColor();
        g2d.setColor(background);
        //g2d.setColor(background);
        Dimension size = canvas.getSize();
        g2d.fill(new Rectangle(0,0,size.width,size.height));
        g2d.setColor(original);
    }


    private void redraw() {
        erase();
        for (Object shape : objects) {
            shapes.get(shape).draw(g2d);
        }
        canvas.repaint();
    }

    // to show the change , advice millisecond be 1000*10
    public static void wait(int millisecond) {
        try {
            Thread.sleep(millisecond);
        } catch (Exception e) {
            // do something
        }
    }

    public void setForegroundColor(String colorString)
    {
        if(colorString.equals("red")) {
            g2d.setColor(new Color(235, 25, 25));
        }
        else if(colorString.equals("black")) {
            g2d.setColor(Color.black);
        }
        else if(colorString.equals("blue")) {
            g2d.setColor(new Color(30, 75, 220));
        }
        else if(colorString.equals("yellow")) {
            g2d.setColor(new Color(255, 230, 0));
        }
        else if(colorString.equals("green")) {
            g2d.setColor(new Color(80, 160, 60));
        }
        else if(colorString.equals("magenta")) {
            g2d.setColor(Color.magenta);
        }
        else if(colorString.equals("white")) {
            g2d.setColor(Color.white);
        }
        else {
            g2d.setColor(Color.black);
        }
    }

    private class myShape {

        private Shape shape;
        private String colorName;

        public myShape(Shape shape, String color) {
            this.shape = shape;
            colorName = color;
        }

        public void draw(Graphics2D G2d) {
            setForegroundColor(colorName);
            G2d.fill(shape);
        }

    }



    private class CanvasPane extends JPanel {
        public void paint(Graphics g) {
            g.drawImage(canvasImage, 0, 0, null);
        }
    }

}
