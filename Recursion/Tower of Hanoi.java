// Program for Tower of Hanoi algorithm

package Recursion;
import java.io.*;

class TowerOfHanoi
{
    /* Function to move the disks */
    void move(int n, char from, char aux, char to)
    {
        if (n == 0)
            return;

        move(n-1, from, to, aux);
        System.out.println("Moved disk " +n+ " from " +from+ " to " +to);
        move(n-1, aux, from, to);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        TowerOfHanoi obj = new TowerOfHanoi();

        //Moving the disks
        obj.move(3, 'A', 'B', 'C');
    }
}