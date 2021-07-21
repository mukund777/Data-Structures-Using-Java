/*
Test driver code for testing the various operations that can be performed on a doubly linked list.
*/

public class Test {
    public static void main(String[] args) {

        Operations operation = new Operations();
        DoublyLinkedList listA = new DoublyLinkedList();

        listA = operation.insertLast(listA, 1);
        listA = operation.insertLast(listA, 2);
        listA = operation.insertLast(listA, 5);
        listA = operation.insertPosition(listA, 3, 3);
        listA = operation.insertPosition(listA, 4, 4);
        listA = operation.insertPosition(listA, 6, 100);
        operation.display(listA);
        listA = operation.deleteLast(listA);
        operation.display(listA);
        listA = operation.deletePosition(listA, 4);
        operation.display(listA);
        operation.searchElement(listA, 5);
        operation.updateElement(listA, 1, 0);
        operation.updateElement(listA, 2, 1);
        operation.updateElement(listA, 0, 10);
        operation.display(listA);
    }
}