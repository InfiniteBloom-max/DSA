import java.util.Stack;

public class QueueStackPushFriendly {
    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;

    public QueueStackPushFriendly() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    // Push is O(1)
    public void enqueue(int x) {
        pushStack.push(x);
    }

    // Pop is Amortized O(1)
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
        return popStack.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
        return popStack.peek();
    }

    public boolean isEmpty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }
}
