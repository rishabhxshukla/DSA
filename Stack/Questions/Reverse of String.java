package Stack.Questions;
import java.io.*;

class StringReverse
{
    int top = -1;
    static final int MAX = 100;
    char a[] = new char[MAX];


    /* Print Stack */
    void printStk()
    {
        for (int i=top; i>=0; i--)
        {
            System.out.print(a[i]);
        }
    }


    /* PUSH */
    void push(char data)
    {
        if (top > MAX - 1)
            System.out.println("Stack Overflow!");
        else
            a[++top] = data;
    }


    public static void main(String args[]) throws IOException
    {
        StringReverse s = new StringReverse();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        System.out.print("Enter the string : ");
        String str = b.readLine();

        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            s.push(ch);
        }

        System.out.println("*** Original String ***");
        System.out.println(str);
        System.out.println("*** New String ***");
        s.printStk();
    }
}