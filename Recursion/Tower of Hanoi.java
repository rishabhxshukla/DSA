/*
Program for Tower of Hanoi algorithm.
The Tower of Hanoi is a mathematical puzzle that consists of 3 rods and a number of disks
of different sizes. The objective of the puzzle is to move the entire stack of disks from
one rod to another, following these rules:
1) Only one disk can be moved at a time.
2) You can only move the upper disk of the rod.
3) No bigger disk should be placed on top of a smaller disk.
*/

package Recursion;
import java.io.*;

class TowerOfHanoi
{
    /* Function to move the disks */
    void move(int n, char from, char aux, char to)
    {
        if (n == 0) {
            return;
        }

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