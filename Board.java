import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    Image image;
    Caret player1, player2;
    Board(Caret player1, Caret player2){
        image  = new ImageIcon("Images/Background.png").getImage();
        this.setPreferredSize(new Dimension(480,830));
        this.setOpaque(false);
        this.setLayout(null);

        this.player1 = player1;

        this.add(player1);
        this.add(player2);
        this.setVisible(true);
    }
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D canvas = (Graphics2D)g;
        player1.setLocation(player1.x,player1.y);
        canvas.drawImage(image,0,0,Const.WIDTH, Const.HEIGHT, null);
//        canvas.drawImage(player1.image, player1.x, player1.y, 150, 150, null);
    }
}
