import entities.*;

import javax.swing.*;

public class Gameloop {
    static Caret player1 = Entities.player1;
    static Puck puck =  Entities.puck;

    Gameloop() {
        Plotter plot = new Plotter();
        plot.start();
        new Timer(10, (e)->{Collision.run();}).start();
    }

    static class Plotter extends Thread{
        @Override
        public void run() {
            while(true){
                player1.setLocation(player1.x, player1.y);
                puck.setLocation(puck.x, puck.y);
            }
        }
    }

}
