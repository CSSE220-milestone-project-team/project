import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

public class Component extends JComponent{

    private ArrayList<Stage> stage;
    private Player player;

    public Component(){

        //construct 5 stages
        this.stage = new ArrayList<Stage>();
        for(int k = 0; k < 5; k ++){
            this.stage.add(new Stage(k));
        }

        this.player = new Player();


    }

    protected void moveLeft(){
        this.player.moveLeft();
        repaint();
    }

    protected void moveRight(){
        this.player.moveRight();
        repaint();
    }

    protected void moveUp(){
        this.player.moveUp();
        repaint();
    }
    protected void moveDown(){
        this.player.moveDown();
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        for(Stage stage: this.stage){
            stage.drawOn(g2);
        }
        try {
            this.player.drawOn(g2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
