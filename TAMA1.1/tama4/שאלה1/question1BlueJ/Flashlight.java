
/**
 * A flashlight with some weight. It can be on or off.
 * At the beginning, the flashlight is off.
 *
 * @author Yon-or
 */
class Flashlight
{
    /** The weight of the flashlight, in grams.  */
    int weight;

    /**
     * true indicates that the flashlight is on.
     */
    boolean isOn = false;

    /**
     * Creates a new flashlight.
     */
    Flashlight(int myWeight)
    {
        // Initialize instance variables
        weight = myWeight;
    }

    /**
     * @return  The weight of this book.
     */
    int getWeight()
    {
        return weight;
    }

    /**
     * Get the state of the flashlight.
     * @return the state of the flashlight, as boolean.
     * true indicates that the flashlight is on.
     */
    boolean getState()
    {
        return isOn;
    }

    /**
     * Toggle the state of the flashlight: from on to off, and vice versa.
     */
    void toggleState()
    {
        isOn = !isOn;
    }

}
