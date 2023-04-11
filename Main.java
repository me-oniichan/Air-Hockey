import entities.Caret;
import entities.Constants;
import entities.Puck;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
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


        try {
            this.bg = new Background();
        } catch (Exception ignore) {
        }
        ;
        this.add(this.bg, BorderLayout.CENTER);

        this.setExtendedState(MAXIMIZED_BOTH | getExtendedState());
        this.setVisible(true);

        Main ref = this;
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                player1.init(getWidth(), getHeight());
                puck.init(getWidth(), getHeight());
                Constants.width = bg.getWidth();
                Constants.height = bg.getHeight();
                ref.setMinimumSize(new Dimension(Constants.width, Constants.height));
            }
        });

        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Constants.width = bg.getWidth();
                Constants.height = bg.getHeight();
                player1.init(getWidth(), getHeight());
                puck.init(getWidth(), getHeight());
            }
        });
//        this.pack();

        new Gameloop();

    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
