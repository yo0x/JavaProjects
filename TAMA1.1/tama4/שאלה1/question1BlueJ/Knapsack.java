
/**
 * Simulates a knapsack which contains a book, a bottle and a flashlight.
 * It can compute its total weight, and can change its flashlight state.
 *
 * @see Book
 * @see Flashlight
 * @see Bottle
 *
 * @author Yon-or
 * @version 1
 */
import java.util.*;
class Knapsack
{
    /** A reference to the book that is contained in the knapsack. */
   Book book;
    /** A reference to the bottle that is contained in the knapsack.  */
   Bottle bottle;
    /** A reference to the flashlight that is contained in the knapsack. */
   Flashlight flashlight;
   /** The weight of the empty knapsack itself. */
   int weight;
   ArrayList<Book> bookList = new ArrayList<Book>();
    /**
     * Creates a new knapsack.
     */
    Knapsack(Bottle aBottle,  Flashlight aFlashlight, int myWeight)
    {
        // Initialize instance variables

        bottle = aBottle;
        flashlight = aFlashlight;
        weight = myWeight;
    }

    /**
     * add books to the list.
     */
    void addBook(Book myBook)
    {

        bookList.add(myBook);
    }
    /**
     * Get the knapsack's tare weight.
     */
    int getWeight()
    {
        return weight;
    }

    /**
     * Toggle the flashlight state: from "on" to "off" and vice versa.
     */
    void toggleFlashlightState()
    {
        flashlight.toggleState();
    }

     /**
     * @return The total weight of the knapsack.
     */
    int totalWeight()
    {
        int toWeightBooks =0;
        for(int i=0; i<bookList.size(); i++){
            toWeightBooks += bookList.get(i).getWeight();

        }
        return toWeightBooks + bottle.getWeight() + flashlight.getWeight() + weight;
    }

    /**
     * Prints the total weight of the knapsack, and the stae of the flashlight
     */
    void printStatus()
    {
        System.out.println("Knapsack's total weight: " +  totalWeight() + " gr.");
        System.out.println("Flashlight is " + (flashlight.getState() ? "on" : "off") + ".");
    }
}
