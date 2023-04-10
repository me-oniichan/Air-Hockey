import javax.swing.*;
import java.awt.*;

final class Constants {
    final static double drag = 0.01d;
    static public Image puck = new ImageIcon("images/Puck3.png").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
    final public static int radius = 37;

    static int width = 600, height = 800;
    static Robot r = null;

    static {
        try {
            r = new Robot();
        } catch (AWTException e) {
            System.out.println(e.getMessage());
        }
    }
}
