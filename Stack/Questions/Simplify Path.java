/*
You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform
this absolute path into its simplified canonical path.

The rules of a Unix-style file system are as follows:
    1) A single period '.' represents the current directory.
    2) A double period '..' represents the previous/parent directory.
    3) Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
    4) Any sequence of periods that does not match the rules above should be treated as a valid directory or file name.
       For example, '...' and '....' are valid directory or file names.

The simplified canonical path should follow these rules:
    1) The path must start with a single slash '/'.
    2) Directories within the path must be separated by exactly one slash '/'.
    3) The path must not end with a slash '/', unless it is the root directory.
    4) The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.

Return the simplified canonical path.

Example 1 :
Input: path = "/home/"
Output: "/home"
Explanation: The trailing slash should be removed.

Example 2 :
Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: Multiple consecutive slashes are replaced by a single one.

Example 3 :
Input: path = "/home/user/Documents/../Pictures"
Output: "/home/user/Pictures"
Explanation: A double period ".." refers to the directory up a level (the parent directory).

Example 4 :
Input: path = "/../"
Output: "/"
Explanation: Going one level up from the root directory is not possible.

Example 5 :
Input: path = "/.../a/../b/c/../d/./"
Output: "/.../b/d"
Explanation: "..." is a valid name for a directory in this problem.
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class SimplifyPath
{
    static String path = "/../";


    /* Function to return the simplified canonical path */
    static String simplifyPath()
    {
        String ans = "";
        Stack<String> s = new Stack<>();

        //Split the path by "/"
        String parts[] = path.split("/");

        //Iterate over the parts array
        for (int i = 0; i < parts.length; i++)
        {
            //Extract each word
            String word = parts[i];

            if (word.equals(".")) {
                //Ignore the single dot
                continue;
            }
            else if (word.equals("..")) {
                //Remove latest entry from stack
                if (!s.isEmpty()) {
                    s.pop();
                }
            }
            else {
                //Push folder name in stack if it is not empty
                if (!word.equals("")) {
                    s.push(word);
                }
            }
        }

        //Creating the resultant path
        while (!s.isEmpty())
        {
            ans = "/" + s.pop() + ans;
        }

        //If result string is empty, return a single forward slash
        if (ans.equals("")) {
            return "/";
        }

        return ans;
   }


    public static void main(String args[]) throws IOException
    {
        //Printing the original path
        System.out.println("Original path : " + path);

        //Printing the simplified path
        System.out.println("Simplified path : " + simplifyPath());
    }
}