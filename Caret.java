import javax.swing.*;
import java.awt.*;


public class Caret extends JLabel{
    //Position of Caret
    int x=0,y=0, radius=65;

    //Previous positions
    int histx, histy, pivotx, pivoty;

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
        histx=x; histy=y;
        int newx= delx+pivotx, newy=dely+pivoty;
        pivotx=newx; pivoty=newy;
        if(newx>0 && newx < Constants.width) this.x=newx;
        if(newy>0 && newy < Constants.height) this.y=newy;
    }

    void setpos(int x, int y){
        this.x= pivotx= x; this.y=pivoty=y;
        Point p = MouseInfo.getPointerInfo().getLocation().getLocation();
        histx = (int)p.getX(); histy = (int)p.getY();
    }

}