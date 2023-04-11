import entities.Caret;
import entities.Constants;
import entities.Puck;

import java.awt.*;


public class Collision {
    static Caret player1 = Entities.player1;
    static Puck puck = Entities.puck;

    static boolean isCollison(int x1,  int y1, int x2, int y2){
        return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2) <= (Constants.radius-5)*(Constants.radius-5)*4;
    }

    static void run(){
        Point p = MouseInfo.getPointerInfo().getLocation();
        int newx = p.x-Constants.radius, newy = p.y-Constants.radius;

        if(newx <= 485+Constants.radius) newx = 485+ Constants.radius;
        else if (newx >= 975-Constants.radius) newx = 975-Constants.radius;

        if(newy <= Constants.height/2) newy = Constants.height/2;
        if(newy >= Constants.height-80) newy = Constants.height-80;


        if(isCollison(player1.x, player1.y, puck.x, puck.y)){
            puck.vx = player1.velx;
            puck.vy = player1.vely;
            if(puck.vx>25) puck.vx = 25;
            if(puck.vx<-25) puck.vx = -25;
            if(puck.vy>25) puck.vy = 25;
            if(puck.vy<-25) puck.vy = -25;

        }else{
             player1.x = newx; player1.y = newy;
        }

        newx = puck.x + puck.vx;
        newy = puck.y + puck.vy;

        if(newx <= 485+Constants.radius) {
            newx = 485+Constants.radius;
            puck.vx *= -1;
        }
        else if (newx >= 975-Constants.radius) {
            newx = 975-Constants.radius;
            puck.vx *= -1;
        }

        if(newy <= 0) {
            newy=0;
            puck.vy *= -1;
        }
        if(newy >= Constants.height-80) {
            newy=Constants.height-80;
            puck.vy *= -1;
        }
        puck.x = newx; puck.y = newy;

        System.out.println(newx+ " "+ Constants.width);
    }
}
