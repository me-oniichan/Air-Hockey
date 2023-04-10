import javax.swing.*;

public class Puck extends JLabel {
    int x, y;
    ImageIcon icon;
    //velocity component
    int vx, vy;
    Puck(){
        icon = new ImageIcon(Constants.puck);
        this.setIcon(icon);
        this.setBounds(0, 0, 80, 80);
        this.setVisible(true);

        new Timer(10, e->{
            this.x+=vx; this.y+=vy;
        }).start();
    }
}
