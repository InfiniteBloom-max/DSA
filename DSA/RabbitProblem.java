/**
 * Rabbit Problem Implementation
 * 
 * The Rabbit Problem is a classic mathematical problem similar to the Fibonacci sequence,
 * where we calculate the number of rabbit pairs after n months given specific breeding rules.
 * 
 * Rules:
 * - Start with 1 pair of newborn rabbits (male and female)
 * - Rabbits take 1 month to mature
 * - After maturing, each pair produces 1 new pair every month
 * - Rabbits never die
 * 
 * This problem follows the Fibonacci sequence: 1, 1, 2, 3, 5, 8, 13, ...
 */
public class RabbitProblem {
    
    /**
     * Calculate the number of rabbit pairs after n months using recursion
     * Time Complexity: O(2^n) - Exponential
     * Space Complexity: O(n) - Due to recursion stack
     */
    public static long calculateRabbitsRecursive(int months) {
        if (months <= 0) {
            return 0;
        }
        if (months == 1 || months == 2) {
            return 1;
        }
        return calculateRabbitsRecursive(months - 1) + calculateRabbitsRecursive(months - 2);
    }
    
    /**
     * Calculate the number of rabbit pairs after n months using dynamic programming (memoization)
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static long calculateRabbitsMemoization(int months) {
        if (months <= 0) {
            return 0;
        }
        if (months == 1 || months == 2) {
            return 1;
        }
        
        long[] memo = new long[months + 1];
        memo[1] = 1;
        memo[2] = 1;
        
        return calculateRabbitsMemoizationHelper(months, memo);
    }
    
    private static long calculateRabbitsMemoizationHelper(int months, long[] memo) {
        if (memo[months] != 0) {
            return memo[months];
        }
        
        memo[months] = calculateRabbitsMemoizationHelper(months - 1, memo) + 
                      calculateRabbitsMemoizationHelper(months - 2, memo);
        return memo[months];
    }
    
    /**
     * Calculate the number of rabbit pairs after n months using iterative approach
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static long calculateRabbitsIterative(int months) {
        if (months <= 0) {
            return 0;
        }
        if (months == 1 || months == 2) {
            return 1;
        }
        
        long prev2 = 1; // rabbits[months-2]
        long prev1 = 1; // rabbits[months-1]
        long current = 0;
        
        for (int i = 3; i <= months; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }
    
    /**
     * Calculate the number of rabbit pairs after n months and return the sequence
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static long[] getRabbitSequence(int months) {
        if (months <= 0) {
            return new long[0];
        }
        
        long[] sequence = new long[months];
        
        for (int i = 0; i < months; i++) {
            if (i == 0 || i == 1) {
                sequence[i] = 1;
            } else {
                sequence[i] = sequence[i-1] + sequence[i-2];
            }
        }
        
        return sequence;
    }
    
    /**
     * Print the rabbit sequence up to n months
     */
    public static void printRabbitSequence(int months) {
        if (months <= 0) {
            System.out.println("Number of months must be positive");
            return;
        }
        
        System.out.println("Rabbit pairs after each month:");
        long[] sequence = getRabbitSequence(months);
        
        for (int i = 0; i < sequence.length; i++) {
            System.out.println("Month " + (i + 1) + ": " + sequence[i] + " pairs");
        }
    }
    
    /**
     * Main method to test the Rabbit Problem implementations
     */
    public static void main(String[] args) {
        int months = 10;
        
        System.out.println("=== Rabbit Problem Solutions ===");
        System.out.println("Calculating rabbit pairs after " + months + " months:\n");
        
        // Test iterative approach (most efficient)
        long resultIterative = calculateRabbitsIterative(months);
        System.out.println("Iterative approach: " + resultIterative + " pairs");
        
        // Test memoization approach
        long resultMemoization = calculateRabbitsMemoization(months);
        System.out.println("Memoization approach: " + resultMemoization + " pairs");
        
        // Only test recursive for small values due to exponential time complexity
        if (months <= 35) {
            long resultRecursive = calculateRabbitsRecursive(months);
            System.out.println("Recursive approach: " + resultRecursive + " pairs");
        } else {
            System.out.println("Recursive approach skipped (would take too long for n > 35)");
        }
        
        System.out.println("\nFull sequence:");
        printRabbitSequence(months);
        
        // Performance comparison for different approaches
        System.out.println("\n=== Performance Comparison ===");
        int testMonths = 30;
        
        // Test iterative
        long startTime = System.nanoTime();
        long resultIter = calculateRabbitsIterative(testMonths);
        long endTime = System.nanoTime();
        System.out.println("Iterative (" + testMonths + " months): " + resultIter + 
                          " in " + (endTime - startTime) / 1000000.0 + " ms");
        
        // Test memoization
        startTime = System.nanoTime();
        long resultMemo = calculateRabbitsMemoization(testMonths);
        endTime = System.nanoTime();
        System.out.println("Memoization (" + testMonths + " months): " + resultMemo + 
                          " in " + (endTime - startTime) / 1000000.0 + " ms");
        
        // Test recursive (smaller value to avoid long wait)
        int smallTest = 30;
        startTime = System.nanoTime();
        long resultRec = calculateRabbitsRecursive(smallTest);
        endTime = System.nanoTime();
        System.out.println("Recursive (" + smallTest + " months): " + resultRec + 
                          " in " + (endTime - startTime) / 1000000.0 + " ms");
    }
}// 
