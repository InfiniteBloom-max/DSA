public class DoublyLinkedList {
    private Node head;
    private Node tail;
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

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add at the beginning - O(1)
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Add at the end - O(1)
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
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
            current = tail;
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
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return data;
    }

    // Remove last element - O(1)
    public int removeLast() {
        if (tail == null) {
            throw new RuntimeException("List is empty");
        }
        
        int data = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return data;
    }

    // Remove by value - O(n)
    public boolean removeByValue(int data) {
        if (head == null) {
            return false;
        }
        
        // Check head
        if (head.data == data) {
            removeFirst();
            return true;
        }
        
        // Check tail
        if (tail.data == data) {
            removeLast();
            return true;
        }
        
        // Search in middle
        Node current = head.next;
        while (current != null && current != tail) {
            if (current.data == data) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
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
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.data;
    }

    // Find index of element - O(n)
    public int indexOf(int data) {
        Node current = head;
        int index = 0;
        while (current != null) {
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
        Node current = head;
        System.out.print("Forward: [");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }

    // Display the list from tail to head
    public void displayBackward() {
        Node current = tail;
        System.out.print("Backward: [");
        while (current != null) {
            System.out.print(current.data);
            if (current.prev != null) {
                System.out.print(", ");
            }
            current = current.prev;
        }
        System.out.println("]");
    }
}