public class Node {
    int data;
    Node next;
    Node previous;

    Node() {
        this.data = 0;
        this.next = null;
        this.previous = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}