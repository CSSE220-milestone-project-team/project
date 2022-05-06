import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.io.IOException;
import java.util.Scanner;


public class Component extends JComponent {

    private ArrayList<Stage> stage;

    public Component() throws IOException {

        //construct 5 stages
        this.stage = new ArrayList<Stage>();
        for(int k = 0; k < 5; k ++) {
            this.stage.add(new Stage(k));

        }
        handleException();




    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        for(Stage stage: this.stage){
            stage.drawOn(g2);
        }

        Font font= new Font("UTF-8", Font.BOLD,20);
        g.setFont(font);

        g.drawString(String.valueOf(lines),0,20);

    }

    List<String> lines = Files.readAllLines(Paths.get("level.txt"));


    Scanner s1;
    public void handleException() throws FileNotFoundException {
        try{
            s1= new Scanner(new File("level.txt"));
        }
        catch(IOException e){
            System.err.println("File not Found!!!");
        }

    }






//    public void drawlevelText(Graphics g){
//        g.drawLine(100,100,200,200);
//        g.drawRect(100,100,200,200);
//        Font font= new Font("UTF-8", Font.BOLD,30);
//        g.setFont(font);
//        g.drawString((AttributedCharacterIterator) lines,200,200);
//
//    }
}
