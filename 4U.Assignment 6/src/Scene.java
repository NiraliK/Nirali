
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author niralikantaria
 */
public class Scene {

    private ArrayList<Screen> screens;
    private String initialHallway;
    public String initialDirection;

    public Scene(String fileName) {
        try {
            Scanner input = new Scanner(new File(fileName));
            this.initialHallway = input.next();
            this.initialDirection = input.next();

            while (input.hasNext()) {
                String hallway = input.nextLine();

                for (int i = 0; i < 4; i++) {
                    Screen s = new Screen(hallway, input);
                    screens.add(s);
                }
            }
            for (int i = 0; i < 4; i++) {

            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
 
    public Screen getScreen(String hallway, String direction){
        for(Screen s : screens){
            if(s.getHallway().equals(hallway) && s.getDirection().equals(direction)){
                return s;
            }
        }
        return null;
    }
    
    public String getInitialHallway(){
        return initialHallway;
    }
    
    public String getInitialDirection(){
        return initialDirection;
    }


}
