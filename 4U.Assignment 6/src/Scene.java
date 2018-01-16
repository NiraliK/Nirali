
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
    
    //array created to go through the screens 
    private ArrayList<Screen> screens;
    //instance varibles initialized 
    private String initialHallway;
    public String initialDirection;

    //method created 
    public Scene(String fileName) {
        try {
            //scanner for textfile
            Scanner input = new Scanner(new File(fileName));
            //store the intial hallway 
            this.initialHallway = input.next();
            //store the intial direction 
            this.initialDirection = input.next();
            
            //while loop created to go to the end of the file 
            while (input.hasNext()) {
                String hallway = input.nextLine();
                //for loop created to create the screens by using the scanner 
                for (int i = 0; i < 4; i++) {
                    Screen s = new Screen(hallway, input);
                    //screen added every time 
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
