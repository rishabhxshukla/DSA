// PLRLSPIRH
// ...

package Heap.Questions;

class Boilerplate2
{
    int size = 0;
    int maxSize = 7;
    int arr[] = new int[maxSize];


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


    /* Insert an element */
    void insert(int element)
    {
        //Heap Overflow
        if (size >= maxSize) {
            System.out.println("ERROR: Heap is full!");
            System.exit(0);
        }

        arr[size] = element;

        int i = size;

        while (arr[i] > arr[parent(i)])
        {
            swap(i, parent(i));
            i = parent(i);
        }

        size++;
    }


    /* Get root element */
    int remove()
    {
        //Heap Underflow
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


    /* Function to ... */
    //


    public static void main(String args[])
    {
        //Creating object of the class
        Boilerplate2 h = new Boilerplate2();

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