// Max Heap implementation using Array

package Heap;

class MaxHeap1
{
    int arr[];
    int size;
    int n;


    //Constructor to initialize an empty max heap
    MaxHeap1(int maxsize)
    {
        n = maxsize;                   //Maximum capacity of heap
        size = 0;                      //Current no. of elements
        arr = new int[n + 1];          //Array with indexing from 1
        arr[0] = Integer.MAX_VALUE;    //Sentinel value
    }


    /* Method 1 */
    //Function to return parent
    int parent(int i)
    {
        return i / 2;
    }


    /* Method 2 */
    //Function to return left child
    int left(int i)
    {
        return (2 * i);
    }


    /* Method 3 */
    //Function to return right child
    int right(int i)
    {
        return (2 * i) + 1;
    }


    /* Method 4 */
    //Function to check if given node is leaf node
    boolean isLeaf(int i)
    {
        return (i > size/2 && i <= size);
    }


    /* Method 5 */
    //Function to swap nodes
    void swap(int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    /* Method 6 */
    //Recursive function to max heapify given subtree
    void maxHeapify(int i)
    {
        if (isLeaf(i)) {
            return;
        }

        if (arr[i] < arr[left(i)] || arr[i] < arr[right(i)])
        {
            if (arr[left(i)] > arr[right(i)])
            {
                swap(i, left(i));
                maxHeapify(left(i));
            }
            else
            {
                swap(i, right(i));
                maxHeapify(right(i));
            }
        }
    }


    /* Method 7 */
    //Insert an element in the max heap
    void insert(int element)
    {
        //Increasing the size of heap
        size = size + 1;
        //Inserting new node
        arr[size] = element;

        //Traverse up from last and fix violated property
        int i = size;

        //If inserted node > its parent
        while (arr[i] > arr[parent(i)])
        {
            //Swap inserted node and parent node
            swap(i, parent(i));
            //Make inserted node the new parent
            i = parent(i);
        }
    }


    /* Method 8 */
    //Print the max heap
    void print()
    {
        for (int i = 1; i <= size / 2; i++)
        {
            System.out.print(arr[i] + " :" + " L-" + arr[2 * i] + "  R-" + arr[2 * i + 1]);
            System.out.println();
        }
    }


    /* Method 9 */
    //Function to get max element from max heap
    int maxElement()
    {
        //Storing max element (root)
        int max = arr[1];
        //Replacing root with last node
        arr[1] = arr[size--];
        //Restoring max heap property
        maxHeapify(1);
        //Returning max element
        return max;
    }


    /* METHOD 10 */
    //Function to ensure max heap property is maintained
    void maxHeap()
    {
        for (int i = (size / 2); i >= 1; i--)
        {
            maxHeapify(i);
        }
    }


    public static void main(String args[])
    {
        //Creating object of the class
        MaxHeap1 obj = new MaxHeap1(9);

        obj.insert(5);
        obj.insert(3);
        obj.insert(17);
        obj.insert(10);
        obj.insert(84);
        obj.insert(19);
        obj.insert(6);
        obj.insert(22);
        obj.insert(9);
        obj.maxHeap();

        //Printing the max heap
        System.out.println("*** Created Max Heap ***");
        obj.print();

        //Printing the maximum value in heap
        System.out.println("\nMaximum element : " + obj.maxElement());
    }
}