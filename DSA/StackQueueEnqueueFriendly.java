import java.util.LinkedList;
import java.util.Queue;

public class StackQueueEnqueueFriendly {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackQueueEnqueueFriendly() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push is O(1) - (Enqueue friendly)
    public void push(int x) {
        q1.add(x);
    }

    // Pop is O(n)
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Move n-1 elements from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int poppedValue = q1.remove();

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int peekValue = q1.peek();
        q2.add(q1.remove());

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return peekValue;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
