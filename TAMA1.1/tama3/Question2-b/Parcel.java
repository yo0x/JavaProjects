
/**
 * Write a description of class Parcel here.
 *
 * @author Yon-or
 * @version (a version number or a date)
 */
import java.util.*;
public class Parcel
{
    // instance variables - replace the example below with your own
    Random rand = new Random();
    private int tareWeight;
    private String addresseeName;
    private String address;
    private float grossWeight;
    //ArrayList<QuarterlyOdyssey> QuarterlyOdysseyList = new ArrayList<QuarterlyOdyssey>();
    ArrayList<Integer> QuarterlyOdysseyList = new ArrayList<Integer>();
    ArrayList<BlueRay> BlueRayList = new ArrayList<BlueRay>();
    //ArrayList<Integer> BlueRayList = new ArrayList<Integer>();
    Book book1;

    /**
     * Constructor for objects of class Parcel
     */
    public Parcel(Book aBook, String myAddSsee, String myAdd, int myTareWeight)

    {
        // initialise instance variables
        int  n = rand.nextInt(20) + 0;
        addRandomOdyssey(n);
        book1 = aBook;
        addresseeName = myAddSsee;
        address = myAdd;
        tareWeight = myTareWeight;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void prtLn(Object line) {
        System.out.println(line);
    }

    public void add4BlueRay(BlueRay bR)
    {
        // put your code here
        if (BlueRayList.size() <= 4) {
            BlueRayList.add(bR);
            prtLn("BlueRay added to the Parcel");
        }else {
            prtLn("You have already fill maximum amount of Books allowed in the Parcel");

        }
    }

    public void addRandomOdyssey(int noOfOdysseyCopies){
        //QuarterlyOdysseyList[] = new QuarterlyOdyssey[noOfOdysseyCopies];
        if(noOfOdysseyCopies > 100){
            prtLn("Invalid number. You can't add more that 100");
        }
        else if(QuarterlyOdysseyList.size()==100){
            prtLn("You can't add anymore! you've reached the maximum -100-");
        }else if(QuarterlyOdysseyList.size()<100){
            if (noOfOdysseyCopies+QuarterlyOdysseyList.size() > 100){
                prtLn("You can' add "+noOfOdysseyCopies+" becouse it will pass the limit 100! but you can add: "+(100 - (QuarterlyOdysseyList.size()))+" items more");
            }else{
                QuarterlyOdysseyList.add(noOfOdysseyCopies);
               // for(int i = QuarterlyOdysseyList.size(); i<(QuarterlyOdysseyList.size()+noOfOdysseyCopies);i++){
                //}
                prtLn("You have added: "+noOfOdysseyCopies+" items");
            }
        }else{
            prtLn("ALIEN situation");
        }

        prtLn("You have just added "+noOfOdysseyCopies+" copies of Odyssey to the Parcel");
    }

    public float getGrossWeight(){
        int tBlueRay = 0;
        for (int i = 0; i<BlueRayList.size(); i++){
            BlueRay bR = BlueRayList.get(i);
            tBlueRay += bR.getWeight();
        }
        grossWeight = (float)(QuarterlyOdysseyList.size() * 290) + (float)(tBlueRay);
        return grossWeight;

    }

    public void changeAmountOdyssey(int changeTo){
        addRandomOdyssey(changeTo);
    }

    public String getAddresseeName()
    {
        return addresseeName;
    }

    public String getAddress()
    {
        return address;
    }

    public String getBookName()
    {
        return book1.getName();
    }

    public int getBookPages()
    {
        return book1.getPages();
    }

    public int getOdyCopies()
    {
        return QuarterlyOdysseyList.size();
    }

    public ArrayList<BlueRay> getNamesBlueR()
    {
        return (BlueRayList);
    }


}
