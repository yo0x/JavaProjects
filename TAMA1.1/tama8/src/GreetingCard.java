/**
 * The parent class in the program. It handles content and style.
 * @author  Yon-or
 * @version 1.0
 * @since   2017-06-18
 */
public class GreetingCard {
    protected String recipient;
    protected String[] greeting = new String[2];
    protected String sender;

    public GreetingCard(){

    }
    /**
     * Constructor with re and sender parameters.
     */
    public GreetingCard(String recipientName, String senderName){
        this.greeting[0] = ("Best Greetings!");
        this.sender = senderName;
        this.recipient = recipientName;
    }
    /**
     * Takes care of the Style.
     */
    public String kishut(char charToRepeat){
        char[] kishutArr = new char[30];
        for(int i =0; i<kishutArr.length; i++){
            kishutArr[i] = charToRepeat;
        }
        String sendMeBack = new String(kishutArr);
        return sendMeBack;
    }
    /**
     * This method uses recipient, sender and greeting.
     * @return int This returns the card.
     */
    public String toString(){
        if(this.greeting.length > 1 && this.greeting[1] == null)
            return String.format(".%n " + kishut('^') + ".%n " + this.recipient + ".%n " + this.greeting[0] + ".%n " + this.sender + ".%n " + kishut('#'));
        else {
            return String.format(".%n " +kishut('*')+".%n " +this.recipient + ".%n " + this.greeting[0] + ".%n " + this.greeting[1]+".%n "+ this.sender+".%n " +kishut('*'));

        }

    }
    public String getGreetingMsg(){
        return greeting[0];
    }

}
