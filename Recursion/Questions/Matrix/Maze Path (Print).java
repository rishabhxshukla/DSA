/*
Program to print all possible paths in a maze
Allowed moves : Horizontal (H), Vertical (V), Diagonal (D)
(0,0) ── (0,1) ── (0,2)
  │        │        │
(1,0) ── (1,1) ── (1,2)
  │        │        │
(2,0) ── (2,1) ── (2,2)

maze(0,0,"")
├── H → maze(0,1,"H")
│   ├── H → maze(0,2,"HH")
│   │   └── V → maze(1,2,"HHV")
│   │       └── V → maze(2,2,"HHVV")  //print
│   ├── V → maze(1,1,"HV")
│   │   ├── H → maze(1,2,"HVH")
│   │   │   └── V → maze(2,2,"HVHV")  //print
│   │   ├── V → maze(2,1,"HVV")
│   │   │   └── H → maze(2,2,"HVVH")  //print
│   │   └── D → maze(2,2,"HVD")       //print
│   └── D → maze(1,2,"HD")
│       └── V → maze(2,2,"HDV")       //print
│
├── V → maze(1,0,"V")
│   ├── H → maze(1,1,"VH")
│   │   └── D → maze(2,2,"VHD")       //print
│   ├── V → maze(2,0,"VV")
│   │   └── H → maze(2,1,"VVH")
│   │       └── H → maze(2,2,"VVHH")  //print
│   └── D → maze(2,1,"VD")
│       └── H → maze(2,2,"VDH")       //print
│
└── D → maze(1,1,"D")
    ├── H → maze(1,2,"DH")
    │   └── V → maze(2,2,"DHV")       //print
    ├── V → maze(2,1,"DV")
    │   └── H → maze(2,2,"DVH")       //print
    └── D → maze(2,2,"DD")            //print
*/
// O(3)^(rows + cols)

package Recursion.Questions.Matrix;

class MazePathPrint
{
    /*
     cr : current row
     cc : current column
     dr : destination row
     dc : destination column
    */
    static void maze(int cr, int cc, int dr, int dc, String ans)
    {
        //Base case: reached the destination cell
        if (cr == dr && cc == dc) {
            System.out.print(ans + ", ");
            return;
        }

        //Invalid case: crossed maze boundaries
        if (cr > dr || cc > dc) {
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
        maze(0, 0, 2, 2, "");
    }
}