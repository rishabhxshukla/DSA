/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/

package Patterns;

class Pattern12
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            //Starting digit
            int digit = 0;

            //Even rows
            if (i % 2 == 0) {
                digit = 1;
            }
            //Odd rows
            else {
                digit = 0;
            }

            for (int j = 0; j <= i; j++)
            {
                System.out.print(digit + " ");

                //Flipping the digits
                if (digit == 0) {
                    digit = 1;
                }
                else {
                    digit = 0;
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern12 obj = new Pattern12();

        //Creating the pattern
        obj.create(5);
    }
}