/**
 * Greeting card for a adult person.
 *
 * @author  Yon-or
 * @version 1.0
 * @since   2017-06-18
 */
public class AdultBirthDayCard extends BirthdayCard {

    public AdultBirthDayCard(int myAge){
        super.age = myAge;
        super.greeting[1] = "You haven't changed a bit!";

    }
}
