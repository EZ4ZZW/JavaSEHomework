import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.image.ImageObserver;
import java.lang.reflect.Array;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.AttributedCharacterIterator;
import java.util.Arrays;

/**
 * @author : EZ4ZZW
 * @date : 2020/9/16
 * @email: ez4zzw@163.com
 */


public class Main {
    public static void main(String[] args) {
        Square square = new Square(10, 10, 100, 100);
        square.canvas.setVisible();
        square.draw();
    }
}