package Patterns;

class Pattern6
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < (N - i); j++)
            {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern6 obj = new Pattern6();

        //Creating the pattern
        obj.create(5);
    }
}