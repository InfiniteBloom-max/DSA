public class CircularDoublyLinkedList {
    private Node head;
    private int size;

    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public CircularDoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add at the beginning - O(1)
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev; // Current tail
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode; // New node becomes head
        }
        size++;
    }

    // Add at the end - O(1)
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev; // Current tail
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
        }
        size++;
    }

    // Add at specific index - O(n)
    public void add(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        
        if (index == 0) {
            addFirst(data);
            return;
        }
        
        if (index == size) {
            addLast(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node current;
        
        // Optimize by choosing direction (from head or tail)
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = head.prev; // Start from tail
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        
        newNode.next = current;
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;
    }

    // Remove first element - O(1)
    public int removeFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        
        int data = head.data;
        if (size == 1) {
            head = null;
        } else {
            Node tail = head.prev;
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        size--;
        return data;
    }

    // Remove last element - O(1)
    public int removeLast() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        
        Node tail = head.prev;
        int data = tail.data;
        if (size == 1) {
            head = null;
        } else {
            Node newTail = tail.prev;
            newTail.next = head;
            head.prev = newTail;
        }
        size--;
        return data;
    }

    // Remove by value - O(n)
    public boolean removeByValue(int data) {
        if (head == null) {
            return false;
        }
        
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.data == data) {
                if (size == 1) {
                    head = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    if (current == head) {
                        head = current.next; // Update head if removing head
                    }
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Get element at index - O(n)
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        
        Node current;
        // Optimize by choosing direction (from head or tail)
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = head.prev; // Start from tail
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.data;
    }

    // Find index of element - O(n)
    public int indexOf(int data) {
        if (head == null) {
            return -1;
        }
        
        Node current = head;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (current.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // Not found
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    // Display the list from head to tail
    public void displayForward() {
        if (head == null) {
            System.out.println("Forward: []");
            return;
        }
        
        Node current = head;
        System.out.print("Forward: [");
        for (int i = 0; i < size; i++) {
            System.out.print(current.data);
            if (i < size - 1) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }

    // Display the list from tail to head
    public void displayBackward() {
        if (head == null) {
            System.out.println("Backward: []");
            return;
        }
        
        Node current = head.prev; // Start from tail
        System.out.print("Backward: [");
        for (int i = 0; i < size; i++) {
            System.out.print(current.data);
            if (i < size - 1) {
                System.out.print(", ");
            }
            current = current.prev;
        }
        System.out.println("]");
    }
}// 
