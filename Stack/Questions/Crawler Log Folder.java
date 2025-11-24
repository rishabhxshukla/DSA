/*
The leetcode file system keeps a log each time some user performs a change folder operation.
The operations are described below :
    "../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
    "./"  : Remain in the same folder.
    "x/"  : Move to the child folder named x (This folder is guaranteed to always exist).

You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.
The file system starts in the main folder, then the operations in logs are performed.
Return the minimum number of operations needed to go back to the main folder after the change folder operations.

Example :
Input: logs = ["d1/", "d2/", "../", "d21/", "./"]
Output: 2

Example :
Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
Output: 3
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class CrawlerLogFolder
{
    static Stack<String> s = new Stack<>();
    static String logs[] = {"d1/", "d2/", "../", "d21/", "./"};


    /* Function to check minimum no. of required operations */
    static int minOperations()
    {
        for (int i = 0; i < logs.length; i++)
        {
            //Extracting each operation
            String op = logs[i];

            //Remove last folder name from stack
            if (op.equals("../")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            }
            //Do nothing
            else if (op.equals("./")) {
            }
            //Push folder name in stack
            else if (op.matches("[a-zA-Z0-9]+/")) {
                s.push(op);
            }
        }

        //Return no. of folder names in stack
        return s.size();
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Printing the result
        System.out.println("Minimum no. of operations : " + minOperations());
    }
}