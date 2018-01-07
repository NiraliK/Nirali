/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niralikantaria
 */
public class Controller {

    private GUI gui;
    private Scene scene;
    private String hallway;
    private String direction;

    public Controller(GUI gui, Scene scene) {
        this.gui = gui;
        this.scene = scene;
        this.direction = scene.getInitialDirection();
        this.hallway = scene.getInitialHallway();

        gui.setController(this);

        Screen start = scene.getScreen(hallway, direction);
        gui.setImage(start.getImage());
    }

    public void goNorth() {
        Screen current = scene.getScreen(hallway, direction);
        //ask if we can go north
        if (current.blocked() == false && direction.equals("N")) {
            Screen newScreen = scene.getScreen(hallway, direction);
            gui.setImage(newScreen.getImage());
        }
    } 
}
