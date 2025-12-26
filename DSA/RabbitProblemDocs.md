# Rabbit Problem Documentation

## Overview
The Rabbit Problem is a classic mathematical problem similar to the Fibonacci sequence, where we calculate the number of rabbit pairs after n months given specific breeding rules. This implementation provides multiple approaches to solve the problem with different time and space complexities.

## Problem Statement
- Start with 1 pair of newborn rabbits (male and female)
- Rabbits take 1 month to mature
- After maturing, each pair produces 1 new pair every month
- Rabbits never die
- The sequence follows the Fibonacci pattern: 1, 1, 2, 3, 5, 8, 13, ...

## Features
- Multiple algorithmic approaches for solving the problem
- Performance comparison between different methods
- Sequence generation capability
- Time and space complexity analysis

## Class Structure

### Methods

#### `calculateRabbitsRecursive(int months)`
- Calculates the number of rabbit pairs using a recursive approach
- Time Complexity: O(2^n) - Exponential
- Space Complexity: O(n) - Due to recursion stack
- Best for understanding the problem conceptually but inefficient for large inputs

#### `calculateRabbitsMemoization(int months)`
- Calculates the number of rabbit pairs using dynamic programming with memoization
- Time Complexity: O(n)
- Space Complexity: O(n)
- More efficient than recursive approach while maintaining the recursive structure

#### `calculateRabbitsIterative(int months)`
- Calculates the number of rabbit pairs using an iterative approach
- Time Complexity: O(n)
- Space Complexity: O(1)
- Most efficient approach in terms of both time and space

#### `getRabbitSequence(int months)`
- Returns an array containing the complete sequence up to n months
- Time Complexity: O(n)
- Space Complexity: O(n)
- Useful for displaying the progression of rabbit pairs over time

#### `printRabbitSequence(int months)`
- Prints the complete sequence with month numbers
- Time Complexity: O(n)
- Space Complexity: O(n)
- For user-friendly output of the sequence

## Time Complexity Comparison
| Approach      | Time Complexity | Space Complexity | Use Case                    |
|---------------|-----------------|------------------|-----------------------------|
| Recursive     | O(2^n)          | O(n)             | Small inputs, educational   |
| Memoization   | O(n)            | O(n)             | Medium inputs, general use  |
| Iterative     | O(n)            | O(1)             | Large inputs, performance   |

## Advantages
- Multiple algorithmic approaches for educational purposes
- Clear time/space complexity trade-offs demonstrated
- Comprehensive testing and performance comparison
- Real-world problem modeling (population growth)

## Disadvantages
- Recursive approach is inefficient for large inputs
- Integer overflow possible for large month values (use BigInteger for larger values)

## Example Usage
```java
int months = 10;

// Using the most efficient iterative approach
long result = RabbitProblem.calculateRabbitsIterative(months);
System.out.println("Rabbits after " + months + " months: " + result);

// Getting the complete sequence
long[] sequence = RabbitProblem.getRabbitSequence(months);
System.out.println("Full sequence:");
for (int i = 0; i < sequence.length; i++) {
    System.out.println("Month " + (i+1) + ": " + sequence[i] + " pairs");
}

// Printing the sequence in a formatted way
RabbitProblem.printRabbitSequence(months);
```

## Mathematical Formula
The Rabbit Problem follows the Fibonacci sequence where:
- F(1) = 1
- F(2) = 1
- F(n) = F(n-1) + F(n-2) for n > 2

## Use Cases
- Educational purposes to demonstrate algorithmic complexity
- Population growth modeling
- Fibonacci sequence applications
- Algorithm performance comparison
- Dynamic programming learning examples 
