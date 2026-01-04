package DSA;

/**
 * Hanoi Tower implementation using recursion.
 */
public class HanoiTower {

    /**
     * Solves the Tower of Hanoi puzzle.
     *
     * @param n           The number of disks.
     * @param source      The name of the source rod.
     * @param auxiliary   The name of the auxiliary rod.
     * @param destination The name of the destination rod.
     */
    public static void solveEx(int n, String source, String auxiliary, String destination) {
        if (n == 1) {
            System.out.println(source + " -> " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary using destination as buffer
        solveEx(n - 1, source, destination, auxiliary);

        // Move the nth disk from source to destination
        System.out.println(source + " -> " + destination);

        // Move n-1 disks from auxiliary to destination using source as buffer
        solveEx(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveEx(n, "A", "B", "C");
    }
}
