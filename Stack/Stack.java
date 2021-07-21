/*
A stack is a data structure that follows the Last In First Out (LIFO) scheme.
The stack class has the following characteristics :
1. MAX : Defining the maximum size of the stack.
2. Top : An integer that contains the size of the stack. Acts as a pointer that points to the top of the stack.
3. Stack[] : The array where the elements are added and various operations are performed upon.
 */

public class Stack {
    static final int MAX = 1000;
    int top;
    int stack[] = new int[MAX];

    Stack() {
        this.top = -1;
    }
}