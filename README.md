# CS++ Java — Unit 10: Recursion

> **Unit 10** | 100 Points | 5 Autograded Tests

In this assignment you will write recursive methods with proper base cases. You will implement classic algorithms including merge sort and Tower of Hanoi. **No loops allowed** — every method must use recursion.

---

## Table of Contents

1. [Concepts You Need](#concepts-you-need)
2. [Project Overview](#project-overview)
3. [Methods to Implement](#methods-to-implement)
4. [File Structure](#file-structure)
5. [Autograding](#autograding)
6. [Try It Yourself — Practice Examples](#try-it-yourself--practice-examples)
7. [Tips for Success](#tips-for-success)
8. [FAQ](#faq)

---

## Concepts You Need

### What is Recursion?

Recursion is when a method calls itself. Every recursive method needs:
1. **Base case** — a condition that stops the recursion
2. **Recursive case** — the method calls itself with a smaller/simpler input

```java
public int factorial(int n) {
    if (n <= 1) return 1;         // base case
    return n * factorial(n - 1);  // recursive case
}
```

### How Recursion Works

Each call creates a new frame on the call stack:

```
factorial(4)
  → 4 * factorial(3)
    → 3 * factorial(2)
      → 2 * factorial(1)
        → 1              (base case)
      → 2 * 1 = 2
    → 3 * 2 = 6
  → 4 * 6 = 24
```

### Summation

Sum of 1 to `n`:

```java
public int summation(int n) {
    if (n <= 0) return 0;
    return n + summation(n - 1);
}
// summation(5) = 5 + 4 + 3 + 2 + 1 = 15
```

### Power (Exponentiation)

`base^exponent` using recursion:

```java
public int power(int base, int exponent) {
    if (exponent == 0) return 1;
    return base * power(base, exponent - 1);
}
// power(2, 3) = 2 * 2 * 2 = 8
```

### Merge Sort

A divide-and-conquer sorting algorithm:
1. **Divide** the array in half
2. **Recursively sort** each half
3. **Merge** the two sorted halves back together

```
[5, 3, 8, 1]
  → [5, 3]  and  [8, 1]       (divide)
    → [5] [3]  and  [8] [1]   (divide again)
    → [3, 5]   and  [1, 8]    (merge sorted)
  → [1, 3, 5, 8]              (merge sorted)
```

### Tower of Hanoi

Move `n` disks from one peg to another, using a helper peg:
- Only move one disk at a time
- Never place a larger disk on a smaller one

The recursive solution:
1. Move `n-1` disks from source to auxiliary
2. Move the largest disk from source to target
3. Move `n-1` disks from auxiliary to target

Each move is recorded as a string: `"A -> C"` (move top disk from peg A to peg C).

---

## Project Overview

You will implement five instance methods in `Unit10.java`. All methods must use recursion — no `for` or `while` loops.

---

## Methods to Implement

### 1. summation(int n)
Return the sum of all integers from 1 to `n`. Return 0 if `n` is 0 or negative.

```java
summation(5)    // returns 15 (1+2+3+4+5)
summation(1)    // returns 1
summation(0)    // returns 0
```

### 2. factorial(int n)
Return `n!` (n factorial). `0!` is `1`.

```java
factorial(5)    // returns 120 (5*4*3*2*1)
factorial(3)    // returns 6
factorial(0)    // returns 1
```

### 3. mergeSort(int[] array)
Sort the array in ascending order using the merge sort algorithm. Return a new sorted array.

```java
mergeSort(new int[]{5, 3, 8, 1, 9})    // returns {1, 3, 5, 8, 9}
mergeSort(new int[]{4, 2})              // returns {2, 4}
mergeSort(new int[]{1})                 // returns {1}
```

### 4. towerOfHanoi(int n, char fromPeg, char toPeg, char auxPeg)
Return a `List<String>` of moves to solve the Tower of Hanoi puzzle with `n` disks. Each move is formatted as `"X -> Y"` where X and Y are peg names.

```java
towerOfHanoi(1, 'A', 'C', 'B')
// returns ["A -> C"]

towerOfHanoi(2, 'A', 'C', 'B')
// returns ["A -> B", "A -> C", "B -> C"]

towerOfHanoi(3, 'A', 'C', 'B')
// returns ["A -> C", "A -> B", "C -> B", "A -> C", "B -> A", "B -> C", "A -> C"]
```

### 5. power(int base, int exponent)
Return `base` raised to the power of `exponent`. Assume `exponent >= 0`.

```java
power(2, 3)    // returns 8
power(5, 0)    // returns 1
power(3, 4)    // returns 81
```

---

## File Structure

```
Unit-10-Tests/
├── pom.xml                                      <-- Maven config (DO NOT MODIFY)
├── src/
│   ├── main/java/com/csplusplus/
│   │   └── Unit10.java                          <-- YOUR CODE GOES HERE
│   └── test/java/com/csplusplus/
│       └── Unit10Test.java                      <-- Tests (DO NOT MODIFY)
└── .github/
    └── workflows/
        └── classroom.yml                        <-- Autograding (DO NOT MODIFY)
```

**Edit only `Unit10.java`.** You will need to import `java.util.ArrayList` and `java.util.List`.

---

## Autograding

| Test | What It Checks | Points |
|------|---------------|--------|
| testSummation | Recursive sum of 1 to n | 10 |
| testFactorial | Recursive n! | 20 |
| testMergeSort | Correctly sorts array using merge sort | 25 |
| testTowerOfHanoi | Correct sequence of moves | 25 |
| testPower | Recursive exponentiation | 20 |

**Total: 100 points**

---

## Try It Yourself — Practice Examples

Create `Practice.java` in the same directory and run it with `javac Practice.java && java Practice`.

**Example 1 — Basic recursion:**
```java
// Practice.java
public class Practice {
    public static int summation(int n) {
        if (n <= 0) return 0;
        return n + summation(n - 1);
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.println("Sum 1-10: " + summation(10));    // 55
        System.out.println("5! = " + factorial(5));           // 120
        System.out.println("2^10 = " + power(2, 10));        // 1024
    }
}
```

**Example 2 — Merge sort step by step:**
```java
// Practice.java
import java.util.Arrays;

public class Practice {
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) result[k++] = left[i++];
            else result[k++] = right[j++];
        }
        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Before: " + Arrays.toString(arr));
        System.out.println("After:  " + Arrays.toString(mergeSort(arr)));
    }
}
```

**Example 3 — Tower of Hanoi:**
```java
// Practice.java
import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static List<String> towerOfHanoi(int n, char from, char to, char aux) {
        List<String> moves = new ArrayList<>();
        if (n == 1) {
            moves.add(from + " -> " + to);
            return moves;
        }
        moves.addAll(towerOfHanoi(n - 1, from, aux, to));
        moves.add(from + " -> " + to);
        moves.addAll(towerOfHanoi(n - 1, aux, to, from));
        return moves;
    }

    public static void main(String[] args) {
        List<String> moves = towerOfHanoi(3, 'A', 'C', 'B');
        for (int i = 0; i < moves.size(); i++) {
            System.out.println("Move " + (i + 1) + ": " + moves.get(i));
        }
        System.out.println("Total moves: " + moves.size());  // 7
    }
}
```

---

## Tips for Success

1. Every recursive method needs a **base case** — without it, you get a `StackOverflowError`
2. No `for` or `while` loops allowed — the test may check for this
3. For `mergeSort`, use `Arrays.copyOfRange()` to split the array, then merge the sorted halves
4. The `merge` helper method can use loops (only the sort logic must be recursive)
5. For `towerOfHanoi`, the pattern is: move n-1 to aux, move largest to target, move n-1 from aux to target
6. Start with `summation` and `power` — they are the simplest recursive patterns

---

## FAQ

**Q: What is a StackOverflowError?**
It means your recursion never stopped — the base case was never reached (or is wrong). Check your base case condition.

**Q: Can the merge helper method use loops?**
Yes. The recursive part is the divide step (splitting and sorting halves). The merge step (combining two sorted arrays) typically uses a while loop.

**Q: How many moves does Tower of Hanoi take?**
For `n` disks, it takes `2^n - 1` moves. So 3 disks = 7 moves, 4 disks = 15 moves.

**Q: What should `factorial(0)` return?**
`1`. By mathematical convention, `0! = 1`.

**Q: Do I need to import anything for List?**
Yes. Add `import java.util.ArrayList;` and `import java.util.List;` at the top of the file. You may also need `import java.util.Arrays;` for `Arrays.copyOfRange()`.

---

View all assignments and scoring breakdowns at [csplusplus.com/maven-tests](https://csplusplus.com/maven-tests)

*CS++ — AP Computer Science A — [csplusplus.com](https://csplusplus.com)*
