/*
A doubly linked list node contains three parts :
1. Data : Part which holds the value.
2. Next : Part that points to the next node in the list.
3. Previous : Part that points to the previous node in the list.
 */

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