import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Stage {
    private int x;
    private int y;
    private int length;
    private int thickness;

    public  Stage(int k){
        Random r = new Random();
        System.out.println("in stage");
        //stage in range 1:
        if(k == 1){
            this.x = r.nextInt(50, 100);
            this.y = r.nextInt(300, 350);
        }

        //stage in range 2:
        else if(k == 2){
            this.x = r.nextInt(300,350);
            this.y = r.nextInt(250, 300);
        }

        else if(k == 3){
            this.x = r.nextInt(50,100);
            this.y = r.nextInt(200,250);
        }

        else if(k == 4){
            this.x = r.nextInt(300,350);
            this.y = r.nextInt(150,200);
        }

        else{
            this.x = r.nextInt(50, 100);
            this.y = r.nextInt(100,150);
        }

    }

    public void drawOn(Graphics2D g2){
        Random r = new Random();
        g2.setColor(Color.black);
        g2.fillRect(this.x, this.y, r.nextInt(100,150), 10);
    }
}
