// Max Heap implementation

package Heap;

class MaxHeap
{
    int heap[];
    int size;
    int maxsize;


    //Constructor to initialize an empty max heap with given capacity
    MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        heap = new int[this.maxsize];
    }


    /* Method 1 */
    //Returning position of parent
    int parent(int pos)
    {
        return (pos - 1) / 2;
    }


    /* Method 2 */
    //Returning left children
    int leftChild(int pos)
    {
        return (2 * pos) + 1;
    }


    /* Method 3 */
    //Returning right children
    int rightChild(int pos)
    {
        return (2 * pos) + 2;
    }


    /* Method 4 */
    //Returning true if given node is leaf
    boolean isLeaf(int pos)
    {
        if (pos > (size/2) && pos <= size) {
            return true;
        }
        return false;
    }


    /* Method 5 */
    //Swapping nodes
    void swap(int fpos, int spos)
    {
        int tmp;
        tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
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
    //Inserts a new element to max heap
    void insert(int element)
    {
        heap[size] = element;

        // Traverse up and fix violated property
        int current = size;
        while (heap[current] > heap[parent(current)])
        {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }


    /* Method 8 */
    //Display the heap
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


    public static void main(String[] arg)
    {
        MaxHeap maxHeap = new MaxHeap(15);

        //Inserting nodes
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        //Calling maxHeap()
        maxHeap.print();

        //Printing the maximum value in heap
        System.out.println("The max val is " + maxHeap.extractMax());
    }
}