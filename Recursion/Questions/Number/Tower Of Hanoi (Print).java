/*
Tower of Hanoi
The Tower of Hanoi is a mathematical puzzle that consists of 3 rods and a number of disks
of different sizes. The objective of the puzzle is to move the entire stack of disks from
start(A) to end(C) using aux(B) as helper, following these rules:
1) Only one disk can be moved at a time.
2) No bigger disk should be placed on top of a smaller disk.

STEPS : First move all small disks away → move the big disk → put small disks back

move(3, A, B, C)
├── move(2, A, C, B)
│   ├── move(1, A, B, C)
│   │   ├── move(0, A, C, B)        //return
│   │   ├── Move disk 1 : A -> C    //print
│   │   └── move(0, B, A, C)        //return
│   │
│   ├── Move disk 2 : A -> B        //print
│   │
│   └── move(1, C, A, B)
│       ├── move(0, C, B, A)        //return
│       ├── Move disk 1 : C -> B    //print
│       └── move(0, A, C, B)        //return
│
├── Move disk 3 : A -> C            //print
│
└── move(2, B, A, C)
    ├── move(1, B, C, A)
    │   ├── move(0, B, A, C)        //return
    │   ├── Move disk 1 : B -> A    //print
    │   └── move(0, C, B, A)        //return
    │
    ├── Move disk 2 : B -> C        //print
    │
    └── move(1, A, B, C)
        ├── move(0, A, C, B)        //return
        ├── Move disk 1 : A -> C    //print
        └── move(0, B, A, C)        //return
*/
// O(2)ⁿ

package Recursion.Questions.Number;

class TowerOfHanoiPrint
{
    static void move(int n, char A, char B, char C)
    {
        //Base case
        if (n == 0) {
            return;
        }

        /* Step 1:
        Move the top n - 1 disks from A to B (using C as helper)
        So that the biggest disk (n) becomes free */
        move(n - 1, A, C, B);

        /* Step 2:
        Move the biggest disk (n) from A to C */
        System.out.println("Move disk " +n+ " : " +A+ " -> " +C);

        /* Step 3:
        Move the tower of n - 1 disks from B to C (using A as helper)
        Place them on top of biggest disk (n) */
        move(n - 1, B, A, C);
    }


    public static void main(String args[])
    {
        //Printing the result
        move(3, 'A', 'B', 'C');
    }
}