
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

    private String direction;
    private String hallway;
    private String nextHallway;
    private String nextDirection;
    private BufferedImage image;
    private boolean blocked;

    public Screen(String hallway, Scanner input) {
        this.hallway = hallway;
        this.direction = input.next();
        String filename = input.next();
        this.blocked = input.nextBoolean();

        if (blocked == false) {
            nextHallway = input.next();
            nextDirection = input.next();
        }

        try {
            image = ImageIO.read(new File("images/" + filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
        input.nextLine();
    }

    public String getHallway() {
        return this.hallway;
    }

    public String getDirection() {
        return direction;
    }

    public BufferedImage getImage() {
        return this.image;
    }

    public boolean blocked() {
        return this.blocked;
    }

    public String getNextHallway() {
        return nextHallway;
    }

    public String getNextDirection() {
        return this.nextDirection;

    }

}
