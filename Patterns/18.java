/*
A A A A A
B B B B
C C C
D D
E
*/

package Patterns;

class Pattern18
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < (N - i); j++)
            {
                System.out.print((char)('A' + i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern18 obj = new Pattern18();

        //Creating the pattern
        obj.create(5);
    }
}