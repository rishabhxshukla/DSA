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

        /* Printing the Hash table */
        System.out.println(hm);
        System.out.println();


        /* Getting the id of Rishabh */
        int id = hm.get("Rishabh");
        System.out.println(id);
        System.out.println();


        /* Checking if our map contains a certain Key */
        boolean isPresent;

        isPresent = hm.containsKey("Tanya");
        System.out.println((isPresent));

        isPresent = hm.containsKey("Cat");
        System.out.println(isPresent);
        System.out.println();


        /* Checking if our map contains a certain Value */
        isPresent = hm.containsValue(12014745);
        System.out.println(isPresent);
        System.out.println();


        /* To update an existing value, simply use put() function which will overwrite it */
        hm.put("Rishabh", 12013333);
        System.out.println(hm.get("Rishabh"));
        System.out.println();


        /* Replace a value in the Hash Map */
        hm.replace("Tanya", 12014604, 12016666);
        System.out.println(hm.get("Tanya"));
        System.out.println();


        /* Put a key-value pair if it is not yet present */
        hm.putIfAbsent("AbsentKey", 10101010);
        System.out.println(hm);
        System.out.println();


        /* Remove a kay-value pair from the Hash Map */
        hm.remove("Anuj");
        System.out.println(hm);
        System.out.println();


        /* Get the size of a Hash Map */
        int size = hm.size();
        System.out.println(size);
        System.out.println();

        
        /* List all the Keys */
        System.out.println(hm.keySet());
        System.out.println();


        /* List all the Values */
        System.out.println(hm.values());
        System.out.println();
    }
}