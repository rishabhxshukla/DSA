/*
Build max heap from a given integer array.
Leaf nodes need not to be heapified as they already follow the heap property.
So, find the position of the last non-leaf node and perform the heapify in reverse order.
Also, increase the size of the heap while taking user input.
Last non-leaf node : (size / 2) - 1
*/

package Heap.Questions;
import java.io.*;

class BuildMaxHeap
{
    static int size = 0;
    static int maxsize = 7;
    static int arr[] = new int[maxsize];


    /* Parent */
    int parent(int i)
    {
        return (i - 1) / 2;
    }


    /* Left child */
    int left(int i)
    {
        return (2 * i) + 1;
    }


    /* Right child */
    int right(int i)
    {
        return (2 * i) + 2;
    }


    /* Leaf node */
    boolean isLeaf(int i)
    {
        return (i >= size/2 && i < size);
    }


    /* Swap nodes */
    void swap(int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    /* Print the heap */
    void print()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Print the array */
    void printArray()
    {
        for (int i=0; i<maxsize; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Fix violated heap property */
    void Heapify(int i)
    {
        if (isLeaf(i)) {
            return;
        }

        if (arr[i] < arr[left(i)] || arr[i] < arr[right(i)])
        {
            if (arr[left(i)] > arr[right(i)])
            {
                swap(i, left(i));
                Heapify(left(i));
            }
            else
            {
                swap(i, right(i));
                Heapify(right(i));
            }
        }
    }


    /* Function to build max heap */
    void build()
    {
        for (int i = (size/2)-1; i >= 0; i--)
        {
            Heapify(i);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        BuildMaxHeap obj = new BuildMaxHeap();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Inserting array elements
        for (int i=0; i<maxsize; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
            size++;
        }

        //Printing original max heap
        System.out.println("*** Created Array ***");
        obj.printArray();

        //Building max heap
        System.out.println("\nBuilding max heap...");
        obj.build();

        //Printing created max heap
        System.out.println("*** Created Max Heap ***");
        obj.print();
    }
}