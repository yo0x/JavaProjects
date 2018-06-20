
/**
 * A Book with some weight.
 * 
 * @author Dr. Dan Aharoni
 */
class Book
{
    /** The weight of the book, in grams. */
    int weight;
    
    /**
     * Creates a new book.
     * @param weight The weight of the book, in grams.
     */
    Book(int myWeight)
    {
        // Initialize instance variables
        weight = myWeight;
    }

    /**
     * Get the weight of the book.
     * @return The weight of this book.
     */
    int getWeight()
    {
        return weight;
    }
}
