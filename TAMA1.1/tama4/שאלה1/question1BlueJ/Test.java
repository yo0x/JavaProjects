
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    public void createKnapsack(int nBooks, int wBooks, int wFlashlight, int wBottle, int wSack)
    {
        // put your code here
        //Book[] lBooks = new Book[nBooks];
        Bottle nBottle1 = new Bottle(wBottle);
        Flashlight nFlashl = new Flashlight(wFlashlight);
        Knapsack nKnapsack = new Knapsack(nBottle1, nFlashl,wSack);
        
        for(int i=0; i<nBooks; i++){
            Book tempB = new Book(wBooks);
            nKnapsack.addBook(tempB);
        }
        nKnapsack.printStatus();
        nKnapsack.totalWeight();
    }
}
