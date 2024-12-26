// ArrayList provides us with resizable arrays.

package CollectionFramework;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Array_List
{
    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<>();

        /* Inserting elements */
        al.add(10);
        al.add(20);
        al.add(30);


        /* Printing the ArrayList */
        System.out.println("Printing the ArrayList :");
        System.out.println(al);
        System.out.println();


        /* Getting element at a particular index */
        System.out.println("Getting element at index 1 :");
        int element = al.get(1);
        System.out.println(element);
        System.out.println();


        /* Adding new element at a particular index */
        System.out.println("Adding new element at index 2 :");
        al.add(2, 99);
        System.out.println(al);
        System.out.println();


        /* Changing element already present at a particular index */
        System.out.println("Changing element present at index 0 :");
        al.set(0, 50);
        System.out.println(al);
        System.out.println();


        /* Deleting element present at a particular index */
        System.out.println("Deleting element present at index 2 :");
        al.remove(2);
        System.out.println(al);
        System.out.println();


        /* Checking if ArrayList contains a particular element */
        System.out.println("Checking if ArrayList contains 99 :");
        boolean ans = al.contains(99);
        System.out.println(ans);
        System.out.println();


        /* Getting index of a particular element */
        System.out.println("Getting index of 30 :");
        int index = al.indexOf(30);
        System.out.println(index);
        System.out.println();


        /* Size of ArrayList */
        System.out.println("Size of ArrayList :");
        int size = al.size();
        System.out.println(size);
        System.out.println();


        /* Reversing the ArrayList */
        System.out.println("Reversing the ArrayList :");
        List<Integer> reversed = al.reversed();
        System.out.println(reversed);
        System.out.println();


        /* Iterating over the ArrayList */
        System.out.println("Iterating over the ArrayList :");
        for (int i=0; i<al.size(); i++)
        {
            System.out.print(al.get(i) + " ");
        }
        System.out.println("\n");


        /* Sorting the ArrayList using Collections class */
        System.out.println("Sorting the ArrayList :");
        Collections.sort(al);
        System.out.println(al);
        System.out.println();


        /* Deleting full ArrayList */
        System.out.println("Deleting full ArrayList :");
        al.clear();
        System.out.println(al);
    }
}