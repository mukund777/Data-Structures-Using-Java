/*
A singly linked list node contains two parts :
1. Data : Part which holds the value.
2. Next : Part that points to the next node in the list.
 */


public class Node {
    int data;
    Node next;

    // Constructor whem data field is not provided.
    Node() {
        this.data = 0;
        this.next = null;
    }

    // Constructor when the data field is provided.
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}