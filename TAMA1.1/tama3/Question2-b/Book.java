
/**
 * Write a description of class Book here.
 *
 * @author Yon-or
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    //private int weight;
    private String name;
    private int noPages;

    /**
     * Constructor for objects of class Book
     */
    public Book(String myName, int myPages)
    {
        // initialise instance variables
        name = myName;
        noPages = myPages;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        // put your code here

        return name;
    }

    public int getPages()
    {
        // put your code here

        return noPages;
    }
}
