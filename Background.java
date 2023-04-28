import entities.Caret;
import entities.Puck;

import javax.swing.*;
import java.awt.*;

public class Background extends JLabel {
    Caret player1 = Entities.player1;
    Puck puck = Entities.puck;

    Background() throws AWTException {
        ImageIcon bgimg = new ImageIcon("images/Background.png");
        this.setIcon(bgimg);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.add(puck);
        this.add(player1);
        this.setVisible(true);

        /*
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
         */
    }

}