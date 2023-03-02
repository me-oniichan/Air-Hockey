import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame root = new JFrame();
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Board board = new Board(new Caret(), new Caret());
        System.out.println(board.player1.image.getWidth(null));

        root.add(board);
        root.pack();
        root.setLocationRelativeTo(null);
        root.setVisible(true);
    }
}