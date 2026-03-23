/*
Tower of Hanoi
The Tower of Hanoi is a mathematical puzzle that consists of 3 rods and a number of disks
of different sizes. The objective of the puzzle is to move the entire stack of disks from
start(A) to end(C) using aux(B) as helper, following these rules:
1) Only one disk can be moved at a time.
2) No bigger disk should be placed on top of a smaller disk.

STEPS : First move all small disks away → move the big disk → put small disks back

move(3)
├── move(2)
│   ├── move(1)
│   │   ├── move(0)        //return 0
│   │   ├── +1             //move disk 1
│   │   └── move(0)        //return 0
│   │
│   ├── +1                 //move disk 2
│   │
│   └── move(1)
│       ├── move(0)        //return 0
│       ├── +1             //move disk 1
│       └── move(0)        //return 0
│
├── +1                     //move disk 3
│
└── move(2)
    ├── move(1)
    │   ├── move(0)        //return 0
    │   ├── +1             //move disk 1
    │   └── move(0)        //return 0
    │
    ├── +1                 //move disk 2
    │
    └── move(1)
        ├── move(0)        //return 0
        ├── +1             //move disk 1
        └── move(0)        //return 0
*/
// O(2)ⁿ

package Recursion.Questions.Number;

class TowerOfHanoiCount
{
    static int move(int n)
    {
        //Base case
        if (n == 0) {
            return 0;
        }

        /* Step 1:
        Count the moves required to move the top (n − 1) disks */
        int left = move(n - 1);

        /* Step 2:
        Move the biggest disk (n) */
        int current = 1;

        /* Step 3:
        Count the moves required to place the (n − 1) disks
        back on top of the largest disk */
        int right = move(n - 1);

        return (left + current + right);
    }


    public static void main(String args[])
    {
        //Printing the result
        System.out.println("No. of moves : " + move(3));
    }
}