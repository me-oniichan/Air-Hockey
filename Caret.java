import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Caret extends JPanel{
    ImageIcon image = new ImageIcon("Images/Puck1.png");
    int radius = 75;
    int x = Const.WIDTH/2-radius;
    int y = Const.HEIGHT/2-radius;

    int histx =x, histy=y;
    int posx,posy;

    Caret(boolean listener){
        JLabel label = new JLabel("", image, JLabel.CENTER);
        label.setPreferredSize(new Dimension(170,170));
        this.add(label);
        label.setVisible(true);
        this.setOpaque(false);
        if(listener) {
            this.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {}
                @Override
                public void mousePressed(MouseEvent e) {
                    posx = e.getXOnScreen(); posy= e.getYOnScreen();
                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }
                @Override
                public void mouseEntered(MouseEvent e) {}
                @Override
                public void mouseExited(MouseEvent e) {}
            });
            this.addMouseMotionListener(new MouseMotionListener() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    int delx = e.getXOnScreen()-posx, dely = e.getYOnScreen()-posy;
                    System.out.println(delx+" "+dely);
                    move_(delx,dely);
                }

                @Override
                public void mouseMoved(MouseEvent e) {
//                    System.out.println("entered");
                }
            });
        }
        this.setVisible(true);
    }
    void move_(int x, int y){
        System.out.println(posx);
        this.x=histx+x; this.y=histy+y;
    }
}
