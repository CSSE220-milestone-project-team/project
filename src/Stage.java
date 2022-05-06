import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Stage {
    private int x;
    private int y;
    private int length;
    private int thickness;

    public Stage(int k) {
        Random r = new Random();
        this.length = r.nextInt(100, 150);
        if (k == 1) {
            this.x = r.nextInt(50, 100);
            this.y = r.nextInt(300, 350);
        } else if (k == 2) {
            this.x = r.nextInt(300, 350);
            this.y = r.nextInt(250, 300);
        } else if (k == 3) {
            this.x = r.nextInt(50, 100);
            this.y = r.nextInt(200, 250);
        } else if (k == 4) {
            this.x = r.nextInt(300, 350);
            this.y = r.nextInt(150, 200);
        } else {
            this.x = r.nextInt(50, 100);
            this.y = r.nextInt(100, 150);
        }

    }

    public void drawOn(Graphics2D g2) {
        new Random();
        g2.setColor(Color.black);
        g2.fillRect(this.x, this.y, this.length, 10);
    }
}