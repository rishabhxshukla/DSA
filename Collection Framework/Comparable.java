/*
If we have to perform custom sort based on the object's attributes, then we have to
implement the Comparable<T> interface and compulsorily implement the compareTo() method.

The compareTo() method returns:
  - A positive number if the current object's age is greater than the other.
  - A negative number if it is less than the other.
  - Zero if ages of both the objects are equal.
*/

package CollectionFramework;
import java.util.*;

class Student implements Comparable<Student>
{
    int age;
    String name;
    String city;

    Student(int age, String name, String city)
    {
        this.age = age;
        this.name = name;
        this.city = city;
    }

    //Overriding compareTo method to sort values
    @Override
    public int compareTo(Student that)
    {
        if (this.age > that.age) {
            return 1;
        }
        else if (this.age < that.age) {
            return -1;
        }
        else {
            return 0;
        }

        //We can also write :
        //return (this.age - that.age);
    }

    //Overriding toString method to print values
    @Override
    public String toString() {
        return (age + " " + name + " " + city);
    }
}


class ComparableExample
{
    public static void main(String args[])
    {
        //ArrayList to store the Student objects
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(25, "Rishabh", "Lucknow"));
        list.add(new Student(16, "Alex", "Detroit"));
        list.add(new Student(30, "Griffin", "London"));
        list.add(new Student(20, "Peter", "Michigan"));
        list.add(new Student(18, "Sarah", "Chicago"));

        System.out.println("BEFORE :");
        list.forEach(System.out::println);

        //Sorting the list based on age
        System.out.println("\nSorting the list...\n");
        Collections.sort(list);

        System.out.println("AFTER :");
        list.forEach(System.out::println);
    }
}