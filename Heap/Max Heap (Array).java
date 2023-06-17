// Max Heap implementation using Array

package Heap;

class MaxHeap1
{
    int size = 0;                       //Current size of heap
    int maxsize = 7;                    //Maximum size of heap
    int arr[] = new int[maxsize + 1];   //Array to store heap elements


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
        //Single element
        if (size == 1) {
            System.out.println(arr[0]);
            return;
        }

        for (int i = 0; i < size/2; i++)
        {
            System.out.print(arr[i] + " :" + " L-" + arr[left(i)] + "  R-" + arr[right(i)]);
            System.out.println();
        }
    }


    /* Method 7 */
    //Insert an element
    void insert(int element)
    {
        //Full heap
        if (size == maxsize) {
            System.out.println("ERROR: Heap is full!");
            System.exit(0);
        }

        //Increasing heap size
        size++;
        //Inserting new node at last
        arr[size - 1] = element;

        //Traverse up from last and fix violated property
        int i = size - 1;

        //If current node > its parent
        while (arr[i] > arr[parent(i)])
        {
            //Swap current node and parent node
            swap(i, parent(i));
            //Make current node the new parent
            i = parent(i);
        }
    }


    /* Method 8 */
    //Get max element
    int remove()
    {
        //Empty heap
        if (size == 0) {
            System.out.println("ERROR: Heap is empty!");
            System.exit(0);
        }
        //Single element
        if (size == 1) {
            size--;
            return arr[0];
        }

        //Storing max element (root)
        int max = arr[0];
        //Replacing root with last node
        arr[0] = arr[size - 1];
        //Decreasing heap size
        size--;
        //Restoring max heap property
        Heapify(0);
        //Returning max element
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
        MaxHeap1 obj = new MaxHeap1();

        //Inserting elements
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(6);
        obj.insert(7);

        //Printing original max heap
        System.out.println("*** Created Max Heap ***");
        obj.print();

        //Removing max value from heap
        System.out.println("\nRemoving max value...");
        System.out.println("Max element : " + obj.remove());
        System.out.println("Max element : " + obj.remove());

        //Printing new max heap
        System.out.println("\n*** New Max Heap ***");
        obj.print();
    }
}