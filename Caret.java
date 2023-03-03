import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Caret extends JPanel{
    ImageIcon image = new ImageIcon("Images/Puck1.png");
    int radius = 75;
    int x = Const.WIDTH/2-radius;
    int y = Const.HEIGHT/2-radius;

    Caret(boolean listener){
        JLabel label = new JLabel("", image, JLabel.CENTER);
        label.setPreferredSize(new Dimension(170,170));
        this.add(label);
        label.setVisible(true);
        this.setOpaque(false);
        if(listener) {
            this.addMouseMotionListener(new MouseMotionListener() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    System.out.println(e.getX() + " " + e.getY());
                }

                @Override
                public void mouseMoved(MouseEvent e) {
                    System.out.println("entered");
                }
            });
        }
        this.setVisible(true);
    }
    void set(int x, int y){
        this.x = x-radius; this.y = y-radius;
    }
}
