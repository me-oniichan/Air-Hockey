import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    Image image;
    Caret player1, player2;
    Board(Caret player1, Caret player2){
        image  = new ImageIcon("Images/Background.png").getImage();
        this.setPreferredSize(new Dimension(480,830));
        this.setBackground(Color.black);
        this.player1 = player1;
        this.player2 = player2;
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D canvas = (Graphics2D)g;
        canvas.drawImage(image,0,0,Const.WIDTH, Const.HEIGHT, null);
        canvas.drawImage(player1.image, player1.x, player1.y, 150, 150, null);
    }
}
