import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    Image image;
    Board(){
        image  = new ImageIcon("Images/Background.png").getImage();
        System.out.println(image.getWidth(null));
        this.setPreferredSize(new Dimension(479,830));
        this.setBackground(Color.black);
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D canvas = (Graphics2D)g;
        canvas.drawImage(image,0,0,479, 830, null);
    }
}
