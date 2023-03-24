import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Caret extends JPanel{
    Image image;
    int radius = 75;
    int x = Const.WIDTH/2-radius;
    int y = Const.HEIGHT/2-radius;

    //origin for drag
    int histx =x, histy=y;

    //temp vars to handle drag
    int posx,posy;

    //velocity calculating components
    int velx, vely, lastx, lasty;

    Caret(boolean listener){
        image = new ImageIcon("Images/Puck1.png").getImage();
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
                    histx = x; histy= y;
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
                    System.out.println(velx+" "+vely);
                    move_(delx,dely);
                }

                @Override
                public void mouseMoved(MouseEvent e) {
                }
            });
        }
        this.setVisible(true);

        new Timer(15, e-> {
            velx = (this.x - lastx);
            vely = (this.y - lasty);
            lastx=this.x; lasty = this.y;
        }).start();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D canvas = (Graphics2D)g;
        canvas.drawImage(image, 0,0, 150,150, null);
    }

    void move_(int x, int y){
        this.x=histx+x; this.y=histy+y;
    }
}
