/*
A
B B
C C C
D D D D
E E E E E
*/

package Patterns;

class Pattern17
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char)('A' + i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern17 obj = new Pattern17();

        //Creating the pattern
        obj.create(5);
    }
}