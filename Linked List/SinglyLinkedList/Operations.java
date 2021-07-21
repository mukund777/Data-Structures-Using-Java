/*
Various operations that can be performed on a singly linked list include :
1. Displaying the list.
2. Insertion of elements (At the last position).
3. Insertion of elements at a specific position.
4. Deletion of elements (At last position).
5. Deletion of elements at a specific position.
6. Searching for an element in a linked list.
7. Updation of the data value at a specified position.

Note : Check for all edge cases
*/

public class Operations {

    // Printing the contents of a linked list.
    public void display(SinglyLinkedList list) {
        if (list.head == null) {
            System.out.print("Empty list");
        } else {
            Node counter = list.head;
            while (counter != null) {
                System.out.print(counter.data + " ");
                counter = counter.next;
            }
            System.out.println("");
            int size = sizeList(list);
            System.out.println("Length of the linked list is "+size);
        }
    }

    // Insertion of data at the end.
    public SinglyLinkedList insertLast(SinglyLinkedList list, int data) {
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node counter = list.head;
            while (counter.next != null) {
                counter = counter.next;
            }
            counter.next = newNode;
        }
        return list;
    }

    // Insertion of data at a specified position.
    public SinglyLinkedList insertPosition(SinglyLinkedList list, int data, int position) {
        if (position < 1) {
            System.out.println("Position doesn't exist. Please enter a value greater than 0. ");
        } else {
            Node newNode = new Node(data);
            if (list.head == null) {
                System.out.println("Linked list is empty. Inserting element in the first position.");
                list.head = newNode;
            } else {
                int i = 1;
                Node counter = list.head;
                while (counter.next != null) {
                    if (i+1 == position) {
                        break;
                    } else {
                        counter = counter.next;
                        i++;
                    }
                }
                if (i+1 != position) {
                    System.out.println("Position = "+position+". List is not long enough. Inserting at the last position.");
                }
                newNode.next = counter.next;
                counter.next = newNode;
            }
        }
        return list;
    }

    // Obtaining the size of a list.
    public static int sizeList(SinglyLinkedList list) {
        int i;
        if (list.head == null) {
            i = 0;
        } else {
            Node counter = list.head;
            i = 0;
            while (counter != null) {
                counter = counter.next;
                i++;
            }
        }
        return i;
    }

    // Deletion of the last element.
    public SinglyLinkedList deleteLast(SinglyLinkedList list) {
        if (list.head == null) {
            System.out.print("Empty list. Cannot delete element. ");
        } else {
            Node counter = list.head;
            while (counter.next.next != null) {
                counter = counter.next;
            }
            counter.next = null;
        }
        return list;
    }

    // Deletion of an element at a specified position.
    public SinglyLinkedList deletePosition(SinglyLinkedList list, int position) {
        if (list.head == null) {
            System.out.print("Empty list. Cannot delete element.");
        } else {
            Node counter = list.head;
            if (position == 1) {
                list.head.next = null;
                list.head = counter.next;
            } else {
                int i = 1;
                while (counter.next.next != null) {
                    if (i + 1 == position) {
                        counter.next = counter.next.next;
                        break;
                    } else {
                        counter = counter.next;
                        i++;
                    }
                }
                if (i + 1 != position) {
                    System.out.println("Position = " + position + ". List is not long enough. Element does not exist.");
                }
            }
        }
        return list;
    }

    // Searching for a specified element.
    public void searchElement(SinglyLinkedList list, int element) {
        if (list.head == null) {
            System.out.print("Empty list. Element does not exist.");
        } else {
            Node counter = list.head;
            int i = 0;
            boolean found = false;
            while (counter != null) {
                if (counter.data == element) {
                    found = true;

                    break;
                } else {
                    i++;
                    counter = counter.next;
                }
            }
            if (found) {
                System.out.println("Element found. Position = "+(i+1));
            } else {
                System.out.println("Element not found");
            }
        }
    }

    // Updation of an element at a specified position.
    public SinglyLinkedList updateElement(SinglyLinkedList list, int position, int newValue) {
        if (list.head == null) {
            System.out.print("Empty list. Cannot update element.");
        } else {
            if (position == 1) {
                list.head.data = newValue;
            } else if (sizeList(list) < position || position < 1) {
                System.out.println("Position does not exist.");
            } else {
                int i = 1;
                Node counter = list.head;
                while (counter != null) {
                    if (i + 1 == position) {
                        counter.next.data = newValue;
                        break;
                    } else {
                        counter = counter.next;
                        i++;
                    }
                }
            }
        }
        return list;
    }

}