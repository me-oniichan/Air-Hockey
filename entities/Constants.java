package entities;

import javax.swing.*;
import java.awt.*;

public final class Constants {
    final static double drag = 0.01d;
    static public Image puck = new ImageIcon("images/Puck3.png").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
    static public Image mallet1 = new ImageIcon("images/Puck1.png").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
    final public static int radius = 40;

    public static int width = 600;
    public static int height = 800;
    public static Robot r = null;

    static {
        try {
            r = new Robot();
        } catch (AWTException e) {
            System.out.println(e.getMessage());
        }
    }
}
