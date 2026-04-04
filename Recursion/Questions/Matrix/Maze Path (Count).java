/*
Program to count all possible paths in a maze
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
│   │       └── V → maze(2,2,"HHVV")  //count
│   ├── V → maze(1,1,"HV")
│   │   ├── H → maze(1,2,"HVH")
│   │   │   └── V → maze(2,2,"HVHV")  //count
│   │   ├── V → maze(2,1,"HVV")
│   │   │   └── H → maze(2,2,"HVVH")  //count
│   │   └── D → maze(2,2,"HVD")       //count
│   └── D → maze(1,2,"HD")
│       └── V → maze(2,2,"HDV")       //count
│
├── V → maze(1,0,"V")
│   ├── H → maze(1,1,"VH")
│   │   └── D → maze(2,2,"VHD")       //count
│   ├── V → maze(2,0,"VV")
│   │   └── H → maze(2,1,"VVH")
│   │       └── H → maze(2,2,"VVHH")  //count
│   └── D → maze(2,1,"VD")
│       └── H → maze(2,2,"VDH")       //count
│
└── D → maze(1,1,"D")
    ├── H → maze(1,2,"DH")
    │   └── V → maze(2,2,"DHV")       //count
    ├── V → maze(2,1,"DV")
    │   └── H → maze(2,2,"DVH")       //count
    └── D → maze(2,2,"DD")            //count
*/
// O(3)^(rows + cols)

package Recursion.Questions.Matrix;

class MazePathCount
{
    /*
     cr : current row
     cc : current column
     dr : destination row
     dc : destination column
    */
    static int maze(int cr, int cc, int dr, int dc)
    {
        //Base case: reached the destination cell
        if (cr == dr && cc == dc) {
            return 1;
        }

        //Invalid case: crossed maze boundaries
        if (cr > dr || cc > dc) {
            return 0;
        }

        int H = maze(cr, cc + 1, dr, dc);       //Traverse horizontally
        int V = maze(cr + 1, cc, dr, dc);       //Traverse vertically
        int D = maze(cr + 1, cc + 1, dr, dc);   //Traverse diagonally

        return (H + V + D);
    }


    public static void main(String args[])
    {
        //Start traversal from top-left corner (0,0)
        //Destination is bottom-right corner (2,2)
        System.out.println("Paths count : " + maze(0, 0, 2, 2));
    }
}