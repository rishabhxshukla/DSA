package Patterns;

class Pattern7
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < (N - i); j++)
            {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern7 obj = new Pattern7();

        //Creating the pattern
        obj.create(5);
    }
}