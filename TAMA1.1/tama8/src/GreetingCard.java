public class GreetingCard {
    protected String recipient;
    protected String[] greeting = new String[2];
    protected String sender;

    public GreetingCard(){

    }
    public GreetingCard(String recipientName, String senderName){
        this.greeting[0] = ("Best Greetings!");
        this.sender = senderName;
        this.recipient = recipientName;
    }
    public String kishut(char charToRepeat){
        char[] kishutArr = new char[30];
        for(int i =0; i<kishutArr.length; i++){
            kishutArr[i] = charToRepeat;
        }
        String sendMeBack = new String(kishutArr);
        return sendMeBack;
    }
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
