import entities.Caret;
import entities.Constants;
import entities.Puck;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame {
    Background bg;
    Caret player1 = Entities.player1;
    Puck puck = Entities.puck;

    Main() {
        this.setTitle("Air Hockey");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);
        this.setLocationRelativeTo(null);

        try {
            this.bg = new Background();
        } catch (Exception ignore) {
        }
        this.add(this.bg, BorderLayout.CENTER);

        this.setExtendedState(MAXIMIZED_BOTH | getExtendedState());
        this.setVisible(true);

        Entities.ref = this;
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                Constants.r.mouseMove(700, 400);
                player1.init(getWidth(), getHeight() + 100);
                puck.init(getWidth(), getHeight());
                Constants.width = getWidth();
                Constants.height = getHeight();
//                ref.setMinimumSize(new Dimension(Constants.width, Constants.height));
                System.out.println(getWidth() / 2 + " " + getHeight() / 2);
                System.out.println(Entities.ref.getMousePosition().x + " " + Entities.ref.getMousePosition().y);
            }
        });
//        this.pack();

        new Gameloop();

    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
