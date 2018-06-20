

public class GreetingCardsRepository {
    private final int MAX_CARDS = 5;
    private GreetingCard[] myCards = new GreetingCard[MAX_CARDS];
    //private BirthdayCard[] myCardsBirthDay = new BirthdayCard[];


    public GreetingCardsRepository(){
        System.out.println("New cards repository has been created.");
    }
    public void addCards(GreetingCard[] myGreetingCards) {
        if(myGreetingCards.length>MAX_CARDS) {
            throw new errorCardHandler(1);
        }else {
            this.myCards = myGreetingCards;
            System.out.println(MAX_CARDS+" cards has been successfully added to the repo.");
        }


    }
    public void printAges(){
        int i =0;
        for(GreetingCard r: this.myCards){

            if(r.getClass().equals("class YouthBirthCard") || r.getClass().equals("class AdultBirthDayCard")){
                System.out.println(r.getClass());

            }
        }


    }
    public void printAllCards(){
        for(GreetingCard a: this.myCards){
            System.out.println(a.toString());
        }
    }

    public GreetingCard[] getMyCardsBySender(String searchSender) {
        GreetingCard[] arrBySender = new GreetingCard[MAX_CARDS];
        int i = 0;
        for(GreetingCard a: this.myCards){
            if(a.sender.equals(searchSender)){
                arrBySender[i] = a;
                i++;
            }
        }if(arrBySender.length==0){
            throw new errorCardHandler(searchSender);
        }else{
            return arrBySender;
        }

    }
}
