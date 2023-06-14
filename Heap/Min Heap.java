// Min Heap implementation

package Heap;

class MinHeap
{
    int arr[];
    int size;
    int n;


    //Constructor to initialize an empty min heap
    MinHeap(int maxsize)
    {
        n = maxsize;                   //Maximum capacity of heap
        size = 0;                      //Current no. of elements
        arr = new int[n + 1];          //Array with indexing from 1
        arr[0] = Integer.MIN_VALUE;    //Sentinel value
    }


    /* Method 1 */
    //Function to return parent
    int parent(int i)
    {
        return i / 2;
    }


    /* Method 2 */
    //Function to return left child
    int leftChild(int i)
    {
        return (2 * i);
    }


    /* Method 3 */
    //Function to return right child
    int rightChild(int i)
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
    //Recursive function to min heapify given subtree
    void minHeapify(int i)
    {
        if (isLeaf(i)) {
            return;
        }

        if (arr[i] > arr[leftChild(i)] || arr[i] > arr[rightChild(i)])
        {
            if (arr[leftChild(i)] < arr[rightChild(i)])
            {
                swap(i, leftChild(i));
                minHeapify(leftChild(i));
            }
            else
            {
                swap(i, rightChild(i));
                minHeapify(rightChild(i));
            }
        }
    }


    /* Method 7 */
    //Insert an element in the min heap
    void insert(int element)
    {
        //Increasing the size of heap
        size = size + 1;
        //Inserting new node
        arr[size] = element;

        //Traverse up from last and fix violated property
        int i = size;

        //If inserted node < its parent
        while (arr[i] < arr[parent(i)])
        {
            //Swap inserted node and parent node
            swap(i, parent(i));
            //Make inserted node the new parent
            i = parent(i);
        }
    }


    /* Method 8 */
    //Print the min heap
    void print()
    {
        for (int i = 1; i <= size / 2; i++)
        {
            System.out.print(arr[i] + " :" + " L-" + arr[2 * i] + "  R-" + arr[2 * i + 1]);
            System.out.println();
        }
    }


    /* Method 9 */
    //Function to get min element from min heap
    int minElement()
    {
        //Storing min element (root)
        int min = arr[1];
        //Replacing root with last node
        arr[1] = arr[size--];
        //Restoring min heap property
        minHeapify(1);
        //Returning min element
        return min;
    }


    /* METHOD 10 */
    //Function to ensure min heap property is maintained
    void minHeap()
    {
        for (int i = (size / 2); i >= 1; i--)
        {
            minHeapify(i);
        }
    }


    public static void main(String args[])
    {
        //Creating object of the class
        MinHeap obj = new MinHeap(9);

        obj.insert(5);
        obj.insert(3);
        obj.insert(17);
        obj.insert(10);
        obj.insert(84);
        obj.insert(19);
        obj.insert(6);
        obj.insert(22);
        obj.insert(9);
        obj.minHeap();

        //Printing the min heap
        System.out.println("*** Created Min Heap ***");
        obj.print();

        //Printing the minimum value in heap
        System.out.println("\nMinimum element : " + obj.minElement());
    }
}