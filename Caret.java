import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Caret extends JLabel implements MouseMotionListener {
    //Position of Caret
    int x=0,y=0, radius=75;

    //Previous positions
    int histx, histy;

    //Velocity elements
    int velx, vely, prevx, prevy;

    Caret(){
        ImageIcon img = new ImageIcon(new ImageIcon("images/Puck1.png").getImage().getScaledInstance(150,150, Image.SCALE_DEFAULT));
        this.setIcon(img);
        this.setBounds(0,0,150,150);
        this.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
