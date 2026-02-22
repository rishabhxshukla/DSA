# DSA PATTERNS

---

### 1) Two Pointers

Use when working with arrays or strings.

**Problems :**
- Pair sum
- Reverse string / array
- Remove duplicates
- Palindrome check

---

### 2) Searching / Sorting

Use when you have to find or arrange data.

#### Searching

- Linear Search → O(n)
- Binary Search → O(log n) &nbsp; *[sorted data]*

#### Sorting

- Quick Sort
- Merge Sort
- Used before applying binary search or 2-pointers

---

### 3) Stack

**Problems :**
- Undo / Redo
- Parentheses validation
- Expression evaluation
- Next Greater Element

---

### 4) Queue

**Problems :**
- BFS (graphs / trees)
- Scheduling
- Level-order traversal

---

### 5) HashMap

**Problems :**
- Frequency counting
- Fast lookup
- Index tracking

---

### 6) HashSet

**Problems :**
- Removing duplicates
- Checking existence
- Handling unique elements

---

### 7) Priority Queue (Heap)

**Problems :**
- Min / Max element problems
- Top K elements
- Kth largest / smallest element
- Scheduling problems

---

### 8) Binary Search

**Problems :**
- Given data is sorted
- Searching in a range
- Optimization problems

---

### 9) Sliding Window

Sliding window is a technique for solving subarray/substring problems efficiently by maintaining a window that expands and shrinks as it moves across the array/substring, avoiding redundant computation.

**Problems :**
- Subarray / substring problems 
- Maximum / minimum in a window
- Sum / count in a window problems
- Longest / shortest window problems

### * Fixed window *

When to use?
- Window size is fixed
- Window size = exactly K elements
- K controls length, not a property

Template :
  ```
  int i = 0;
  
  for (int j = 0; j < arr.length; j++)
  {
      //Expand window
      sum = sum + arr[j];
  
      //When window size is k
      if (j - i + 1 == k)
      {
          //Process answer
          max = Math.max(max, sum);

          //Shrink window
          sum = sum - arr[i];
          i++;
      }
  }
  ```

Problems :
- Maximum/Minimum sum subarray of size K
- First negative number in every window of size K
- Count occurrences in window of size K
- Average of subarrays of size K

---

### * Variable window *
When to use?
- Window size is not fixed
- Want longest / shortest valid window
- Condition is checked on the whole window

Template :
  ```
  int i = 0;
  
  for (int j = 0; j < arr.length; j++)
  {
      //Expand window
      sum = sum + arr[j];
  
      //Shrink window
      if (!condition)
      {
          while(!condition)
          {
              sum = sum - arr[i];
              i++;
          }
      }

      //Process answer
      max = Math.max(max, sum);
  }
  ```

Remember :
- If invalidity comes AFTER adding → shrink after expand
- If invalidity exists BEFORE adding → shrink before expand

Problems :
- Longest substring without repeating characters
- Longest substring with at most K distinct characters
- Longest subarray of 1s after replacing at most K zeros
- Longest subarray with sum ≤ K
- Minimum size subarray sum

---

### * Variable window - atMost problems *
When to use?
- Problem asks to COUNT subarrays
- K controls a property, not the length
- Condition is monotonic :
  - sum ≤ K
  - odd ≤ K
  - distinct ≤ K

Template :
  ```
  int i = 0;
  
  for (int j = 0; j < arr.length; j++)
  {
      //Expand window
      sum = sum + arr[j];
  
      //Shrink window
      if (!condition)
      {
          while(!condition)
          {
              sum = sum - arr[i];
              i++;
          }
      }

      //Process answer
      count = count + (j - i + 1);
  }
  ```

Formula :  
*exactly K = atMost(K) - atMost(K - 1)*

Problems :
- Subarrays with sum ≤ K
- Subarrays with at most K odd numbers
- Subarrays with at most K distinct integers/characters
- Binary subarrays with sum ≤ goal

---

### 10) Divide & Conquer

**Idea :**
Break problem → Solve separately → Combine

**Problems :**

- Merge Sort
- Quick Sort
- Binary Search

---

### 11) Bit Manipulation

**Problems :**

- XOR problems
- Bit masking
- Space optimization
- Finding unique elements

---

### 12) Recursion & Backtracking

**Problems :**

- Exploring all possibilities
- Permutations / combinations
- Maze, N-Queens, Sudoku

---

### 13) Dynamic Programming

**Types :**

- Memoization (Top-Down)
- Tabulation (Bottom-Up)

**Problems :**

- Overlapping subproblems
- Optimal solution required

---
