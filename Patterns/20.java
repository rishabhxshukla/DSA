/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/

package Patterns;

class Pattern20
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
            int breakpoint = (2*i+1) / 2;

            for (int j = 0; j < (2*i+1); j++)
            {
                System.out.print(ch);

                if (j < breakpoint)
                    ch++;
                else
                    ch--;
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
        Pattern20 obj = new Pattern20();

        //Creating the pattern
        obj.create(5);
    }
}