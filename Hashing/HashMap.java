package HashMap;
import java.util.HashMap;

class Hash_Map
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> record = new HashMap<>();

        /* Inserting the records */
        record.put("Rishabh", 12014745);
        record.put("Tanya", 12014604);
        record.put("Anuj", 12015005);
        record.put("Cristiano", 12017777);
        record.put("Messi", 12011010);

        /* Printing the Hash table */
        System.out.println(record);
        System.out.println();


        /* Getting the id of Rishabh */
        int id = record.get("Rishabh");
        System.out.println(id);
        System.out.println();


        /* Checking if our map contains a certain Key */
        boolean isPresent;

        isPresent = record.containsKey("Tanya");
        System.out.println((isPresent));

        isPresent = record.containsKey("Cat");
        System.out.println(isPresent);
        System.out.println();


        /* Checking if our map contains a certain Value */
        isPresent = record.containsValue(12014745);
        System.out.println(isPresent);
        System.out.println();


        /* To update an existing value, simply use put() function which will overwrite it */
        record.put("Rishabh", 12013333);
        System.out.println(record.get("Rishabh"));
        System.out.println();


        /* Replace a value in the Hash Map */
        record.replace("Tanya", 12014604, 12016666);
        System.out.println(record.get("Tanya"));
        System.out.println();


        /* Put a key-value pair if it is not yet present */
        record.putIfAbsent("AbsentKey", 10101010);
        System.out.println(record);
        System.out.println();


        /* Remove a kay-value pair from the Hash Map */
        record.remove("Anuj");
        System.out.println(record);
        System.out.println();


        /* Get the size of a Hash Map */
        int size = record.size();
        System.out.println(size);
        System.out.println();

        
        /* List all the Keys */
        System.out.println(record.keySet());
        System.out.println();


        /* List all the Values */
        System.out.println(record.values());
        System.out.println();
    }
}