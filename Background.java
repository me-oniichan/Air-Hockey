import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Background extends JLabel{
    Caret player1 = new Caret();
    Background() throws AWTException {
        ImageIcon bgimg = new ImageIcon("images/Background.png");
        this.setIcon(bgimg);
        this.setHorizontalAlignment(JLabel.CENTER);
//        this.setPreferredSize(new Dimension(Constants.width, Constants.height));
        this.add(player1);

        this.setVisible(true);
        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                player1.motion(e.getX(), e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int x= e.getXOnScreen(), y=e.getYOnScreen();
                //Restrict motion in y direction
                if(y<getHeight()/2+player1.radius) y = getHeight()/2+player1.radius;
                else if (y>getHeight()-player1.radius)  y = getHeight()-player1.radius;

                //Restrict motion in x direction
                if(x<520+player1.radius) x=520+player1.radius;
                else if (x>1015-player1.radius)  x=1015-player1.radius;

                player1.motion(x, y);
//                System.out.println(x+" "+y);
            }
        });


//        Constants.startx = getWidth()
    }

    void moveCaret(){
        player1.setLocation(player1.x, player1.y);
    }

    void placeCaret() {
            Constants.r.mouseMove(getWidth()/2, getHeight()/2);
//        player1.setpos(getWidth()/2-player1.radius, getHeight()/2);
    }
}