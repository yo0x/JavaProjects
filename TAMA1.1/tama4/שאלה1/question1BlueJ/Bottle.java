
/**
 * A bottle with some weight.
 * 
 * @author Dr. Dan Aharoni
 */
class Bottle
{
    /** The weight of the bottle, in grams. */
    int weight;

    /**
     * Creates a new bottle.
     */
    Bottle(int myWeight)
    {
        // Initialize instance variables
        weight = myWeight;
    }

    /**
     * Get the weight of the book.
     * @return   The weight of this book.
     */
    int getWeight()
    {
        return weight;
    }
}

