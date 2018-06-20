public class StringSorter {

    /**
     * Using selection sort, sort the strings array in lexicographic order
     * */
    public static String[] Sort(String[] strings)
    {
        boolean swapped;

        //As long as a swap happened repeat the sorting
        do {
            swapped = false;

            for (int i = 1; i < strings.length; i++)
            {
                if(strings[i-1].toLowerCase().compareTo(strings[i].toLowerCase()) < 0) //if left element is larger than right swap
                {
                    swap(strings,i-1,i);
                    swapped = true;
                }
            }

        }while (swapped);



        return strings;
    }//end of Sort

    /**
     * Swap the elements in the array
     * */
    private static void swap(String[] array,int a,int b)
    {
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }//end of swap

}
