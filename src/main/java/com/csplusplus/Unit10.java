package com.csplusplus;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit 10: Recursion — methods that call themselves to solve problems.
 *
 * <p>Every recursive method needs:</p>
 * <ul>
 *   <li><b>Base case:</b> stops the recursion</li>
 *   <li><b>Recursive case:</b> calls itself with a simpler input</li>
 * </ul>
 */
public class Unit10 {

    public static void main(String[] args) {
        // Test your methods here
        Unit10 unit = new Unit10();
        // Example: test summation
        System.out.println("summation(4) = " + unit.summation(4));  // Expected: 10
    }

    /**
     * Calculates the sum of all integers from 1 to n using recursion.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>summation(4) returns 10 (1+2+3+4)</li>
     *   <li>summation(0) returns 0</li>
     * </ul>
     *
     * <p>Hint: Base case: n &lt;= 0, return 0. Recursive: return n + summation(n-1)</p>
     *
     * @param n the upper limit
     * @return the sum of integers from 1 to n
     */
    public int summation(int n) {
        // TODO: Implement recursive summation
        return 0;
    }

    /**
     * Calculates n! (n factorial) using recursion. Negative inputs return 1.
     *
     * <p>Points: 20</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>factorial(5) returns 120 (5*4*3*2*1)</li>
     *   <li>factorial(0) returns 1</li>
     * </ul>
     *
     * <p>Hint: Base case: n &lt;= 1, return 1. Recursive: return n * factorial(n-1)</p>
     *
     * @param n the number
     * @return n factorial
     */
    public int factorial(int n) {
        // TODO: Implement recursive factorial
        return 0;
    }

    /**
     * Sorts an array using recursive merge sort algorithm.
     *
     * <p>Points: 25</p>
     *
     * <p>Hint: Base case: length &lt;= 1, return array.
     * Split, sort each half recursively, merge sorted halves.</p>
     *
     * @param array the array to sort
     * @return a new sorted array
     */
    public int[] mergeSort(int[] array) {
        // TODO: Implement recursive merge sort
        return null;
    }

    /**
     * Solves Tower of Hanoi and returns list of moves.
     * Format: "Move disk X from [fromPeg] to [toPeg]"
     *
     * <p>Points: 25</p>
     *
     * <p>Hint: Base case: n==0 return empty list, n==1 move disk.
     * Recursive: move n-1 to aux, move n to dest, move n-1 from aux to dest.</p>
     *
     * @param n number of disks
     * @param fromPeg starting peg
     * @param toPeg destination peg
     * @param auxPeg auxiliary peg
     * @return list of move descriptions
     */
    public List<String> towerOfHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
        // TODO: Implement recursive Tower of Hanoi
        return new ArrayList<>();
    }

    /**
     * Calculates base raised to the power of exponent using recursion.
     *
     * <p>Points: 20</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>power(2, 3) returns 8</li>
     *   <li>power(2, 0) returns 1</li>
     * </ul>
     *
     * <p>Hint: Base case: exponent == 0, return 1. Recursive: return base * power(base, exponent-1)</p>
     *
     * @param base the base
     * @param exponent the exponent
     * @return base^exponent
     */
    public int power(int base, int exponent) {
        // TODO: Implement recursive power
        return 0;
    }
}
