/*
Test driver code for testing the various operations that can be performed on a singly linked list.
*/

public class Test {
    public static void main(String[] args) {

        Operations operation = new Operations();

        SinglyLinkedList listA = new SinglyLinkedList();
        SinglyLinkedList listB = new SinglyLinkedList();

        listA = operation.insertLast(listA, 1);
        listA = operation.insertLast(listA, 2);
        listA = operation.insertLast(listA, 5);
        listA = operation.insertPosition(listA, 3, 3);
        listA = operation.insertPosition(listA, 4, 4);
        listA = operation.insertPosition(listA, 6, 100);
        operation.display(listA);
        listA = operation.deleteLast(listA);
        operation.display(listA);
        listA = operation.deletePosition(listA, 100);

        // listB = operation.insertLast(listB, 10);
        // listB = operation.insertLast(listB, 11);

        operation.display(listA);
        operation.searchElement(listA, 2);
        operation.updateElement(listA, 1, 0);
        operation.updateElement(listA, 2, 1);
        operation.updateElement(listA, 5, 10);
        operation.display(listA);
    }
}