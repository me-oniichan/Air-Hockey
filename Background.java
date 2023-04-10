import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Background extends JLabel {
    Caret player1 = new Caret();
    Puck puck = new Puck();

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
    }

    void moveCaret() {
        player1.setLocation(player1.x, player1.y);
//        puck.setLocation(puck.x, puck.y);
    }

    void placeCaret() {
        Constants.r.mouseMove(getWidth() / 2, getHeight() / 2 + 200);
        puck.setLocation(getWidth()/2-Constants.radius, getHeight()/2-Constants.radius);
    }

}