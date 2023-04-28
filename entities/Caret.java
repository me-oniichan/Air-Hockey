package entities;

import javax.swing.*;


public class Caret extends JLabel {
    //Position of entities.Caret
    public int x = 0;
    public int y = 0;
    public int radius = 40;


    //Velocity elements
    public int velx;
    public int vely;
    int prevx;
    int prevy;

    public Caret() {
        ImageIcon img = new ImageIcon(Constants.mallet1);
        this.setIcon(img);
        this.setBounds(0, 0, 80, 80);
        this.setVisible(true);

        new Timer(10, (e) -> {
            velx = this.x - prevx;
            vely = this.y - prevy;
            prevy = this.y;
            prevx = this.x;
        }).start();
    }

    public void motion(int x, int y) {
        if (y - radius > Constants.height / 2) this.y = y - radius;
        this.x = x - radius;
    }

    public void init(int width, int height) {
        this.x = width / 2 - Constants.radius;
        this.y = height / 2 - Constants.radius + 100;
    }

}