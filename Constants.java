import java.awt.*;

final class Constants{
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
