package Patterns;

class Pattern4
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern4 obj = new Pattern4();

        //Creating the pattern
        obj.create(5);
    }
}