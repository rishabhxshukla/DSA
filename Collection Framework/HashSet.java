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


        /* Printing the Hash Set */
        System.out.println("Printing the Hash Set :");
        System.out.println(hs);
        System.out.println();


        /* Checking if our set contains a particular value */
        boolean ans;
        System.out.println("Checking if Cristiano is present :");
        ans = hs.contains("Cristiano");
        System.out.println(ans);
        System.out.println();


        /* Remove a value from the Hash Set */
        System.out.println("Removing an entry from the Hash Set :");
        hs.remove("Messi");
        System.out.println(hs);
        System.out.println();


        /* Size of Hash Set */
        System.out.println("Size of Hash Set :");
        int size = hs.size();
        System.out.println(size);
        System.out.println();


        /* Converting Hash Set to an Array */
        System.out.println("Converting Hash Set to an Array :");
        Object arr[] = hs.toArray();
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");


        /* Deleting Hash Set */
        System.out.println("Deleting Hash Set :");
        hs.clear();
        System.out.println(hs);
    }
}