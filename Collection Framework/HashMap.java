// HashMap allows us to store data in key-value pair, where every key is unique.
// This means that keys cannot be duplicate, however values can be duplicate.
// Roll number - Student's Name

package CollectionFramework;
import java.util.HashMap;

class Hash_Map
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> hm = new HashMap<>();

        /* Inserting the records */
        hm.put("Rishabh", 12014745);
        hm.put("Tanya", 12014604);
        hm.put("Anuj", 12015005);
        hm.put("Cristiano", 12017777);
        hm.put("Messi", 12011010);


        /* Printing the HashMap */
        System.out.println("Printing the HashMap :");
        System.out.println(hm);
        System.out.println();


        /* Getting the id of a particular element */
        System.out.println("Getting the id of Rishabh :");
        int id = hm.get("Rishabh");
        System.out.println(id);
        System.out.println();


        /* Checking if our map contains a particular Key */
        boolean ans;

        System.out.println("Checking if Cristiano is present :");
        ans = hm.containsKey("Cristiano");
        System.out.println(ans);
        System.out.println();


        /* Checking if our map contains a particular Value */
        System.out.println("Checking if 12014745 is present :");
        ans = hm.containsValue(12014745);
        System.out.println(ans);
        System.out.println();


        /* Overwriting value already present at a particular key */
        System.out.println("Overwriting value of Rishabh :");
        hm.put("Rishabh", 12013333);
        System.out.println(hm.get("Rishabh"));
        System.out.println();


        /* Changing value already present at a particular key */
        System.out.println("Changing value of Tanya :");
        hm.replace("Tanya", 12014604, 12016666);
        System.out.println(hm.get("Tanya"));
        System.out.println();


        /* Insert a key-value pair if it is not yet present */
        System.out.println("Inserting key-value pair if not present :");
        hm.putIfAbsent("NewKey", 10101010);
        System.out.println(hm);
        System.out.println();


        /* Remove a kay-value pair from the HashMap */
        System.out.println("Removing an entry from the HashMap :");
        hm.remove("Anuj");
        System.out.println(hm);
        System.out.println();


        /* Size of HashMap */
        System.out.println("Size of HashMap :");
        int size = hm.size();
        System.out.println(size);
        System.out.println();

        
        /* List all the Keys */
        System.out.println("Printing all the keys :");
        System.out.println(hm.keySet());
        System.out.println();


        /* List all the Values */
        System.out.println("Printing all the values :");
        System.out.println(hm.values());
        System.out.println();


        /* Deleting HashMap */
        System.out.println("Deleting HashMap :");
        hm.clear();
        System.out.println(hm);
    }
}