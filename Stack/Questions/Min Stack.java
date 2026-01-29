/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class :
   - MinStack() initializes the stack object.
   - void push(int val) pushes the element val onto the stack.
   - void pop() removes the element on the top of the stack.
   - int top() gets the top element of the stack.
   - int getMin() retrieves the minimum element in the stack.

You must implement a solution with O(1) time complexity for each function.

Example :
Input:
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output:
[null,null,null,null,-3,null,0,-2]

Explanation:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   //returns -3
minStack.pop();
minStack.top();      //returns 0
minStack.getMin();   //returns -2
*/
// TWO STACKS

package Stack.Questions;
import java.io.*;
import java.util.*;
import java.util.logging.Logger;

class MinStack
{
    Stack<Integer> s;
    Stack<Integer> min;


    public MinStack()
    {
        s = new Stack<>();
        min = new Stack<>();
    }


    public void push(int val)
    {
        //Insert only if minStack is empty or current val <= top of minStack
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }

        s.push(val);

        System.out.println("PUSH : " + s + ":" + min);
    }


    public void pop()
    {
        if (!s.isEmpty())
        {
            int removed = s.pop();

            //Remove if removed element was the minimum
            if (removed == min.peek()) {
                min.pop();
            }
        }

        System.out.println("POP : " + s + ":" + min);
    }


    public int top()
    {
        System.out.println("TOP : " + s.peek());

        return s.peek();
    }


    public int getMin()
    {
        System.out.println("MIN : " + min.peek());

        return min.peek();
    }


    public static void main(String args[])
    {
        //Performing the steps
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        obj.getMin();
        obj.pop();
        obj.top();
        obj.getMin();
    }
}