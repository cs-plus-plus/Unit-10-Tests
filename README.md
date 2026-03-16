# Unit 10: Recursion

AP Computer Science A

## Overview

This project covers **Unit 10: Recursion** concepts including recursive method design, base cases, recursive cases, and classic algorithms. Implement the 5 methods in `Unit10.java` using recursion (no loops!) and run the provided JUnit tests to verify your work.

## Getting Started

### Option 1: GitHub Codespaces (Recommended)

1. Click the green **Code** button on this repository
2. Select the **Codespaces** tab
3. Click **Create codespace on main**
4. Wait for the environment to build (~2 minutes the first time)
5. Start coding in `src/main/java/com/csplusplus/Unit10.java`

> **Note:** If the Java extension shows errors on first load, press `Cmd+Shift+P` (Mac) or `Ctrl+Shift+P` (Windows) and run **"Developer: Reload Window"**. This is a one-time setup step.

### Option 2: Local Development

1. Accept the assignment via the GitHub Classroom link
2. Clone the repository using GitHub Desktop
3. Open the project in your IDE
4. **Requirements:** Java 17+, Maven 3.x

## Running Tests

Run all tests:
```
mvn test
```

Run a single test:
```
mvn -Dtest=Unit10Test#testSummation test
```

## Scoring

| # | Method | Points | Concepts |
|---|--------|--------|----------|
| 1 | `summation(int n)` | 10 | Simple recursion |
| 2 | `factorial(int n)` | 20 | Recursion, multiplication |
| 3 | `mergeSort(int[])` | 25 | Divide and conquer |
| 4 | `towerOfHanoi(int, char, char, char)` | 25 | Problem decomposition |
| 5 | `power(int, int)` | 20 | Exponentiation |
| | **Total** | **100** | |

## Common Mistakes

- Missing or incorrect base case (causes StackOverflowError)
- Not making the problem smaller in the recursive case
- Using loops instead of recursion
- Confusing the order of operations in Tower of Hanoi
- Forgetting edge cases (n=0, empty arrays)

## Autograding

Your code is automatically graded when you push to GitHub. Check the **Actions** tab to see your score.

## Contact

For questions, contact [kevin@csplusplus.com](mailto:kevin@csplusplus.com)
