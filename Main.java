import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame {
    Background bg;

    Main() {
        this.setTitle("Air Hockey");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);
        this.setResizable(false);

        this.setBounds(0, 0, Constants.width, Constants.height);

        try {
            this.bg = new Background();
        } catch (Exception ignore) {
        }
        ;
        this.add(this.bg, BorderLayout.CENTER);

        this.setExtendedState(MAXIMIZED_BOTH | getExtendedState());
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
                bg.placeCaret();
            }
        });

        new Timer(12, (e) -> bg.moveCaret()).start();
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
