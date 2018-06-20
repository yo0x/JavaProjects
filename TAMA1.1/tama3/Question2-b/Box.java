
/**
 * Write a description of class Box here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Box
{
    // instance variables - replace the example below with your own
    private int weight;
    private Parcel storedParcel1;
    private Parcel storedParcel2;

    /**
     * Constructor for objects of class Box
     */
    public Box(int myWeight, Parcel parcel1, Parcel parcel2)
    {
        // initialise instance variables
        weight = myWeight;
        storedParcel1 = parcel1;
        storedParcel2 = parcel2;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getS1pAddName()
    {
     return storedParcel1.getAddresseeName();   
    }
    public String getS1pAdd()
    {
     return storedParcel1.getAddress();   
    }
    public String getS2pAddName()
    {
     return storedParcel2.getAddresseeName();   
    }
    public String getS2pAdd()
    {
     return storedParcel2.getAddress();   
    }
    public String getBook1Name()
    {
     return storedParcel1.getBookName();   
    }
    public int getBook1Pages()
    {
     return storedParcel1.getBookPages();   
    }
    public String getBook2Name()
    {
     return storedParcel2.getBookName();   
    }
    public int getBook2Pages()
    {
     return storedParcel2.getBookPages();   
    }
    public int getTotalCopiesOdy1()
    {
     return storedParcel1.getOdyCopies();   
    }
    public int getTotalCopiesOdy2()
    {
     return storedParcel2.getOdyCopies();   
    }
    public ArrayList<BlueRay> getNamesBr1()
    {
     return storedParcel1.getNamesBlueR();   
    }
    public ArrayList<BlueRay> getNamesBr2()
    {
     return storedParcel2.getNamesBlueR();   
    }
    
    public float getTotalWeight()
    {
        // put your code here
        //int itemsWeight = weight + storedParcel1.getGrossWeight() + storedParcel2.getGrossWeight();
        return  (weight + storedParcel1.getGrossWeight() + storedParcel2.getGrossWeight());
    }
}
