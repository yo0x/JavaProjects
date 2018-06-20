
/**
 * This repo holds 5 cards of different types.
 * It also warns if the conditions are not met.
 *
 * @author  Yon-or
 * @version 1.0
 * @since   2017-06-18
 */
public class GreetingCardsRepository {
    private final int MAX_CARDS = 5;
    private GreetingCard[] myCards = new GreetingCard[MAX_CARDS];
    //private BirthdayCard[] myCardsBirthDay = new BirthdayCard[];


    public GreetingCardsRepository(){
        System.out.println("New cards repository has been created.");
    }
    /**
     * Add cards to the Repo.
     */
    public void addCards(GreetingCard[] myGreetingCards) {
        if(myGreetingCards.length>MAX_CARDS) {
            throw new errorCardHandler(1);
        }else {
            this.myCards = myGreetingCards;
            System.out.println(MAX_CARDS+" cards has been successfully added to the repo.");
        }


    }
    /**
     * Prints out ages of the cards.
     */
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
    public void printAllCards(GreetingCard[] gcBySender){
        for(GreetingCard a: gcBySender){
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
        }if(arrBySender[0]==null){
            throw new errorCardHandler(searchSender);
        }else{

            return arrBySender;
        }

    }
}
