import java.util.Stack;

public class StackQueueDequeueFriendly {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public StackQueueDequeueFriendly() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // Enqueue is O(n)
    public void enqueue(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        
        // Push the new element to s1
        s1.push(x);
        
        // Move everything back from s2 to s1
        // This ensures s1 always has elements in queue order (front at top)
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Dequeue is O(1)
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return s1.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return s1.peek();
    }

    public boolean isEmpty() {
        return s1.isEmpty();
    }
}