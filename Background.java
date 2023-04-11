import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Background extends JLabel {
    static Caret player1 = new Caret();
    static Puck puck = new Puck();

    static class Collisions{
        static boolean isCollison(int x1, int y1, int x2, int y2){
            return (x1-x2)*(x1-x2) + (y2-y1)*(y2-y1) <= Constants.radius*Constants.radius*4;
        }

        int getSlope(int x1, int y1, int x2, int y2){
            return 0;
        }

        public static void run() {
            if(isCollison(player1.x, player1.y, puck.x, puck.y)){
                puck.vx = player1.velx;
                puck.vy = player1.vely;
            }
        }
    }

    Background() throws AWTException {
        ImageIcon bgimg = new ImageIcon("images/Background.png");
        this.setIcon(bgimg);
        this.setHorizontalAlignment(JLabel.CENTER);
//        this.setPreferredSize(new Dimension(Constants.width, Constants.height));
        this.add(puck);
        this.add(player1);
        this.setVisible(true);
        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                mouseMoved(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getXOnScreen(), y = e.getYOnScreen();
                //Restrict motion in y direction
                if (y < getHeight() / 2 + player1.radius) y = getHeight() / 2 + player1.radius;
                else if (y > getHeight() - player1.radius) y = getHeight() - player1.radius;

                //Restrict motion in x direction
                if (x < 520 + player1.radius) x = 520 + player1.radius;
                else if (x > 1015 - player1.radius) x = 1015 - player1.radius;

                player1.motion(x, y);
            }
        });

        new Timer(10, e->{Collisions.run();}).start();
    }

    void moveCaret() {
        player1.setLocation(player1.x, player1.y);
        puck.setLocation(puck.x, puck.y);
    }

    void placeCaret() {
        Constants.r.mouseMove(getWidth() / 2, getHeight() / 2 + 200);
        puck.x = getWidth()/2-Constants.radius; puck.y = getHeight()/2-Constants.radius;
    }

}