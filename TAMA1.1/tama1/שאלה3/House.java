
/**
 * House() Class description,
 * The Class has two one contructor, two valiables and one method.
 * This class will make use of the class Turtle() to and make and instance of it inside the turtle1 variable, then it calls the function WriteHouse(). 
 * the function drawHouse() calls the instance of turtle1 and its methods and draws a house with in the values stored in the variables: alachsonSquare and angleTurn.
 * Be aware that the values inside of turtle1.turnLeft at the end must be calculate manually (since we havent learned about Math libraries...:( )
 * have fun! 
 *
 *
 * @author (Yonatan Orozko)
 * @version (1.0)
 */
public class House
{
    // instance variables - replace the example below with your own
    Turtle turtle1 = new Turtle();
    int alachsonSquare = 100;
    int angleTurn = 90;
    /**
     * An example of a method - replace this comment with your own
     *
 * @param  y  a sample parameter for a method
 * @return    the sum of x and y
 */

    

    /**
     * Constructor for objects of class House
     */
    public House()
    {
        // inidrawHouse(int y)tialise instance variables
        drawHouse();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void drawHouse()
    {
        // put your code here
        turtle1.penDown();
        turtle1.forward(alachsonSquare);
        turtle1.turnLeft(angleTurn);
        turtle1.forward(alachsonSquare);
        turtle1.turnLeft(angleTurn);
        turtle1.forward(alachsonSquare);
        turtle1.turnLeft(angleTurn);
        turtle1.forward(alachsonSquare);
        turtle1.turnLeft(angleTurn);
        turtle1.penUp();
        turtle1.forward(alachsonSquare);
        turtle1.penDown();
        turtle1.setPenColor("red");
        turtle1.turnLeft(26.56);
        turtle1.forward(111.8);
        turtle1.turnLeft(126.43);
        turtle1.forward(111.8);
        turtle1.turnLeft(26.57);
        turtle1.penUp();
        turtle1.forward(111.8);
        turtle1.hideTurtle();
    }
}
