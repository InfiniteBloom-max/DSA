import java.util.Stack;

public class QueueStackPopFriendly {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public QueueStackPopFriendly() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // Push is O(n)
    public void enqueue(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Pop is O(1)
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
