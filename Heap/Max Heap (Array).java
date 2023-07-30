// Max Heap implementation using Array

package Heap;

class MaxHeap1
{
    int size = 0;                      //Current size of heap
    int maxsize = 7;                   //Maximum size of heap
    int arr[] = new int[maxsize];      //Array to store heap elements


    /* Method 1 */
    //Parent
    int parent(int i)
    {
        return (i - 1) / 2;
    }


    /* Method 2 */
    //Left child
    int left(int i)
    {
        return (2 * i) + 1;
    }


    /* Method 3 */
    //Right child
    int right(int i)
    {
        return (2 * i) + 2;
    }


    /* Method 4 */
    //Leaf node
    boolean isLeaf(int i)
    {
        return (i >= size/2 && i < size);
    }


    /* Method 5 */
    //Swap nodes
    void swap(int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    /* Method 6 */
    //Print the max heap
    void print()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Method 7 */
    //Insert an element
    void insert(int element)
    {
        //Heap Overflow
        if (size == maxsize) {
            System.out.println("ERROR: Heap is full!");
            System.exit(0);
        }

        //Insert new node
        arr[size] = element;

        //Traverse up from last and fix violated property
        int i = size;

        //If current node > its parent
        while (arr[i] > arr[parent(i)])
        {
            //Swap current node and parent node
            swap(i, parent(i));
            //Make current node the new parent
            i = parent(i);
        }

        //Increase heap size
        size++;
    }


    /* Method 8 */
    //Get max element
    int remove()
    {
        //Heap Underflow
        if (size == 0) {
            System.out.println("ERROR: Heap is empty!");
            System.exit(0);
        }
        //Single element
        if (size == 1) {
            size--;
            return arr[0];
        }

        //Store max element (root)
        int max = arr[0];
        //Replace root with last node
        arr[0] = arr[size - 1];
        //Decrease heap size
        size--;
        //Restore max heap property
        Heapify(0);
        //Return max element
        return max;
    }


    /* Method 9 */
    //Fix violated heap property
    void Heapify(int i)
    {
        //Break condition: Leaf Node
        if (isLeaf(i)) {
            return;
        }

        //If current element is smaller than any of its children
        if (arr[i] < arr[left(i)] || arr[i] < arr[right(i)])
        {
            /* Find the largest of the 2 children & swap it with parent */
            //If left child is greater, then swap it with parent
            if (arr[left(i)] > arr[right(i)])
            {
                swap(i, left(i));
                Heapify(left(i));
            }
            //Otherwise, swap right child with parent
            else
            {
                swap(i, right(i));
                Heapify(right(i));
            }
        }
    }


    public static void main(String args[])
    {
        //Creating object of the class
        MaxHeap1 h = new MaxHeap1();

        //Inserting elements
        h.insert(1);
        h.insert(2);
        h.insert(3);
        h.insert(4);
        h.insert(5);
        h.insert(6);
        h.insert(7);

        //Printing original max heap
        System.out.println("*** Original Max Heap ***");
        h.print();

        //Removing max value from heap
        System.out.println("\n\nRemoving max value...");
        System.out.println("Max element : " + h.remove());

        //Printing new max heap
        System.out.println("\n*** New Max Heap ***");
        h.print();
    }
}