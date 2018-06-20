/**
 * Greeting card for a young person.
 *
 * @author  Yon-or
 * @version 1.0
 * @since   2017-06-18
 */
public class YouthBirthCard extends BirthdayCard{

    public YouthBirthCard(int myAge){
        super.age = myAge;
        super.greeting[1] = ("How you have grown!");
    }
}
