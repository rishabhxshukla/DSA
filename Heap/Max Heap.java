// Max Heap implementation

package Heap;

class MaxHeap
{
    int arr[];
    int size;
    int n;


    //Constructor to initialize an empty max heap
    MaxHeap(int maxsize)
    {
        n = maxsize;                   //Maximum capacity of heap
        size = 0;                      //Current no. of elements
        arr = new int[n + 1];          //Array with indexing from 1
        arr[0] = Integer.MAX_VALUE;    //Sentinel value
    }


    /* Method 1 */
    //Function to return parent
    int parent(int pos)
    {
        return pos / 2;
    }


    /* Method 2 */
    //Function to return left child
    int leftChild(int pos)
    {
        return (2 * pos);
    }


    /* Method 3 */
    //Function to return right child
    int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }


    /* Method 4 */
    //Function to check if given node is leaf node
    boolean isLeaf(int pos)
    {
        return (pos > size/2 && pos <= size);
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
    void maxHeapify(int pos)
    {
        if (isLeaf(pos)) {
            return;
        }

        if (arr[pos] < arr[leftChild(pos)] || arr[pos] < arr[rightChild(pos)])
        {
            if (arr[leftChild(pos)] > arr[rightChild(pos)])
            {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else
            {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
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
        int popped = arr[1];
        arr[1] = arr[size--];
        maxHeapify(1);
        return popped;
    }


    /* METHOD 10 */
    //Function to ensure max heap property is maintained
    void maxHeap()
    {
        for (int pos = (size / 2); pos >= 1; pos--)
        {
            maxHeapify(pos);
        }
    }


    public static void main(String args[])
    {
        //Creating object of the class
        MaxHeap obj = new MaxHeap(9);

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