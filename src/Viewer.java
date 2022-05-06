import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;


public class Viewer extends JFrame implements KeyListener {

    public static void main(String[] args) throws IOException {
        new Viewer();
    }

    Component component;

    public Viewer() throws IOException {

        JFrame frame = new JFrame("Bomb Jack");
        frame.setSize((new Dimension(600, 400)));


        this.component = new Component();
        frame.add(component,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(173,216,230));
        frame.addKeyListener(this);
        frame.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.component.moveRight();
//            System.out.println("Right!");

        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.component.moveLeft();
//            System.out.println("Left key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.component.moveUp();
//            System.out.println("Left key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.component.moveDown();
//            System.out.println("Left key pressed");
        }
    }
    @Override public void keyTyped(KeyEvent e){}
    @Override public void keyReleased(KeyEvent e) {}


}
