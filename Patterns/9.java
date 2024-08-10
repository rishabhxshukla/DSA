package Patterns;

class Pattern9
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            //Space
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }

            //Stars
            for (int j = 0; j < (2*N - (2*i+1)); j++)
            {
                System.out.print("*");
            }

            //Space
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }

            //New Line
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern9 obj = new Pattern9();

        //Creating the pattern
        obj.create(5);
    }
}