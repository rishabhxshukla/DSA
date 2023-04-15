package HashMap;
import java.util.HashMap;

class Hash_Map
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> map = new HashMap<>();

        /* Inserting the records */
        map.put("Rishabh", 12014745);
        map.put("Tanya", 12014604);
        map.put("Anuj", 12015005);
        map.put("Cristiano", 12017777);
        map.put("Messi", 12011010);

        /* Printing the Hash table */
        System.out.println(map);
        System.out.println();


        /* Getting the id of Rishabh */
        int id = map.get("Rishabh");
        System.out.println(id);
        System.out.println();


        /* Checking if our map contains a certain Key */
        boolean isPresent;

        isPresent = map.containsKey("Tanya");
        System.out.println((isPresent));

        isPresent = map.containsKey("Cat");
        System.out.println(isPresent);
        System.out.println();


        /* Checking if our map contains a certain Value */
        isPresent = map.containsValue(12014745);
        System.out.println(isPresent);
        System.out.println();


        /* To update an existing value, simply use put() function which will overwrite it */
        map.put("Rishabh", 12013333);
        System.out.println(map.get("Rishabh"));
        System.out.println();


        /* Replace a value in the Hash Map */
        map.replace("Tanya", 12014604, 12016666);
        System.out.println(map.get("Tanya"));
        System.out.println();


        /* Put a key-value pair if it is not yet present */
        map.putIfAbsent("AbsentKey", 10101010);
        System.out.println(map);
        System.out.println();


        /* Remove a kay-value pair from the Hash Map */
        map.remove("Anuj");
        System.out.println(map);
        System.out.println();


        /* Get the size of a Hash Map */
        int size = map.size();
        System.out.println(size);
        System.out.println();

        
        /* List all the Keys */
        System.out.println(map.keySet());
        System.out.println();


        /* List all the Values */
        System.out.println(map.values());
        System.out.println();
    }
}