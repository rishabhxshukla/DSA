import java.util.LinkedList;

class LLPackage
{
    public static void main(String args[])
    {
        //Creating a new Linked List
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Rishabh");
        ll.add("Tanya");
        ll.add("Anuj");
        ll.add("Cristiano");
        ll.add("Messi");

        
        //Printing out the Linked List
        System.out.println(ll);
        
        //Size of Linked List
        System.out.println(ll.size());

        //First item :
        System.out.println(ll.getFirst());

        //Index of 'Anuj' in linked list = 2
        System.out.println(ll.indexOf("Anuj"));
    }
}