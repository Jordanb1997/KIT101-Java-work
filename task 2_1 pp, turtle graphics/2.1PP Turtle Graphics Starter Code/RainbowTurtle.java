import java.awt.Color;
import kit101.turtle.Turtle;

/**
 * 2.1PP Turtle Graphics task to read some existing code that uses a predefined
 * class and to modify it to change the colour of each shape that the turtle
 * draws.
 *
 * @author Jordan Bannister 420545
 */
public class RainbowTurtle {

    public static void main(String[] args) {
        Turtle  t;
    
        t = new Turtle();

        /*******/
        t.setColor(Color.blue);
        t.penUp();
        t.moveTo(10,10);
        t.penDown();
        t.move(100);
        t.turn(90);
        System.out.println("At the end of the indicated section the Turtle object is:");
        System.out.println("Located at (" + t.getX() + ", " + t.getY() + ")");
        System.out.println("Pointing at an angle of " + t.getDirection() + " degrees");
        /*******/
        
        t.move(100);
        t.turn(90);
        t.move(100);
        t.turn(90);
        t.move(100);
        t.turn(90);
        t.penUp();
        
        t.setColor(Color.green);
        
        t.moveTo(10,350);
        t.penDown();
        t.move(100);
        t.turn(120);
        t.move(100);
        t.turn(120);
        t.move(100);
        t.turn(120);
        t.penUp();
        
        t.setColor(Color.red);
        
        t.moveTo(300,400);
        t.penDown();
        t.move(100);
        t.turn(90);
        t.move(50);
        t.turn(90);
        t.move(100);
        t.turn(90);
        t.move(50);
        t.turn(90);
        t.penUp();
        
        t.setColor(Color.cyan);
        
        t.moveTo(300,10);
        t.penDown();
        t.turn(45);
        t.move(200);
        t.penUp();
        t.moveTo(450,10);
        t.penDown();
        t.turn(90);
        t.move(200);
    }

}
