package com.csplusplus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.List;

public class Unit10Test {

    private final Unit10 unit10 = new Unit10();

    @Test
    @DisplayName("summation: Recursive sum from 1 to n (10 points)")
    public void testSummation() {
        assertAll("summation",
            () -> assertEquals(10, unit10.summation(4),
                "summation(4) should return 10 (1+2+3+4)"),
            () -> assertEquals(15, unit10.summation(5),
                "summation(5) should return 15"),
            () -> assertEquals(0, unit10.summation(0),
                "summation(0) should return 0 (base case)"),
            () -> assertEquals(1, unit10.summation(1),
                "summation(1) should return 1")
        );
    }

    @Test
    @DisplayName("factorial: Recursive n! calculation (20 points)")
    public void testFactorial() {
        assertAll("factorial",
            () -> assertEquals(1, unit10.factorial(0),
                "factorial(0) should return 1 (0! = 1)"),
            () -> assertEquals(1, unit10.factorial(1),
                "factorial(1) should return 1"),
            () -> assertEquals(120, unit10.factorial(5),
                "factorial(5) should return 120"),
            () -> assertEquals(5040, unit10.factorial(7),
                "factorial(7) should return 5040"),
            () -> assertEquals(1, unit10.factorial(-5),
                "factorial(-5) should return 1")
        );
    }

    @Test
    @DisplayName("mergeSort: Recursive merge sort algorithm (25 points)")
    public void testMergeSort() {
        assertAll("mergeSort",
            () -> assertArrayEquals(new int[]{3, 9, 10, 27, 38, 43, 82},
                unit10.mergeSort(new int[]{38, 27, 43, 3, 9, 82, 10}),
                "mergeSort should sort the array"),
            () -> assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13},
                unit10.mergeSort(new int[]{12, 11, 13, 5, 6, 7}),
                "mergeSort should sort correctly"),
            () -> assertArrayEquals(new int[]{},
                unit10.mergeSort(new int[]{}),
                "mergeSort({}) should return {} (base case)"),
            () -> assertArrayEquals(new int[]{42},
                unit10.mergeSort(new int[]{42}),
                "mergeSort({42}) should return {42} (base case)")
        );
    }

    @Test
    @DisplayName("towerOfHanoi: Recursive Tower of Hanoi solution (25 points)")
    public void testTowerOfHanoi() {
        assertAll("towerOfHanoi",
            () -> {
                List<String> moves1 = unit10.towerOfHanoi(1, 'A', 'C', 'B');
                assertEquals(1, moves1.size(), "1 disk = 1 move");
                assertEquals("Move disk 1 from A to C", moves1.get(0));
            },
            () -> {
                List<String> moves2 = unit10.towerOfHanoi(2, 'A', 'C', 'B');
                assertEquals(3, moves2.size(), "2 disks = 3 moves");
                assertEquals("Move disk 1 from A to B", moves2.get(0));
                assertEquals("Move disk 2 from A to C", moves2.get(1));
                assertEquals("Move disk 1 from B to C", moves2.get(2));
            },
            () -> {
                List<String> moves3 = unit10.towerOfHanoi(3, 'A', 'C', 'B');
                assertEquals(7, moves3.size(), "3 disks = 7 moves (2^n - 1)");
                assertEquals("Move disk 3 from A to C", moves3.get(3));
            },
            () -> assertTrue(unit10.towerOfHanoi(0, 'A', 'C', 'B').isEmpty(),
                "0 disks = empty list")
        );
    }

    @Test
    @DisplayName("power: Recursive exponentiation (20 points)")
    public void testPower() {
        assertAll("power",
            () -> assertEquals(1, unit10.power(2, 0),
                "power(2, 0) should return 1 (base case)"),
            () -> assertEquals(8, unit10.power(2, 3),
                "power(2, 3) should return 8"),
            () -> assertEquals(27, unit10.power(3, 3),
                "power(3, 3) should return 27"),
            () -> assertEquals(1024, unit10.power(2, 10),
                "power(2, 10) should return 1024"),
            () -> assertEquals(0, unit10.power(0, 5),
                "power(0, 5) should return 0")
        );
    }
}
