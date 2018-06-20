
/**
 * Write a description of class CaseDetails here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CaseDetails
{
    // instance variables - replace the example below with your own
    Box storedBox;

    /**
     * Constructor for objects of class CaseDetails
     */
    public CaseDetails(Box myBox)
    {
        // initialise instance variables
        storedBox = myBox;
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
    public void reportDetails()
    {
        // put your code here
        prtLn("------ Parcel's Report  ------");
        prtLn("       Parcel No1: ");
        prtLn("Addressee Name: "+ storedBox.getS1pAddName());
        prtLn("Address: "+ storedBox.getS1pAdd());
        prtLn("Book's name: "+storedBox.getBook1Name());
        prtLn("Book's no of Pages: "+storedBox.getBook1Pages());
        prtLn("This parcel contains "+((storedBox.getTotalCopiesOdy1() !=0) ? storedBox.getTotalCopiesOdy1(): "no")+" copies of Odyssey");
        prtLn("BlueRay's name in the Box: ");
        for(int i = 0; i<storedBox.getNamesBr1().size(); i++){
            prtLn("  - "+storedBox.getNamesBr1().get(i).getName());
        }
        prtLn("-------------------------------");
        prtLn("             ");
        prtLn("       Parcel No2: ");
        prtLn("Addressee Name: "+ storedBox.getS2pAddName());
        prtLn("Address: "+ storedBox.getS2pAdd());
        prtLn("Book's name: "+storedBox.getBook2Name());
        prtLn("Book's no of Pages: "+storedBox.getBook2Pages());
        prtLn("This parcel contains "+((storedBox.getTotalCopiesOdy2() !=0) ? storedBox.getTotalCopiesOdy2(): "no")+" copies of Odyssey");
        prtLn("BlueRay's name in the Box: ");
        for(int i = 0; i<storedBox.getNamesBr2().size(); i++){
            prtLn("  - "+storedBox.getNamesBr2().get(i).getName());
        }
        prtLn("-------------------------------");
        prtLn("             ");
        prtLn("Total Box's weight: "+storedBox.getTotalWeight()+" grams.");
    }
}
