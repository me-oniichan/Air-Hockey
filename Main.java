import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main extends JFrame{
    Background bg;
    Main(){
        this.setTitle("Air Hockey");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);

//        this.setPreferredSize(new Dimension(Constants.width, Constants.height));
        this.setBounds(0,0,Constants.width, Constants.height);


        this.bg = new Background();
        this.add(this.bg, BorderLayout.CENTER);

        this.setVisible(true);
        this.setExtendedState(this.getExtendedState() | MAXIMIZED_BOTH);
        try{
            this.setUndecorated(true);
        }catch (Exception e){};
//        pack();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
                main.bg.placeCaret();
            }
        });
    }
}
