/*
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
*/

package Patterns;

class Pattern19
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            //Space
            for (int j = 0; j < (N-i-1); j++)
            {
                System.out.print(" ");
            }

            //Letters
            char ch = 'A';
            for (int j = 0; j < (2*i+1); j++)
            {
                System.out.print(ch);
                ch++;
            }

            //Space
            for (int j = 0; j < (N-i-1); j++)
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
        Pattern19 obj = new Pattern19();

        //Creating the pattern
        obj.create(5);
    }
}