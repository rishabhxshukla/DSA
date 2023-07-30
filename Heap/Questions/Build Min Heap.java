/*
Build min heap from a given integer array.
Leaf nodes need not to be heapified as they already follow the heap property.
So, find the position of the last non-leaf node and perform the heapify in reverse order.
Also, increase the size of the heap while taking user input.
Last non-leaf node : (size / 2) - 1
*/
// Array to Min Heap

package Heap.Questions;
import java.io.*;

class BuildMinHeap
{
    static int size = 0;
    static int minsize = 7;
    static int arr[] = new int[minsize];


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


    /* Get min element */
    int remove()
    {
        if (size == 0) {
            System.out.println("ERROR: Heap is empty!");
            System.exit(0);
        }
        if (size == 1) {
            size--;
            return arr[0];
        }

        int min = arr[0];
        arr[0] = arr[size - 1];
        size--;
        Heapify(0);

        return min;
    }


    /* Fix violated heap property */
    void Heapify(int i)
    {
        if (isLeaf(i)) {
            return;
        }

        if (arr[i] > arr[left(i)] || arr[i] > arr[right(i)])
        {
            if (arr[left(i)] < arr[right(i)])
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


    /* Function to build min heap */
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
        BuildMinHeap obj = new BuildMinHeap();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Inserting array elements
        for (int i=0; i<minsize; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
            size++;
        }

        //Printing created array
        System.out.println("*** Created Array ***");
        obj.printArray();

        //Building min heap
        System.out.println("\n\nBuilding min heap...");
        obj.build();

        //Printing created min heap
        System.out.println("\n*** Created Min Heap ***");
        obj.print();

        //Removing min value from heap
        System.out.println("\n\nRemoving min value...");
        System.out.println("Min element : " + obj.remove());
        System.out.println("Min element : " + obj.remove());

        //Printing new min heap
        System.out.println("\n*** New Min Heap ***");
        obj.print();
    }
}