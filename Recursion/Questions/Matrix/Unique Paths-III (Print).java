/*
Unique Paths III
You are given an m x n integer array grid where grid[i][j] could be :
   1 representing the starting square. There is exactly one starting square.
   2 representing the ending square. There is exactly one ending square.
   0 representing empty squares we can walk over.
  -1 representing obstacles that we cannot walk over.

Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.

Example :
Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
Output: 2
Explanation: We have the following two paths:
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)

STEPS :
Starting from (0,0)

                (0,0)
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
 - Obstacle (-1)

When destination is reached:
Check if all empty cells were visited.

Backtracking:
visited[cr][cc] = false
so other paths can reuse the cell.
*/
// O(N * 4ᴺ)

package Recursion.Questions.Matrix;

class UniquePathsIIIPrint
{
    static int arr[][] = {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 2, -1}
    };


    /* Finds the coordinates of the start and end cells */
    static int[] findPoints(int grid[][])
    {
        int points[] = new int[4];

        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                //Starting cell
                if (grid[i][j] == 1) {
                    points[0] = i;
                    points[1] = j;
                }
                //Destination cell
                else if (grid[i][j] == 2) {
                    points[2] = i;
                    points[3] = j;
                }
            }
        }

        return points;
    }


    /* Checks whether all empty cells(0) have been visited */
    static boolean allVisited(int grid[][], boolean visited[][])
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                //If an empty cell was never visited, path is invalid
                if(grid[i][j] == 0 && visited[i][j] == false) {
                    return false;
                }
            }
        }

        return true;
    }


    static void maze(int cr, int cc, int dr, int dc, String ans, boolean visited[][])
    {
        /*
        Invalid cases :
         - Crossed maze boundaries
         - Cell already visited
         - Blocked cell check
        */
        if (cr < 0 || cc < 0 || cr >= arr.length || cc >= arr[0].length ||
                visited[cr][cc] == true ||
                arr[cr][cc] == -1
        ) {
            return;
        }

        //Base case: Reached the destination cell
        if (cr == dr && cc == dc)
        {
            //Valid path only if all empty cells were visited
            if(allVisited(arr, visited)) {
                System.out.println(ans);
                return;
            }
            else {
                return;
            }
        }

        //Mark current cell as visited
        visited[cr][cc] = true;

        //Explore all four directions
        maze(cr - 1, cc, dr, dc, ans + "U", visited);
        maze(cr + 1, cc, dr, dc, ans + "D", visited);
        maze(cr, cc - 1, dr, dc, ans + "L", visited);
        maze(cr, cc + 1, dr, dc, ans + "R", visited);

        //Unmark the current cell
        visited[cr][cc] = false;
    }


    public static void main(String args[])
    {
        //Find start and destination coordinates
        int p[] = findPoints(arr);

        //Matrix to track visited cells
        boolean visited[][] = new boolean[arr.length][arr[0].length];

        maze(p[0], p[1], p[2], p[3], "", visited);
    }
}