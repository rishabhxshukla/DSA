// HashSet is a collection of items where every item is unique.
// This means that duplicate values are not allowed here.

package CollectionFramework;
import java.util.HashSet;

class Hash_Set
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<>();

        /* Inserting the records */
        hs.add("Rishabh");
        hs.add("Tanya");
        hs.add("Anuj");
        hs.add("Cristiano");
        hs.add("Messi");


        /* Printing the HashSet */
        System.out.println("Printing the HashSet :");
        System.out.println(hs);
        System.out.println();


        /* Checking if our set contains a particular value */
        boolean ans;
        System.out.println("Checking if Cristiano is present :");
        ans = hs.contains("Cristiano");
        System.out.println(ans);
        System.out.println();


        /* Remove a value from the HashSet */
        System.out.println("Removing an entry from the HashSet :");
        hs.remove("Messi");
        System.out.println(hs);
        System.out.println();


        /* Size of HashSet */
        System.out.println("Size of HashSet :");
        int size = hs.size();
        System.out.println(size);
        System.out.println();


        /* Converting HashSet to an Array */
        System.out.println("Converting HashSet to an Array :");
        Object arr[] = hs.toArray();
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");


        /* Deleting HashSet */
        System.out.println("Deleting HashSet :");
        hs.clear();
        System.out.println(hs);
    }
}