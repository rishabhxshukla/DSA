/*
1        1
12      21
123    321
1234  4321
1234554321
*/

package Patterns;

class Pattern13
{
    /* Function to create the pattern */
    void create(int N)
    {
        //Initial space
        int space = (2 * N) - 2;

        for (int i = 0; i < N; i++)
        {
            //Numbers
            for (int j = 0; j <= i; j++)
            {
                System.out.print(j + 1);
            }

            //Space
            for (int j = 0; j < space; j++)
            {
                System.out.print(" ");
            }

            //Numbers
            for (int j = i; j >= 0; j--)
            {
                System.out.print(j + 1);
            }

            //New Line
            System.out.println();

            //Reducing space by 2
            //Since 2 new digits are added in next iteration
            space = space - 2;
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern13 obj = new Pattern13();

        //Creating the pattern
        obj.create(5);
    }
}