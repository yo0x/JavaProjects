/**
 * This class is an improved version of the same named class from project "Names" .
 * Here, the array is filled by first asking  the user to enter a number which defines the length
 * of the array, and then asking the user to enter the names.
 *
 * @author Yon-or
 */

import java.util.Scanner;

class NameManipulations
{
    // The names array:
    String[] names;

    /**
     * Constructor
     */
   NameManipulations()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of names:");
        int n = sc.nextInt(); // Number of names in the array
        names = new String[n];
        sc.nextLine(); // Clears the scanner from the /n that was left by the last integer entered by the user

        System.out.println("Please enter " + n + " names:");
        for (int i=0; i<n; i++)  {
            System.out.print(i+1 + " : ");
            names[i] = sc.nextLine();
        }

        System.out.println("Array is ready.\n");  // The \n jumps an extra line in the output screen.

    } // end of constructor

    /**
     * Print all the names ending with "n":
     */
    void printNamesEndingWithN()
    {
        System.out.println("Names ending with 'n':");
        for(String name: names){
           if (name.endsWith("n"))
               System.out.println(name);
              }
        System.out.println();
    }

    /**
     * Add "Israeli" as a second surname, and print the new array:
     */
    void addIsraeli()
    {
        for(int i=0; i<names.length; i++)
            names[i] = names[i].concat(" Israeli");
        System.out.println("Added \"Israeli\".");
        printNames();
    }

    /**
     * Convert the names into capital letters, and print the new array:
     */
    void convertToCapitals()
    {
        for(int i=0; i<names.length; i++)
          names[i] = names[i].toUpperCase();
        System.out.println("Converted to capitals.");
        printNames();
    }

    /**
     * Print the array
     */
    void printNames()
    {
        System.out.println("The names in the array:");
        for(String name : names)
            System.out.println(name);
              System.out.println();
    }
    void revert()
    {
        for(int i=0; i<names.length; i++)
            names[i] = names[i].replaceAll("Israeli", "");
        System.out.println("Added \"Israeli\".");
        printNames();

    }

}
