import javax.swing.*;
import java.awt.*;


public class Caret extends JLabel {
    //Position of Caret
    int x = 0, y = 0, radius = 37;


    //Velocity elements
    int velx, vely, prevx, prevy;

    Caret() {
        ImageIcon img = new ImageIcon(new ImageIcon("images/Puck1.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        this.setIcon(img);
        this.setBounds(0, 0, 80, 80);
        this.setVisible(true);

        new Timer(10, (e) -> {
            velx = this.x - prevx;
            vely = this.y - prevy;
            prevy = this.y;
            prevx = this.x;
        }).start();
    }

    void motion(int x, int y) {
        if (y - radius > Constants.height / 2) this.y = y - radius;
        this.x = x - radius;
    }

}