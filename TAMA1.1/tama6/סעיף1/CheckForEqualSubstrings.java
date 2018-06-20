
/**
 * This class checks for the existence of multiples substrings.
 *
 * @author (Yonatan Orozko -Yonor-)
 * @version (1.1)
 */

import java.util.*;

//The String to be Check: The nice, pretty girl saw a dog and nicely pet him on the head.
/**
 * Class for finding substring in a string given by the user.
 */
public class CheckForEqualSubstrings {

    private Scanner scU = new Scanner(System.in);
    private String strToPass;
    private String strToPassNoSpaces;
    private int lenStr = 0;
    private String[] arrGloIn;
    public static final int SIZE = 3;

    /**
     * Constructor of the CheckForEqualSubstring Class;
     */

    public CheckForEqualSubstrings(String strToBeCheck) {
        System.out.println("");
        checkSubstringExistence(strToBeCheck);



    }
        /**
         * Gets input from the user's keyboard and return a valid string (larger than 3 characters).va
         */


        public String getStringFromUser()
        {
            System.out.println(" + Please enter a phrase: ");
            this.strToPass = scU.nextLine();
            if (this.strToPass.length() > 3) {
                System.out.println("Great! Working on subStrings! ..");
                System.out.println(">>>>");
                this.arrGloIn = strToPass.split("\\s*(=>|,|\\s)\\s*");

                this.strToPassNoSpaces = strToPass.replaceAll("\\s+", "");

                this.lenStr = this.strToPass.length();
                return this.strToPass;
            } else {
                System.out.println("Error. String must be larger than 3 characters!");
                getStringFromUser();
                return null;
            }

        }
    /**
     * Method that will check for the existence of substring in any given String.
     */


    private static void checkSubstringExistence(String givenString) {
        String strngToBeChecked = givenString.replaceAll("\\s+","");
        boolean notFound=true;
        int itemsFound = 0, size = SIZE;
        while(itemsFound==0) {
            for(int i=0; i<=strngToBeChecked.length() - size*2;i++) {
                for(int j=1+i;j<=strngToBeChecked.length()-(size+i);j++) {
                    String cut1=strngToBeChecked.substring(i, i+size);
                    String cut2=strngToBeChecked.substring(j+i, j+i+size);
                    if(cut1.compareTo(cut2)==0) {
                        System.out.println(cut1);
                        itemsFound++;
                        notFound = false;
                    }
                }
            }
            if(notFound) {
                System.out.println("Not equals were found");
                break;
            }
            else if(itemsFound==0)
                break;
            else if(itemsFound>0) {
                itemsFound=0;
                size++;
            }
        }
    }
}
