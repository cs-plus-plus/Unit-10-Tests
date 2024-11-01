# Unit 10 - Recursion and JUnit Tests

This project is designed to help you understand key recursion concepts in Java, including:
- Using recursion to solve mathematical and sorting problems
- Writing recursive methods with base cases
- Understanding and utilizing the call stack

## Project Structure

- **Unit10.java**: This file contains several recursive methods that you need to implement. You will work on methods like `summation`, `factorial`, `mergeSort`, `towerOfHanoi`, and `power`, each of which must use recursion.
- **Unit10Test.java**: This file contains JUnit tests to verify your understanding of recursive principles. Once you've completed the tasks in `Unit10.java`, the tests will help you confirm that your implementations are correct.

## Getting Started

### Prerequisites

Make sure you have the following tools installed:
- **Java** (JDK 8 or later)
- **Maven** (for managing dependencies and running tests)

### Instructions

1. Open `Unit10.java` located in the `src/main/java/com/csplusplus` directory.
2. Implement each method using recursion as instructed by the comments.
3. Once you've completed the implementation, run the JUnit tests to verify your solutions.

### Test Coverage

The tests in `Unit10Test.java` cover the following topics:

1. **Summation (10 points)**:
   - Tests a recursive summation method, verifying that the method adds integers from `1` to `n` correctly, including edge cases.

2. **Factorial (20 points)**:
   - Checks the factorial method, ensuring that it handles `n!` correctly, including edge cases like `n = 0` and negative inputs.

3. **Merge Sort (25 points)**:
   - Verifies a recursive implementation of the merge sort algorithm, testing sorted arrays, single-element arrays, and empty arrays for correctness.

4. **Tower of Hanoi (25 points)**:
   - Tests a recursive solution to the Tower of Hanoi problem. Ensures that the moves generated for 1, 2, and 3 disks follow the correct sequence. 

5. **Power (20 points)**:
   - Checks the recursive power method, verifying `base^exponent` calculations, including handling of zero exponents and negative edge cases.

### Key Concepts

- **Recursion**: A method that calls itself to solve a problem by breaking it down into simpler, smaller instances.
- **Base Case**: The condition that stops the recursion, ensuring that the method does not call itself indefinitely.
- **Call Stack**: The stack that tracks active methods during execution, including local variables and return points, which is critical in understanding recursion.

### Point Breakdown

The tests in `Unit10Test.java` are worth a total of **100 points**:

| Method            | Points |
|-------------------|--------|
| Summation         | 10     |
| Factorial         | 20     |
| Merge Sort        | 25     |
| Tower of Hanoi    | 25     |
| Power             | 20     |
| **Total**         | **100** |

### Additional Resources

- [Oracle Java Documentation - Recursion](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/recursion.html)
- [Oracle Java Documentation - The Call Stack](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html)
- [JUnit Documentation](https://junit.org/junit5/docs/current/user-guide/)

---

## Support

If you encounter any issues or have questions about the assignment, please reach out during office hours or post in the course discussion forum.

For additional assistance, contact: **Kevin** at [kevin@csplusplus.com](mailto:kevin@csplusplus.com).
