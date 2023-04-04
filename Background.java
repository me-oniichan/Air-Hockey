import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

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

    void moveCaret(){
        player1.setLocation(player1.x, player1.y);
    }

    void placeCaret(){
        player1.setpos(getWidth()/2-player1.radius, getHeight()/2);
    }
}