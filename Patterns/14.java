/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

package Patterns;

class Pattern14
{
    /* Function to create the pattern */
    void create(int N)
    {
        //Starting number
        int start = 1;

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern14 obj = new Pattern14();

        //Creating the pattern
        obj.create(5);
    }
}