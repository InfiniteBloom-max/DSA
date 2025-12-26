// Commit 2 - LinkedListStack
public class LinkedListStack {
    private Node top;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedListStack() {
        this.top = null;
        this.size = 0;
    }

    // Push operation - O(1)
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop operation - O(1)
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Peek operation - O(1)
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Check if stack is empty - O(1)
    public boolean isEmpty() {
        return top == null;
    }

    // Get size of stack - O(1)
    public int size() {
        return size;
    }

    // Display stack contents - O(n)
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack: []");
            return;
        }

        System.out.print("Stack (top to bottom): [");
        Node current = top;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }

    // Search for an element in the stack - O(n)
    public int search(int data) {
        Node current = top;
        int position = 0;
        while (current != null) {
            if (current.data == data) {
                return position; // Return position from top (0-indexed)
            }
            current = current.next;
            position++;
        }
        return -1; // Element not found
    }

    // Main method for testing
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        // Test push operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Should print: [30, 20, 10]

        System.out.println("Top element: " + stack.peek()); // Should print: 30
        System.out.println("Stack size: " + stack.size()); // Should print: 3

        // Test pop operations
        System.out.println("Popped: " + stack.pop()); // Should print: 30
        System.out.println("Popped: " + stack.pop()); // Should print: 20
        stack.display(); // Should print: [10]

        // Test search
        System.out.println("Position of 10: " + stack.search(10)); // Should print: 0
        System.out.println("Position of 30: " + stack.search(30)); // Should print: -1

        // Test empty stack
        stack.pop(); // Remove last element
        System.out.println("Is empty: " + stack.isEmpty()); // Should print: true
    }
}