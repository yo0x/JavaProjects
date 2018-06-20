import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        String[] inputArray;

        System.out.println("Welcome to string sorter");
        System.out.println("Please enter strings to sort up to 20");
        inputArray = userInput();

        System.out.println("**********************************************************");
        System.out.println("Array before sorting: ");
        printArray(inputArray);
        inputArray = StringSorter.Sort(inputArray);
        System.out.println("Array after sorting: ");
        printArray(inputArray);
        System.out.println("**********************************************************");



    }//end of main

    /**
     * Support method for array printing
     * */
    private static void printArray(String[] strings)
    {
        for (int i = 0; i < strings.length; i++)
        {
            System.out.print(strings[i]);
            if(i != strings.length-1)
                System.out.print(" ,");
        }
        System.out.println();
    }//end of printArray

    /**
     * Support method for getting the user input array
     * */
    private static String[] userInput()
    {
        ArrayList<String> inputArray = new ArrayList<>(); //working with arrayList for maximum flexability of the array size
        Scanner input = new Scanner(System.in);
        String inputString;
        int inputCounting = 0;

        //run as long as the input array doesn't have 20 strings or the input string is empty
        do {
            System.out.print("Enter a string |" + (inputCounting+1) + "| (enter nothing and press enter to end):  ");
            inputString = input.nextLine();

            if(!inputString.isEmpty())
                inputArray.add(inputString);

            inputCounting++;

        }while (!inputString.isEmpty() && inputCounting < 20);

        String[] output = new String[inputArray.size()];

        return inputArray.toArray(output); //return the converted arrayList as a string array

    }//end of userInput

}
