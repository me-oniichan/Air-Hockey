import javax.swing.*;
import java.awt.*;


public class Caret extends JLabel{
    //Position of Caret
    int x=0,y=0, radius=47;

    //Previous positions
    int histx, histy, pivotx, pivoty;

    //Velocity elements
    int velx, vely, prevx, prevy;

    Caret(){
        ImageIcon img = new ImageIcon(new ImageIcon("images/Puck1.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
        this.setIcon(img);
        this.setBounds(0,0,100,100);
        this.setVisible(true);

        new Timer(10, (e)->{
            velx = this.x-prevx;
            vely = this.y-prevy;
            prevy = this.y;
            prevx = this.x;
            System.out.println(velx+" "+vely);
        }).start();
    }

    void motion(int x, int y){
        if(y-radius > Constants.height/2) this.y = y-radius;
        this.x = x-radius;
    }

}