import javax.swing.*;
import java.util.ArrayList;

public class Component extends JComponent {

    private ArrayList<Stage> stage;

    public Component(){

        //construct 5 stages
        this.stage = new ArrayList<Stage>();
        for(int k = 0; k < 5; k ++){
            this.stage.add(new Stage(k));
        }


    }
}
