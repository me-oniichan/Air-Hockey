package entities;

import javax.swing.*;
import java.awt.*;

public class Puck extends JLabel {
    public int x;
    public int y;
    ImageIcon icon;
    //velocity component
    public double vx;
    public double vy;
    public Puck(){
        icon = new ImageIcon(Constants.puck);
        this.setIcon(icon);
        this.setBounds(0, 0, 80, 80);
        this.setVisible(true);

//        new Timer(10, e->{
//            this.x+=Math.floor(vx); this.y+=Math.floor(vy);
//            vx-=(Constants.drag*vx); vy-=(Constants.drag*vy);
//            if (x < 520 + Constants.radius || x > 1015 - Constants.radius) vx*=-1;
//            if (y <= Constants.radius) vy*=-1;
//        }).start();
    }
}
