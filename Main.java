import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Main(){
        this.setTitle("Air Hockey");
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_VERT);
//        this.setPreferredSize(new Dimension(Constants.width, Constants.height));
//        this.setBounds(0,0,Constants.width, Constants.height);
        this.getContentPane().setBackground(Color.black);

        Background bg = new Background();
        this.add(bg, new GridBagConstraints());

//        this.setUndecorated(true);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Main main = new Main();
    }
}
