/**
 * Birthday greeting card.
 *
 * @author  Yon-or
 * @version 1.0
 * @since   2017-06-18
 */
public class BirthdayCard extends GreetingCard{
    protected int age = 33;


    public BirthdayCard(){
        super.greeting[0] = ("Happy "+ageInTh()+" birthday!");
    }
    public String ageInTh(){
        String numThReturn;

        if (age>10){
            switch (age%10){
                case 1:
                    numThReturn = (Integer.toString(age)+"st");
                    break;
                case 2:
                    numThReturn = (Integer.toString(age)+"nd");
                    break;
                case 3:
                    numThReturn = (Integer.toString(age)+"rd");
                    break;
                default:
                    numThReturn = (Integer.toString(age)+"th");

            }
        }else {
            System.out.println("Our system only allow to create cards for people older than 10 years old! Exiting..");
            while (true);
        }
        return numThReturn;
    }
    public int getAge(){
        return this.age;
    }
}
