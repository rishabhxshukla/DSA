/*
A B C D E
A B C D
A B C
A B
A
*/

package Patterns;

class Pattern16
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (char j = 'A'; j < ('A' + (N - i)); j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern16 obj = new Pattern16();

        //Creating the pattern
        obj.create(5);
    }
}