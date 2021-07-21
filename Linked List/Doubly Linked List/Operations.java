public class Operations {

    public void display(DoublyLinkedList list) {
        if (list.head == null) {
            System.out.print("Empty list");
        } else {
            System.out.print("Forward pass : ");
            Node counter = list.head;
            System.out.print(counter.data + " ");
            while (counter.next != null) {
                counter = counter.next;
                System.out.print(counter.data + " ");
            }
            System.out.println("");
            System.out.print("Reverse pass : ");
            while (counter != null) {
                System.out.print(counter.data + " ");
                counter = counter.previous;
            }
            System.out.println("");
        }
    }

    public DoublyLinkedList insertLast(DoublyLinkedList list, int data) {
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node counter = list.head;
            while (counter.next != null) {
                counter = counter.next;
            }
            counter.next = newNode;
            newNode.previous = counter;
        }
        return list;
    }

    public DoublyLinkedList insertPosition(DoublyLinkedList list, int data, int position) {
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
                        counter.next.previous = newNode;
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
                newNode.previous = counter;
            }
        }
        return list;
    }

    public DoublyLinkedList deleteLast(DoublyLinkedList list) {
        if (list.head == null) {
            System.out.print("Empty list. Cannot delete element. ");
        } else {
            Node counter = list.head;
            while (counter.next.next != null) {
                counter = counter.next;
            }
            counter.next.previous = null;
            counter.next = null;
        }
        return list;
    }

    public DoublyLinkedList deletePosition(DoublyLinkedList list, int position) {
        if (list.head == null) {
            System.out.print("Empty list. Cannot delete element.");
        } else {
            Node counter = list.head;
            if (position == 1) {
                list.head.next = null;
                list.head = counter.next;
            } else if (sizeList(list) == position) {
                list = deleteLast(list);
            } else {
                int i = 1;
                while (counter.next.next != null) {
                    if (i + 1 == position) {
                        counter.next.previous = null;
                        counter.next.next.previous = counter;
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

    public static int sizeList(DoublyLinkedList list) {
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

    public void searchElement(DoublyLinkedList list, int element) {
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

    public DoublyLinkedList updateElement(DoublyLinkedList list, int position, int newValue) {
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