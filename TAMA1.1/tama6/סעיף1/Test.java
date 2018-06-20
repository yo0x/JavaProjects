public class Test
{
    public Test(){

    }
    public static void main(String [] args){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Welcome To Tama 6");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("");
        System.out.println(" + Firts Test for a string with substrings: ");
        CheckForEqualSubstrings testWithSubtrings = new CheckForEqualSubstrings("The nice, pretty girl saw a dog and nicely pet him on the head.");
        System.out.println(" + Second Test for a string without substrings: ");
        CheckForEqualSubstrings testWithOutSubstrings= new CheckForEqualSubstrings("Thermal devices raise the heat of things.");
        System.out.println("");
        System.out.println(" >>>>> Great Bye Bye... ");
        System.out.println(" Exiting..");


    }

}