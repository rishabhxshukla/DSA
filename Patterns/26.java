/*
*****
*   *
*   *
*   *
*****
*/

package Patterns;

class Pattern26
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                //1st row, last row | 1st column, last column
                if (i == 0 || i == N-1 || j == 0 || j == N-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern26 obj = new Pattern26();

        //Creating the pattern
        obj.create(5);
    }
}