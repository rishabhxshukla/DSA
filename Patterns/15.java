/*
A
A B
A B C
A B C D
A B C D E
*/

package Patterns;

class Pattern15
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (char j = 'A'; j <= ('A' + i); j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern15 obj = new Pattern15();

        //Creating the pattern
        obj.create(5);
    }
}