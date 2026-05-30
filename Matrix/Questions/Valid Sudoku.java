/*
Valid Sudoku
Determine if a 9 x 9 Sudoku board is valid. The cells need to be validated according to the following rules :
1) Each row must contain the digits 1-9 without repetition.
2) Each column must contain the digits 1-9 without repetition.
3) Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the given rules, i.e. the ones not containing '.'

+-------+-------+-------+
| 5 3   |   7   |       |
| 6     | 1 9 5 |       |
|   9 8 |       |   6   |
+-------+-------+-------+
| 8     |   6   |     3 |
| 4     | 8   3 |     1 |
| 7     |   2   |     6 |
+-------+-------+-------+
|   6   |       | 2 8   |
|       | 4 1 9 |     5 |
|       |   8   |   7 9 |
+-------+-------+-------+

Example :
Input: board =
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
*/
// O(243)  [O(9x9) + O(9x9) + O(9x9)]

package Matrix.Questions;
import java.util.*;

class ValidSudoku
{
    /* Helper function to print a given matrix */
    static void print(char matrix[][])
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    /* Check if every row has unique values */
    static boolean rows(char board[][])
    {
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < board.length; i++)
        {
            //Clear HashSet for each row
            hs.clear();

            for (int j = 0; j < board[i].length; j++)
            {
                //Ignore empty cells
                if (board[i][j] == '.') {
                    continue;
                }
                //Duplicate found
                else if (hs.contains(board[i][j])) {
                    return false;
                }
                //Otherwise, add char in HashSet
                else {
                    hs.add(board[i][j]);
                }
            }
        }

        return true;
    }


    /* Check if every column has unique values */
    static boolean cols(char board[][])
    {
        HashSet<Character> hs = new HashSet<>();

        for (int j = 0; j < board[0].length; j++)
        {
            //Clear HashSet for each row
            hs.clear();

            for (int i = 0; i < board.length; i++)
            {
                //Ignore empty cells
                if (board[i][j] == '.') {
                    continue;
                }
                //Duplicate found
                else if (hs.contains(board[i][j])) {
                    return false;
                }
                //Otherwise, add char in HashSet
                else {
                    hs.add(board[i][j]);
                }
            }
        }

        return true;
    }


    /*
    Check if every 3x3 sub-box has unique values
      r = starting row of the box
      c = starting column of the box
    */
    static boolean sbox(char board[][], int r, int c)
    {
        HashSet<Character> hs = new HashSet<>();

        for (int i = r; i < (r + 3); i++)
        {
            for (int j = c; j < (c + 3); j++)
            {
                //Ignore empty cells
                if (board[i][j] == '.') {
                    continue;
                }
                //Duplicate found
                else if (hs.contains(board[i][j])) {
                    return false;
                }
                //Otherwise, add char in HashSet
                else {
                    hs.add(board[i][j]);
                }
            }
        }

        return true;
    }


    static boolean isValidSudoku(char board[][])
    {
        //Validate rows and columns
        boolean rows = rows(board);
        boolean cols = cols(board);

        if(!rows || !cols) {
            return false;
        }

        //Validate all 3x3 sub-boxes
        for (int i = 0; i < board.length; i = i + 3)
        {
            for (int j = 0; j < board[i].length; j = j + 3)
            {
                if(!sbox(board, i, j)){
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String args[])
    {
        //Input matrix
        char board[][] = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        //Print original matrix
        System.out.println("Original Matrix :");
        print(board);

        //Print the result
        System.out.println("Is board a valid Sudoku : " + isValidSudoku(board));
    }
}