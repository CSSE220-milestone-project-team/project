import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.AttributedCharacterIterator;
import java.util.List;


public class Viewer extends JFrame {


    public static void main(String[] args) throws IOException {
        new Viewer();
    }

    public Viewer() throws IOException {
        final String frameTitle = "Bomb Jack";
        JFrame frame = new JFrame();
        frame.setTitle(frameTitle);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setSize((new Dimension(600, 400)));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label= new JLabel("Level");
        label.setText("Level");

        JComponent component = new Component();
        frame.add(component,BorderLayout.CENTER);
        frame.setVisible(true);


    }





}
