/**
 * This is simple program that creates Greeting cards of different kinds.
 * Here we check all the functionality of the program, errors and much more.
 *
 * @author  Yon-or
 * @version 1.0
 * @since   2017-06-18
 */
public class Main {


    public static void main(String [] args){

            GreetingCard[] myCards = new GreetingCard[5];
            GreetingCard[] myCardsCustom = new GreetingCard[5];
            GreetingCard[] myCardsNoBc = new GreetingCard[5];
            GreetingCard[] myCardsOverF = new GreetingCard[7];
            System.out.println("");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
             System.out.println("Repo with all kind of Cards");
             System.out.println("");
            myCards[0] = new CustomCard("Hello have Custom DAY!");
            myCards[0].sender = "someone Custom";
            myCards[0].recipient = "someone_else C";
            myCards[1] = new GreetingCard("Reci Gree", "Sender Green");
            myCards[2] = new WeddingCard();
            myCards[2].sender = "someone Wedding";
            myCards[2].recipient = "someone_else";
            myCards[3] = new YouthBirthCard(32);
            myCards[3].sender = "someone young";
            myCards[3].recipient = "someone_else";
            myCards[4] = new AdultBirthDayCard(42);
            myCards[4].sender = "someone old";
            myCards[4].recipient = "someone_else";
            GreetingCardsRepository myRepo = new GreetingCardsRepository();
            myRepo.addCards(myCards);
            myRepo.printAllCards();
            myRepo.printAges();
        System.out.println("::::::::::::::::::::<<<>>>:::::::::::::::::::::::::");
        System.out.println("Searching by sender");
            myRepo.printAllCards(myRepo.getMyCardsBySender("someone Custom"));
            System.out.println("");
            System.out.println("::::::::::::::::::::::<<<>>>>:::::::::::::::::::::::");
             System.out.println("Repo with Custom cards");

             System.out.println("");
            myCardsCustom[0] = new CustomCard("Hello have Custom DAY!");
            myCardsCustom[0].sender = "Pepe sender";
            myCardsCustom[0].recipient = "Resi recipeint";
            myCardsCustom[1] = new CustomCard("Hello have Custom DAY!");
            myCardsCustom[1].sender = "Pedro sassa";
            myCardsCustom[1].recipient = "Juan Don";
            myCardsCustom[2] = new CustomCard("Hello have Custom DAY!");
            myCardsCustom[2].sender = "Pepe sender";
            myCardsCustom[2].recipient = "elPacho";
            myCardsCustom[3] = new CustomCard("Hello have Custom DAY!");
            myCardsCustom[3].sender = "Gavi gan";
            myCardsCustom[3].recipient = "Rejelio el Cruel";
            myCardsCustom[4] = new CustomCard("Hello have Custom DAY!");
            myCardsCustom[4].sender = "Sendi Sender";
            myCardsCustom[4].recipient = "Papa Puk";
            GreetingCardsRepository myRepoCustom = new GreetingCardsRepository();
            myRepoCustom.addCards(myCardsCustom);
            myRepoCustom.printAllCards();
          System.out.println("");
          System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
          System.out.println("Repo with no HappyBirthDay cards");
       System.out.println("");
          myCardsNoBc[0] = new CustomCard("Hello ");
          myCardsNoBc[1] = new CustomCard("Hello ");
          myCardsNoBc[2] = new CustomCard("Hello ");
          myCardsNoBc[3] = new GreetingCard("Reci Gree", "Sender Green");
          myCardsNoBc[4] = new GreetingCard();
       System.out.println("");
       System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
       System.out.println("Repo with OverFlow of cards");
       myCardsOverF[0] = new CustomCard("Hello ");
       myCardsOverF[1] = new CustomCard("Hello ");
       myCardsOverF[2] = new CustomCard("Hello ");
       myCardsOverF[3] = new GreetingCard("Reci Gree", "Sender Green");
       myCardsOverF[4] = new GreetingCard();
       myCardsOverF[5] = new GreetingCard();
       myCardsOverF[6] = new GreetingCard();
       GreetingCardsRepository myRepoOverF = new GreetingCardsRepository();
       myRepoOverF.addCards(myCardsOverF);
       myRepoOverF.printAllCards();

    }

}
