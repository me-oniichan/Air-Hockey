import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    ImageIcon image;
    Caret player1, player2;
    Board(Caret player1, Caret player2){
        image  = new ImageIcon("Images/Background.png");
        this.player1 = player1;

        JLabel label = new JLabel("", image, JLabel.CENTER);
        label.setBounds(0,0,480,830);
        this.add(label);
        label.setVisible(true);

        this.setPreferredSize(new Dimension(480,830));
        this.setOpaque(false);
        this.setLayout(null);

        this.add(this.player1);
        this.player1.setBounds(player1.x,player1.y, 150,150);
        this.add(player2);
        this.setVisible(true);

    }
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D canvas = (Graphics2D)g;
        player1.setLocation(player1.x,player1.y);

//        canvas.drawImage(image,0,0,Const.WIDTH, Const.HEIGHT, null);
    }
}