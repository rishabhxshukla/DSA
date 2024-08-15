/*
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/

package Patterns;

class Pattern27
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < (2*N-1); i++)
        {
            for (int j = 0; j < (2*N-1); j++)
            {
                int top = i;
                int left = j;
                int right = (2*N-2) - j;
                int bottom = (2*N-2) - i;

                System.out.print(N - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern27 obj = new Pattern27();

        //Creating the pattern
        obj.create(4);
    }
}