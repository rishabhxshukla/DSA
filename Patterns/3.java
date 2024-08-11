/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

package Patterns;

class Pattern3
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern3 obj = new Pattern3();

        //Creating the pattern
        obj.create(5);
    }
}