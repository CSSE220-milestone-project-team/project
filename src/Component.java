import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Component extends JComponent {

    private ArrayList<Stage> stage;

    public Component(){

        //construct 5 stages
        this.stage = new ArrayList<Stage>();
        for(int k = 0; k < 5; k ++){
            this.stage.add(new Stage(k));
        }
        System.out.println(this.stage);  //status check


    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        for(Stage stage: this.stage){
            stage.drawOn(g2);
        }
    }
}
