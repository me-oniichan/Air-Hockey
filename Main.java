import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame root = new JFrame();
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Board board = new Board();
//        board.setVisible(true);

        root.add(board);
        root.pack();
        root.setLocationRelativeTo(null);
        root.setVisible(true);
    }
}