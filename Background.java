import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

public class Background extends JLabel{
    Caret player1 = new Caret();
    Background(){
        ImageIcon bgimg = new ImageIcon("images/Background.png");
        this.setIcon(bgimg);
        this.setHorizontalAlignment(JLabel.CENTER);
//        this.setPreferredSize(new Dimension(Constants.width, Constants.height));
        this.add(player1);

        this.setVisible(true);

    }

    void placeCaret(){
        player1.setLocation(getWidth()/2-player1.radius, getHeight()/2-player1.radius);
    }
}