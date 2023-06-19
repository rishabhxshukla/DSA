package Sorting;
import java.io.*;

class HeapSort
{
    int size = 0;
    int maxsize = 5;
    int arr[] = new int[maxsize];


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


    /* Swap nodes */
    void swap(int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    /* Creating the array */
    void create() throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<maxsize; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
            size++;
        }
    }


    /* Print the array */
    void print()
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Fix violated heap property */
    void Heapify(int arr[], int size, int i)
    {
        int largest = i;

        //Find largest among root, left child and right child
        if (left(i) < size && arr[left(i)] > arr[largest])
            largest = left(i);

        if (right(i) < size && arr[right(i)] > arr[largest])
            largest = right(i);

        //Swap and continue heapifying if root is not largest
        if (largest != i) {
            swap(i, largest);
            Heapify(arr, size, largest);
        }
    }


    /* Build max heap */
    void build()
    {
        for (int i = (size/2)-1; i >= 0; i--)
        {
            Heapify(arr, size, i);
        }
    }


    /* Function to sort the heap */
    void sort()
    {
        //Building
        build();

        //Sorting
        for (int i = size - 1; i >= 0; i--)
        {
            //Swap first and last elements
            swap(0, i);
            Heapify(arr, i, 0);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        HeapSort obj = new HeapSort();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing created array
        System.out.println("*** Created Array ***");
        obj.print();

        //Sorting array
        System.out.println("\nSorting the array...");
        obj.sort();

        //Printing new array
        System.out.println("*** New Array ***");
        obj.print();
    }
}