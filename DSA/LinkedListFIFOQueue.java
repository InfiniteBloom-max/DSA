public class LinkedListFIFOQueue {
    private Node front;
    private Node rear;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedListFIFOQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Enqueue operation - O(1)
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Dequeue operation - O(1)
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int data = front.data;
        front = front.next;
        if (front == null) { // Queue becomes empty
            rear = null;
        }
        size--;
        return data;
    }

    // Peek at front element - O(1)
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }

    // Check if queue is empty - O(1)
    public boolean isEmpty() {
        return front == null;
    }

    // Get size of queue - O(1)
    public int size() {
        return size;
    }

    // Display queue contents - O(n)
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue: []");
            return;
        }

        System.out.print("Queue (front to rear): [");
        Node current = front;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }

    // Search for an element in the queue - O(n)
    public int search(int data) {
        Node current = front;
        int position = 0;
        while (current != null) {
            if (current.data == data) {
                return position; // Return position from front (0-indexed)
            }
            current = current.next;
            position++;
        }
        return -1; // Element not found
    }

    // Main method for testing
    public static void main(String[] args) {
        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();

        // Test enqueue operations
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Should print: [10, 20, 30]

        System.out.println("Front element: " + queue.peek()); // Should print: 10
        System.out.println("Queue size: " + queue.size()); // Should print: 3

        // Test dequeue operations
        System.out.println("Dequeued: " + queue.dequeue()); // Should print: 10
        System.out.println("Dequeued: " + queue.dequeue()); // Should print: 20
        queue.display(); // Should print: [30]

        // Test search
        System.out.println("Position of 30: " + queue.search(30)); // Should print: 0
        System.out.println("Position of 10: " + queue.search(10)); // Should print: -1

        // Test empty queue
        queue.dequeue(); // Remove last element
        System.out.println("Is empty: " + queue.isEmpty()); // Should print: true
    }
}// 
