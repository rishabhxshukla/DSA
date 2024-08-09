package Patterns;

class Pattern1
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern1 obj = new Pattern1();

        //Creating the pattern
        obj.create(4);
    }
}