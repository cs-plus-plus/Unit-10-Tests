package com.csplusplus;

import java.util.ArrayList;
import java.util.List;

public class Unit10 {

    /**
     * Calculates the summation of all integers from 1 to n using recursion.
     * @param n the upper limit of the summation range
     * @return the sum of all integers from 1 to n
     * 
     * TODO: Implement this method using recursion. (10 points)
     * - Base case: if n <= 1, return n.
     * - Recursive case: return n + summation(n - 1).
     */
    public int summation(int n) {
        // TODO: Implement recursive summation.
        return 0; // placeholder return
    }

    /**
     * Calculates the factorial of n using recursion.
     * @param n the integer for which to compute the factorial
     * @return the factorial of n
     * 
     * TODO: Implement this method using recursion. (20 points)
     * - Base case: if n <= 1, return 1.
     * - Recursive case: return n * factorial(n - 1).
     * - Note: Assume factorial of negative numbers is 1 for simplicity.
     */
    public int factorial(int n) {
        // TODO: Implement recursive factorial.
        return 0; // placeholder return
    }

    /**
     * Sorts an array of integers using the recursive merge sort algorithm.
     * @param array the array of integers to sort
     * @return a sorted array of integers
     * 
     * TODO: Implement this method using recursion. (25 points)
     * - Base case: if array length is 1 or less, return the array.
     * - Recursive case: 
     *   1. Split the array into two halves, left and right.
     *   2. Recursively sort each half.
     *   3. Merge the sorted halves into a single sorted array.
     * 
     * Use only one method for sorting and merging. Avoid helper methods.
     */
    public int[] mergeSort(int[] array) {
        // TODO: Implement recursive merge sort.
        return null; // placeholder return
    }

    /**
     * Solves the Tower of Hanoi problem and returns a list of moves.
     * @param n the number of disks
     * @param fromPeg the starting peg
     * @param toPeg the destination peg
     * @param auxPeg the auxiliary peg
     * @return a list of strings representing each move
     * 
     * TODO: Implement this method using recursion. (25 points)
     * - Base case: if n == 0, return an empty list; if n == 1, move the disk from `fromPeg` to `toPeg`.
     * - Recursive case:
     *   1. Move n-1 disks from `fromPeg` to `auxPeg`.
     *   2. Move the nth disk from `fromPeg` to `toPeg`.
     *   3. Move n-1 disks from `auxPeg` to `toPeg`.
     * - Each move should be represented as "Move disk X from [fromPeg] to [toPeg]".
     */
    public List<String> towerOfHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
        // TODO: Implement recursive Tower of Hanoi.
        return new ArrayList<>(); // placeholder return
    }

    /**
     * Calculates base raised to the power of exponent using recursion.
     * @param base the base integer
     * @param exponent the exponent integer
     * @return the result of base raised to the power of exponent
     * 
     * TODO: Implement this method using recursion. (20 points)
     * - Base case: if exponent is 0, return 1.
     * - Recursive case: return base * power(base, exponent - 1).
     * - Note: Assume negative exponents are not handled.
     */
    public int power(int base, int exponent) {
        // TODO: Implement recursive power calculation.
        return 0; // placeholder return
    }
}
