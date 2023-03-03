import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame root = new JFrame();
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Board board = new Board(new Caret(true), new Caret(false));
//        System.out.println(board.player1.image.getWidth(null));

        root.add(board);
        root.pack();
        root.setLocationRelativeTo(null);
        root.setVisible(true);


        //Game loop

        new Timer(15, e -> board.repaint()).start();

    }
}