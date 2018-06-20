
/**
 * Write a description of class QuadraticEqu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
public class QuadraticEqu
{
    // instance variables - replace the example below with your own
    //private doublex;
    private double a = 1;
    private double b = 1;
    private double c = 1;
    Scanner sc = new Scanner(System.in);
    
    /**
     * Constructor for objects of class QuadraticEqu
     */
    public QuadraticEqu()
    {
        // initialise instance variables
        System.out.println("=============================================");
        System.out.println("Welcome to the Quadratic ecuation Calculator! ");
        System.out.println("=============================================");
        getParameters();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void getParameters()
    {
        // put your code here
        do{
            System.out.println("Please enter the coefficient A: ");
            this.a = sc.nextDouble();
            System.out.println("Please enter the coefficient B: ");
            this.b = sc.nextDouble();
            System.out.println("Please enter the coefficient C: ");
            this.c = sc.nextDouble();
            if(this.a != 0){
            System.out.println("Great! the two root of the equations are: "+solveXplus()+" and "+solveXminus());
        }
        }while(this.a != 0);
        System.out.println("You have entered A=0. Exiting...");
    }

    public double solveXplus(){
        double deltaValue = ((this.b*this.b)-4*this.a*this.c);
        return ((-this.b+Math.sqrt(deltaValue))/(2*this.a));
    }

    public double solveXminus(){
        double deltaValue = ((this.b*this.b)-4*this.a*this.c);
        return ((-this.b-Math.sqrt(deltaValue))/(2*this.a));
    }
}
