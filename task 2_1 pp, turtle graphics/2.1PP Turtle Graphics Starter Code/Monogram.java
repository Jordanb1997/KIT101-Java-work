import kit101.turtle.Turtle;

/**
 * 2.1PP Turtle Graphics task to draw the author's initials.
 * Some of the code below has been _over_ commented to help you understand
 * what is happening.
 *
 * @author Jordan Bannister
 */
public class Monogram {

    public static void main(String[] args) {
        Turtle painter; //the turtle graphics object

        painter = new Turtle(); //create the turtle

        //(You may delete the following line if you prefer to start in the centre)
       // painter.origin(); //move the turtle to the bottom-left of the drawing area

        //paint monogram; remembering to use painter.penUp() to move without drawing a line...
        //starting with B
        painter.move(50);
        painter.turn(90);
        painter.move(45);
        painter.turn(90);
        painter.move(50);
        painter.turn(180); 
        painter.move(50);
        painter.turn(90);
        painter.move(45);
        painter.turn(90);
        painter.move(50);
        painter.turn(90);
        painter.move(90);
        painter.turn(180);
        painter.move(90);
        //J
        painter.turn(90);
        painter.move(60);
        painter.turn(180);
        painter.move(30);
        painter.turn(270);
        painter.move(90);
        painter.turn(270);
        painter.move(30);
        painter.turn(270);
        painter.move(30);
        
    }

}
