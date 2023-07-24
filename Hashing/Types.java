/*
In Java, there are 3 types of Map interface implementations :
1) HashMap : Unordered (Entries are not stored in an order)
2) LinkedHashMap : Ordered (Entries are stored exactly in the order they are inserted)
3) TreeMap : Sorted (Entries are sorted based on their keys)
*/

package Hashing;
import java.util.*;

class Types
{
    /* HashMap */
    void hashmap()
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(1, 10);
        hm.put(4, 40);
        hm.put(2, 20);
        hm.put(3, 30);

        System.out.println(hm);
    }


    /* LinkedHashMap */
    void linkedhashmap()
    {
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();

        lhm.put(1, 10);
        lhm.put(4, 40);
        lhm.put(2, 20);
        lhm.put(3, 30);

        System.out.println(lhm);
    }


    /* TreeMap */
    void treemap()
    {
        TreeMap<Integer, Integer> tm = new TreeMap<>();

        tm.put(1, 10);
        tm.put(4, 40);
        tm.put(2, 20);
        tm.put(3, 30);

        System.out.println(tm);
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Types obj = new Types();

        obj.hashmap();
        obj.linkedhashmap();
        obj.treemap();
    }
}