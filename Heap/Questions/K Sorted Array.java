/*
Sort a nearly sorted (or K sorted) array.
Given an array, where each element is at most K steps away from its desired position.
*/

package Heap.Questions;
import java.io.*;
import java.util.*;

class KSortedArray
{
    static int arr[] = {6, 5, 3, 2, 8, 10, 9};
    static final int size = arr.length;
    static PriorityQueue<Integer> pq = new PriorityQueue<>();


    /* Printing the array */
    void print()
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Function to sort the elements */
    void sort(int k)
    {
        //Variable for replacing the elements
        int j = 0;

        for (int i=0; i<size; i++)
        {
            //Keep adding elements in PriorityQueue
            pq.add(arr[i]);

            //If size of PQ > k, then remove the top element which would be the minimum
            //PQ should contain 1 + k more elements, hence we write > k and not == k
            if (pq.size() > k) {
                arr[j] = pq.remove();
                j++;
            }
        }

        //Replacing the remaining elements
        while (!pq.isEmpty())
        {
            arr[j] = pq.remove();
            j++;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        KSortedArray obj = new KSortedArray();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print();

        System.out.println("\nSorting...");
        obj.sort(3);

        //Printing New array
        System.out.println("*** New Array ***");
        obj.print();
    }
}