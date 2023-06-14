// Max Heap implementation

package Heap;
import java.io.*;

class MaxHeap
{
    static final int maxSize = 10;
    int heap[] = new int[maxSize];
    int size;


    /* Method 1 */
    //Function to return parent
    int parent(int pos)
    {
        return (pos - 1) / 2;
    }


    /* Method 2 */
    //Function to return left child
    int leftChild(int pos)
    {
        return (2 * pos) + 1;
    }


    /* Method 3 */
    //Function to return right child
    int rightChild(int pos)
    {
        return (2 * pos) + 2;
    }


    /* Method 4 */
    //Function to check if given node is leaf node
    boolean isLeaf(int pos)
    {
        if (pos > (size/2) && pos <= size) {
            return true;
        }
        return false;
    }


    /* Method 5 */
    //Function to swap nodes
    void swap(int x, int y)
    {
        int temp = heap[x];
        heap[x] = heap[y];
        heap[y] = temp;
    }


    /* Method 6 */
    //Recursive function to max heapify given subtree
    void maxHeapify(int pos)
    {
        if (isLeaf(pos))
            return;

        if (heap[pos] < heap[leftChild(pos)] || heap[pos] < heap[rightChild(pos)])
        {
            if (heap[leftChild(pos)] > heap[rightChild(pos)])
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
        //Inserting new node
        heap[size] = element;

        //Traverse up from last and fix violated property
        int i = size;

        //If inserted node > its parent
        while (heap[i] > heap[parent(i)])
        {
            //Swap inserted node and parent node
            swap(i, parent(i));
            //Make inserted node the new parent
            i = parent(i);
        }

        //Increasing the size of heap
        size = size + 1;
    }


    /* Method 8 */
    //Display the max heap
    void print()
    {
        for (int i=0; i<size/2; i++)
        {
            System.out.print("Parent Node : " + heap[i]);

            if (leftChild(i) < size) //If the child is out of the bounds
                System.out.print(" Left Child Node: " + heap[leftChild(i)]);

            if (rightChild(i) < size) //The right child index must not be out of the bounds
                System.out.print(" Right Child Node: " + heap[rightChild(i)]);

            System.out.println(); //For new line
        }
    }


    /* Method 9 */
    //Remove an element from max heap
    int extractMax()
    {
        int popped = heap[0];
        heap[0] = heap[--size];
        maxHeapify(0);
        return popped;
    }


    public static void main(String[] arg) throws IOException
    {
        //Creating object of the class
        MaxHeap obj = new MaxHeap();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the max heap
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the element : ");
            int e = Integer.parseInt(b.readLine());
            obj.insert(e);
        }

        //Printing the max heap
        System.out.println("\n*** Created Max Heap ***");
        obj.print();

        //Printing the maximum value in heap
        System.out.println("\nMaximum element : " + obj.extractMax());
    }
}