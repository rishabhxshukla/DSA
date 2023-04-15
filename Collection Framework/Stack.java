package CollectionFramework;
import java.util.Stack;
import java.util.Collections;

class Stack_CF
{
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();

        /* Inserting elements */
        s.push(30);
        s.push(20);
        s.push(10);


        /* Printing the Stack */
        System.out.println("Printing the Stack :");
        System.out.println(s);
        System.out.println();


        /* Getting the top element of the Stack */
        System.out.println("Top element :");
        int top = s.peek();
        System.out.println(top);
        System.out.println();


        /* Removing the top element of the Stack */
        System.out.println("Removing top element :");
        s.pop();
        System.out.println(s);
        System.out.println();


        /* Size of Stack */
        System.out.println("Size of Stack :");
        int size = s.size();
        System.out.println(size);
        System.out.println();


        /* Iterating over the Stack */
        System.out.println("Iterating over the Stack :");
        for (int i=0; i<s.size(); i++)
        {
            System.out.print(s.get(i) + " ");
        }
        System.out.println("\n");


        /* Sorting the Stack using Collections class */
        System.out.println("Sorting the Stack :");
        Collections.sort(s);
        System.out.println(s);
        System.out.println();


        /* Deleting full Stack */
        System.out.println("Deleting full Stack :");
        s.clear();
        System.out.println(s);
    }
}