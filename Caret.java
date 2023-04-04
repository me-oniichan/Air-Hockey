import javax.swing.*;
import java.awt.*;


public class Caret extends JLabel{
    //Position of Caret
    int x=0,y=0, radius=65;

    //Previous positions
    int histx, histy;

    //Velocity elements
    int velx, vely, prevx, prevy;

    Caret(){
        ImageIcon img = new ImageIcon(new ImageIcon("images/Puck1.png").getImage().getScaledInstance(130,130, Image.SCALE_DEFAULT));
        this.setIcon(img);
        this.setBounds(0,0,150,150);
        this.setVisible(true);
    }

    void motion(int x, int y){
        int delx = x-histx, dely=y-histy;
        this.x= delx+histx; this.y=dely+histy;
    }

    void setpos(int x, int y){
        this.x= x; this.y=y;
        histx = x; histy = y;
    }

}