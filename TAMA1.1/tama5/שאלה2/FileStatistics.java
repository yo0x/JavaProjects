
/**
 * This class prints some stadistics about the file loaded.
 *
 * @author (Yonatan Orozko -Yonor-)
 * @version (1.1)
 */

import students.fileutils.FileOpener;
import java.util.Scanner;
import java.io.File;
public class FileStatistics
{
    // instance variables - replace the example below with your own

    String fileName;
    Scanner sc = new Scanner(System.in);
    FileOpener openedFile;
    File fileText;
    Scanner fileSc;

    /**
     * Creates a new File stadistics wich will run all the other methods.
     */
    public FileStatistics()
    {
        // initialise instance variables
        System.out.println(">>> ===================================== <<<");
        System.out.println(" ");
        System.out.println(">>> Welcome to the File Stadistics app. ");
        System.out.println("");
        printFileStatistics();
    }

    /**
     * This is encharge of asking the user from an input, repetly until the users enters no input, then it will exit
     *
     * 
     * 
     */
    public String getFileNameFromUser(){
        System.out.println("");
        System.out.println(">>> Please enter File Name (you can try \"someText.txt\"): <<<");
        System.out.println(">: ");
        this.fileName = sc.nextLine();

        if(!fileName.isEmpty()){
            return fileName;
        }else
        {
            System.out.println("Error, no file name entered. Exiting..");
            return "no file";

        }

    }

    /**
     * Methods wich counts the words inside the file and prit them out.
     *
     */
    public void countWords(){
        int wordCounter = 0;
        while(this.fileSc.hasNext()){
            wordCounter +=1;
            System.out.println(fileSc.next());

        }
        this.fileSc.close();
        System.out.println("");
        System.out.println(">>> ===================================== <<<");
        System.out.println(" + Total number of words: "+wordCounter);
        System.out.println(">>> ===================================== <<<");
        System.out.println("");
    }

    /**
     * This method counts the number of sentences in a file delimite with >?.!.
     * @param weight The weight of the book, in grams.
     */
    public void countSentences(){
        int seCounter = 0;
        Scanner scSen;
        Scanner scSen1;
        scSen = this.openedFile.getScanner();
        scSen1 = scSen.useDelimiter("\\?\\s|\\.\\s|\\!\\s|\\?\\s");
        while(scSen1.hasNext()){
            seCounter +=1;
            System.out.println(scSen1.next());

        }
        scSen.close();
        System.out.println("");
        System.out.println(">>> ===================================== <<<");
        System.out.println(" + Total number of sentences (with delimiter ?!.:) are: "+seCounter);
        System.out.println(">>> ===================================== <<<");
        System.out.println("");
    }

    /**
     * This method calls out the countWords and countSentences methods.
     * The method also catches the error when the file is not found.
     * 
     */
    public void printFileStatistics()
    {
        // put your code here

        String tempS = getFileNameFromUser();
        if(!tempS.equals("no file")){
            this.openedFile = new FileOpener(tempS);
            this.fileSc = this.openedFile.getScanner();
            if(fileSc == null){
                System.out.println(" - File not found, try again..");
                printFileStatistics();
            }else{

                this.fileSc = this.openedFile.getScanner();
                this.fileText = openedFile.getOpenedFile();
                System.out.println("");
                System.out.println(">>> ===================================== <<<");
                System.out.println(" + The file size is: "+ this.fileText.length()+" bytes");
                System.out.println(">>> ===================================== <<<");
                System.out.println("");
                countWords();
                countSentences();
                printFileStatistics();
            }
        }else{
            while(true);
        }

    }
}
