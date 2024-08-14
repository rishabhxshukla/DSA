/*
E
D E
C D E
B C D E
A B C D E
*/

package Patterns;

class Pattern21
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (char j = (char)('E' - i); j <= 'E'; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern21 obj = new Pattern21();

        //Creating the pattern
        obj.create(5);
    }
}