import javax.swing.*;
import java.awt.*;

public class Background extends JLabel {
    Background(){
        ImageIcon bgimg = new ImageIcon("images/Background.png");
        this.setIcon(bgimg);
//        this.setPreferredSize(new Dimension(Constants.width, Constants.height));
        this.setBounds(0,0,Constants.width, Constants.height);
        this.setVisible(true);

    }
}