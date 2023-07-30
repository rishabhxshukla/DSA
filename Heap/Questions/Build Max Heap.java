/*
Build max heap from a given integer array.
Leaf nodes need not to be heapified as they already follow the heap property.
So, find the position of the last non-leaf node and perform the heapify in reverse order.
Also, increase the size of the heap while taking user input.
Last non-leaf node : (size / 2) - 1
*/
// Array to Max Heap

package Heap.Questions;
import java.io.*;

class BuildMaxHeap
{
    static int size = 0;
    static int maxSize = 7;
    static int arr[] = new int[maxSize];


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
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Get max element */
    int remove()
    {
        if (size <= 0) {
            System.out.println("ERROR: Heap is empty!");
            System.exit(0);
        }
        if (size == 1) {
            size--;
            return arr[0];
        }

        int max = arr[0];
        arr[0] = arr[size - 1];
        size--;
        Heapify(0);

        return max;
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
        BuildMaxHeap h = new BuildMaxHeap();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Inserting array elements
        for (int i=0; i<maxSize; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
            size++;
        }

        //Printing created array
        System.out.println("*** Created Array ***");
        h.printArray();

        //Building max heap
        System.out.println("\n\nBuilding max heap...");
        h.build();

        //Printing created max heap
        System.out.println("\n*** Created Max Heap ***");
        h.print();

        //Removing max value from heap
        System.out.println("\n\nRemoving max value...");
        System.out.println("Max element : " + h.remove());
        System.out.println("Max element : " + h.remove());

        //Printing new max heap
        System.out.println("\n*** New Max Heap ***");
        h.print();
    }
}