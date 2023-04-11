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
//        this.setResizable(false);

        this.setBounds(0, 0, Constants.width, Constants.height);

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
                super.windowOpened(e);
                player1.init(getWidth(), getHeight());
            }

            @Override
            public void windowStateChanged(WindowEvent e) {
                super.windowStateChanged(e);
                player1.init(getWidth(), getHeight());
            }
        });

        new Timer(12, (e) -> bg.plotEntites()).start();
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
