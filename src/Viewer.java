import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class Viewer extends JFrame {

    public static void main(String[] args) {
        new Viewer();
    }

    public Viewer(){
        JFrame frame = new JFrame();
        frame.setSize((new Dimension(600, 400)));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JComponent component = new Component();
        frame.add(component,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}