package CollectionFramework;
import java.util.LinkedList;
import java.util.Collections;

class Linked_List
{
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        /* Inserting elements */
        ll.add("Rishabh");
        ll.add("Tanya");
        ll.add("Anuj");
        ll.add("Cristiano");
        ll.add("Messi");


        /* Printing the Linked List */
        System.out.println("Printing the Linked List :");
        System.out.println(ll);
        System.out.println();


        /* Getting the first element */
        System.out.println("First element :");
        String first = ll.getFirst();
        System.out.println(first);
        System.out.println();


        /* Getting the last element */
        System.out.println("Last element :");
        String last = ll.getLast();
        System.out.println(last);
        System.out.println();


        /* Getting element at a particular index */
        System.out.println("Getting element at index 1 :");
        String element = ll.get(1);
        System.out.println(element);
        System.out.println();


        /* Adding new element at a particular index */
        System.out.println("Adding new element at index 5 :");
        ll.add(5, "Peter");
        System.out.println(ll);
        System.out.println();


        /* Changing element already present at a particular index */
        System.out.println("Changing element present at index 4 :");
        ll.set(4, "Alex");
        System.out.println(ll);
        System.out.println();


        /* Deleting element present at a particular index */
        System.out.println("Deleting element present at index 4 :");
        ll.remove(4);
        System.out.println(ll);
        System.out.println();


        /* Checking if Linked List contains a particular element */
        System.out.println("Checking if Linked List contains Rishabh :");
        boolean ans = ll.contains("Rishabh");
        System.out.println(ans);
        System.out.println();


        /* Getting index of a particular element */
        System.out.println("Index of Anuj :");
        int index = ll.indexOf("Anuj");
        System.out.println(index);
        System.out.println();


        /* Size of Linked List */
        System.out.println("Size of Linked List :");
        int size = ll.size();
        System.out.println(size);
        System.out.println();


        /* Iterating over the Linked List */
        System.out.println("Iterating over the Linked List :");
        for (int i=0; i<ll.size(); i++)
        {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println("\n");


        /* Sorting the Linked List using Collections class */
        System.out.println("Sorting the Linked List :");
        Collections.sort(ll);
        System.out.println(ll);
        System.out.println();


        /* Deleting full Linked List */
        System.out.println("Deleting full Linked List :");
        ll.clear();
        System.out.println(ll);
    }
}