/*
Sorting HashMap based on its values.
The idea is to store the entry set in a list and sort the list.
Then fetch values and keys from the list and put them in a new hashmap.
Now, we have a sorted HashMap.

NOTE : The order of entries in a HashMap is not guaranteed, so when you print the original
and new HashMap, the output may not necessarily reflect the sorted order.
To overcome this, you can use a LinkedHashMap instead of a regular HashMap to preserve the
insertion order. This way, the entries will appear in the sorted order.
*/

package Hashing;
import java.io.*;
import java.util.*;

class SortingValues
{
    static HashMap<Integer, String> hm = new HashMap<>();               //Original HashMap
    static LinkedHashMap<Integer, String> ans = new LinkedHashMap<>();  //Sorted HashMap


    /* Creating the HashMap */
    void create() throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=1; i<=5; i++)
        {
            System.out.print("Enter the character : ");
            String ch = b.readLine();
            hm.put(i, ch);
        }
    }


    /* Sorting the values */
    void sort ()
    {
        //Create a list from the entry-set of HashMap
        ArrayList<Map.Entry<Integer, String>> list = new ArrayList<>(hm.entrySet());

        //Sort the list
        //NOTE : Use Collections.reverseOrder() to sort in descending order
        //list.sort((o1, o2) -> (o1.getValue().compareTo(o2.getValue())));
        list.sort(Map.Entry.comparingByValue());

        //Put data from sorted list to new HashMap
        //Using 'var' in place of 'Map.Entry<Integer, String>'
        for (var i : list)
        {
            ans.put(i.getKey(), i.getValue());
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SortingValues obj = new SortingValues();

        //Creating the HashMap
        obj.create();

        //Printing original HashMap
        System.out.println("*** Original HashMap ***");
        System.out.println(hm);

        //Sorting the values
        obj.sort();

        //Printing new HashMap
        System.out.println("*** New HashMap ***");
        System.out.println(ans);
    }
}