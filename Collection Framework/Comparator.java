/*
If we have to perform custom sort based on the object's attributes, then we have to use
the Comparator<T> interface and override the compare() method using the lambda expression.

The compare() method returns:
  - A positive number if the current object's alphabet is greater than the other.
  - A negative number if it is less than the other.
  - Zero if alphabet of both the objects are equal.
*/

package CollectionFramework;
import java.util.*;

class Student2
{
    int age;
    String name;
    String city;

    Student2(int age, String name, String city)
    {
        this.age = age;
        this.name = name;
        this.city = city;
    }

    //Overriding toString method to print values
    @Override
    public String toString() {
        return (age + " " + name + " " + city);
    }
}


class ComparatorExample
{
    public static void main(String args[])
    {
        //ArrayList to store the Student objects
        ArrayList<Student2> list = new ArrayList<>();

        list.add(new Student2(25, "Rishabh", "Lucknow"));
        list.add(new Student2(16, "Alex", "Detroit"));
        list.add(new Student2(30, "Griffin", "London"));
        list.add(new Student2(20, "Peter", "Michigan"));
        list.add(new Student2(18, "Sarah", "Chicago"));

        System.out.println("BEFORE :");
        list.forEach(System.out::println);

        //Custom sort logic
        Comparator<Student2> com = (o1, o2) -> {
            return (o1.city.compareTo(o2.city));
        };

        //Sorting the list based on city
        System.out.println("\nSorting the list...\n");
        Collections.sort(list, com);

        System.out.println("AFTER :");
        list.forEach(System.out::println);
    }
}