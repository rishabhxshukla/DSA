/*
If we have to perform custom sort on a Collection, then we have to use the
Comparator<T> interface and override the compare() method using the lambda expression.

The compare() method returns:
  - A positive number if the current object's last digit is greater than the other.
  - A negative number if it is less than the other.
  - Zero if last digits of both the objects are equal.
*/

package CollectionFramework;
import java.util.*;

class ComparatorExample
{
    public static void main(String args[])
    {
        //ArrayList to store the numbers
        ArrayList<Integer> list = new ArrayList<>();

        list.add(97);
        list.add(10);
        list.add(25);
        list.add(69);
        list.add(33);

        System.out.println("BEFORE :");
        System.out.println(list);

        //Sorting the list based on 2nd digit
        Comparator<Integer> com = (o1, o2) -> {
            if (o1 % 10 > o2 % 10) {
                return 1;
            }
            else if (o1 % 10 < o2 % 10) {
                return -1;
            }
            else {
                return 0;
            }

            //We can also write :
            //return (o1 % 10 - o2 % 10);
        };

        System.out.println("\nSorting the list...\n");
        Collections.sort(list, com);

        System.out.println("AFTER :");
        System.out.println(list);
    }
}