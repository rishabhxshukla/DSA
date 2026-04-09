/*
Word Search
Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are
horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example :
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true


STEPS :
Starting from any cell that matches the first character of the word.

                (r,c)
            /   |   |   \
          U     D   L     R
         /      |   |      \
      (-1,0)  (1,0) (0,-1) (0,1)
        X        |     X      |
                /|\          /|\
              U D L R      U D L R
              ... ...      ... ...

Each recursive call tries to move in 4 directions:
    Up    -> (cr-1, cc)
    Down  -> (cr+1, cc)
    Left  -> (cr, cc-1)
    Right -> (cr, cc+1)

Invalid moves stop when:
 - Out of bounds
 - Already visited
 - Current path cannot form the word (prefix pruning)

When the built string equals the target word:
Return true.

Backtracking:
visited[cr][cc] = false
so other paths can reuse the cell.
*/
// O(m * n * 4^L) where m X n = board dimensions, L = word length

package Recursion.Questions.Matrix;

class WordSearch
{
    static char arr[][] = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
    };
    static String word = "ABCCED";


    static boolean maze(int cr, int cc, String str, boolean visited[][])
    {
        /*
        Invalid cases :
         - Crossed maze boundaries
         - Cell already visited
        */
        if (cr < 0 || cc < 0 || cr > arr.length - 1 || cc > arr[0].length - 1 ||
                visited[cr][cc] == true
        ) {
            return false;
        }

        //Add current cell's char to the path string
        str = str + arr[cr][cc];

        //Pruning: Stop exploring if this path cannot form the word
        if (!word.startsWith(str)) {
            return false;
        }

        //Base case: Word found
        if (str.equals(word)) {
            return true;
        }

        //Mark current cell as visited
        visited[cr][cc] = true;

        //Explore all four directions
        boolean U = maze(cr - 1, cc, str, visited);
        boolean D = maze(cr + 1, cc, str, visited);
        boolean L = maze(cr, cc - 1, str, visited);
        boolean R = maze(cr, cc + 1, str, visited);

        //Unmark the current cell
        visited[cr][cc] = false;

        return (U || D || L || R);
    }


    static boolean exist()
    {
        //Matrix to track visited cells
        boolean visited[][] = new boolean[arr.length][arr[0].length];

        //For every cell in board, try building the word from that cell
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                //Only start from cells where the first letter matches
                if (arr[i][j] == word.charAt(0))
                {
                    boolean ans = maze(i, j, "", visited);

                    //If this is the correct starting point, return true
                    //Else try with a different cell
                    if (ans) {
                        return ans;
                    }
                }
            }
        }

        return false;
    }


    public static void main(String args[])
    {
        //Printing the result
        System.out.println("Word found : " + exist());
    }
}