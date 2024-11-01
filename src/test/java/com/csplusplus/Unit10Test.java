package com.csplusplus;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class Unit10Test {

    private final Unit10 unit10 = new Unit10();

    @Test
    public void testSummation() {
        assertEquals(10, unit10.summation(4));
        assertEquals(15, unit10.summation(5));
        assertEquals(21, unit10.summation(6));
        
        // Edge cases
        assertEquals(0, unit10.summation(0)); // base case check
        assertEquals(1, unit10.summation(1)); // smallest positive case
    }

    @Test
    public void testFactorial() {
        assertEquals(1, unit10.factorial(0)); // base case for 0
        assertEquals(1, unit10.factorial(1)); // base case for 1
        assertEquals(120, unit10.factorial(5));
        assertEquals(5040, unit10.factorial(7));

        // Edge case for negative numbers
        assertEquals(1, unit10.factorial(-5)); // expect 1 for negative input
    }

    @Test
    public void testMergeSort() {
        int[] array1 = {38, 27, 43, 3, 9, 82, 10};
        int[] sortedArray1 = {3, 9, 10, 27, 38, 43, 82};
        int[] result1 = unit10.mergeSort(array1);
        assertArrayEquals(sortedArray1, result1);

        int[] array2 = {12, 11, 13, 5, 6, 7};
        int[] sortedArray2 = {5, 6, 7, 11, 12, 13};
        int[] result2 = unit10.mergeSort(array2);
        assertArrayEquals(sortedArray2, result2);

        // Edge cases
        int[] emptyArray = {};
        int[] sortedEmptyArray = {};
        assertArrayEquals(sortedEmptyArray, unit10.mergeSort(emptyArray));

        int[] singleElementArray = {42};
        int[] sortedSingleElementArray = {42};
        assertArrayEquals(sortedSingleElementArray, unit10.mergeSort(singleElementArray));
    }

    @Test
    public void testTowerOfHanoi() {
        List<String> movesFor1Disk = unit10.towerOfHanoi(1, 'A', 'C', 'B');
        assertEquals(1, movesFor1Disk.size());
        assertEquals("Move disk 1 from A to C", movesFor1Disk.get(0));

        List<String> movesFor2Disks = unit10.towerOfHanoi(2, 'A', 'C', 'B');
        assertEquals(3, movesFor2Disks.size());
        assertEquals("Move disk 1 from A to B", movesFor2Disks.get(0));
        assertEquals("Move disk 2 from A to C", movesFor2Disks.get(1));
        assertEquals("Move disk 1 from B to C", movesFor2Disks.get(2));

        List<String> movesFor3Disks = unit10.towerOfHanoi(3, 'A', 'C', 'B');
        assertEquals(7, movesFor3Disks.size());
        assertEquals("Move disk 1 from A to C", movesFor3Disks.get(0));
        assertEquals("Move disk 2 from A to B", movesFor3Disks.get(1));
        assertEquals("Move disk 3 from A to C", movesFor3Disks.get(3));

        // Edge case: 0 disks (should produce no moves)
        List<String> movesFor0Disks = unit10.towerOfHanoi(0, 'A', 'C', 'B');
        assertTrue(movesFor0Disks.isEmpty());
    }

    @Test
    public void testPower() {
        assertEquals(1, unit10.power(2, 0)); // base case
        assertEquals(2, unit10.power(2, 1));
        assertEquals(8, unit10.power(2, 3));
        assertEquals(27, unit10.power(3, 3));
        assertEquals(1024, unit10.power(2, 10));

        // Edge cases
        assertEquals(1, unit10.power(5, 0)); // any number to the power of 0 is 1
        assertEquals(0, unit10.power(0, 5)); // 0 raised to any positive power is 0
        assertThrows(StackOverflowError.class, () -> unit10.power(0, -1)); // negative exponent check
    }
}
