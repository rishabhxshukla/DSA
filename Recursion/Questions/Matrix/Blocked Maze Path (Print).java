/*
Program to print all possible paths in a blocked maze
Allowed moves : Horizontal (H), Vertical (V), Diagonal (D)
(0,0) ── (0,1) ── (0,2)
  │        │        │
(1,0) ── (1,1)X ─ (1,2)
  │        │        │
(2,0)X ─ (2,1) ── (2,2)

maze(0,0,"")
├── H → maze(0,1,"H")
│   ├── H → maze(0,2,"HH")
│   │   ├── H → maze(0,3,"HHH")       //invalid
│   │   ├── V → maze(1,2,"HHV")
│   │   │   └── V → maze(2,2,"HHVV")  //print
│   │   └── D → maze(1,3,"HHD")       //invalid
│   │
│   ├── V → maze(1,1,"HV")            //blocked
│   └── D → maze(1,2,"HD")
│       ├── H → maze(1,3,"HDH")       //invalid
│       ├── V → maze(2,2,"HDV")       //print
│       └── D → maze(2,3,"HDD")       //invalid
│
├── V → maze(1,0,"V")
│   ├── H → maze(1,1,"VH")            //blocked
│   ├── V → maze(2,0,"VV")            //blocked
│   └── D → maze(2,1,"VD")
│       │
│       ├── H → maze(2,2,"VDH")       //print
│       ├── V → maze(3,1,"VDV")       //invalid
│       └── D → maze(3,2,"VDD")       //invalid
│
└── D → maze(1,1,"D")                 //blocked
*/
// O(3)^(rows + cols)

package Recursion.Questions.Matrix;

class BlockedMazePathPrint
{
    // 0: Allowed, 1: Blocked
    static int arr[][] = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 0, 0}
    };

    /*
     cr : current row
     cc : current column
     dr : destination row
     dc : destination column
    */
    static void maze(int cr, int cc, int dr, int dc, String ans)
    {
        //Invalid case: crossed maze boundaries
        if (cr > dr || cc > dc) {
            return;
        }

        //Blocked cell check
        if (arr[cr][cc] == 1) {
            return;
        }

        //Base case: reached the destination cell
        if (cr == dr && cc == dc) {
            System.out.print(ans + ", ");
            return;
        }

        maze(cr, cc + 1, dr, dc, ans + "H");       //Traverse horizontally
        maze(cr + 1, cc, dr, dc, ans + "V");       //Traverse vertically
        maze(cr + 1, cc + 1, dr, dc, ans + "D");   //Traverse diagonally
    }


    public static void main(String args[])
    {
        //Start traversal from top-left corner (0,0)
        //Destination is bottom-right corner (2,2)
        int dr = arr.length - 1;
        int dc = arr[0].length - 1;

        maze(0, 0, dr, dc, "");
    }
}