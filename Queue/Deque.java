package Queue;
import java.util.Deque;
import java.util.LinkedList;

class Deque_Implementation
{
    public static void main(String[] args)
    {
        Deque<Integer> dq = new LinkedList<>();

        //Adding elements
        dq.add(1);
        dq.addFirst(2);
        dq.addLast(3);
        System.out.print("add, addFirst, addlast : ");
        System.out.println(dq);

        // Clearing previous elements
        while (!dq.isEmpty())
            dq.remove();

        dq.offer(1);
        dq.offerFirst(2);
        dq.offerLast(3);
        System.out.print("offer, offerFirst, offerLast : ");
        System.out.println(dq);


        //Removing elements
        /*
          System.out.print("remove : ");
          dq.remove();
          System.out.println(dq);
        */
        System.out.print("removeFirst : ");
        dq.removeFirst();
        System.out.println(dq);
        System.out.print("removeLast : ");
        dq.removeLast();
        System.out.println(dq);


        //Contains
        System.out.println("Contains : " + dq.contains(1));
        //isEmpty
        System.out.println("isEmpty : " + dq.isEmpty());
        //Size
        System.out.println("Size : " + dq.size());
    }
}