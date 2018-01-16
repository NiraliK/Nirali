
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author niralikantaria
 */
public class Screen {
    // all variables are inizalized 
    private String direction;
    private String hallway;
    private String nextHallway;
    private String nextDirection;
    private BufferedImage image;
    private boolean blocked;

    //method created 
    public Screen(String hallway, Scanner input) {
        //stores hallway info
        this.hallway = hallway;
        //stores direction info 
        this.direction = input.next();
        //filename inouted to the next info
        String filename = input.next();
        //boolean created to check if player front is clear 
        this.blocked = input.nextBoolean();
        
        // if the path is not blocked 
        if (blocked == false) {
            //the next hallways info is stored 
            nextHallway = input.next();
            //the next directions info is stored 
            nextDirection = input.next();
        }
        //the images are loaded into the file 
        try {
            image = ImageIO.read(new File("images/" + filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
        input.nextLine();
    }
    
    /**
     * Return the hallway 
     * @return 
     */
    public String getHallway() {
        return this.hallway;
    }
    
    /**
     * Return the direction 
     * @return 
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Return the image 
     * @return 
     */
    public BufferedImage getImage() {
        return this.image;
    }

    /** 
     * Return to if path is unblocked 
     * @return 
     */
    public boolean blocked() {
        return this.blocked;
    }

    /**
     * Return the next hallway 
     * @return 
     */
    public String getNextHallway() {
        return nextHallway;
    }

    /**
     * Return the next direction
     * @return 
     */
    public String getNextDirection() {
        return this.nextDirection;

    }

}
