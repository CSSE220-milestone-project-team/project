import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Player {
    private int x = 400;
    private int y = 320;
    private int moveSpeed = 15;
    private int life;

    public Player() {
    }

    public void moveLeft() {
        this.x -= this.moveSpeed;
    }

    public void moveRight() {
        this.x += this.moveSpeed;
    }

    public void moveUp() {
        this.y -= this.moveSpeed;
    }

    public void moveDown() {
        this.y += this.moveSpeed;
    }

    public void drawOn(Graphics2D g2) throws IOException {
        BufferedImage image = null;

        try {
            image = ImageIO.read(new File("hero.png"));
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        g2.drawImage(image, this.x, this.y, 30, 50, (ImageObserver) null);
    }
}