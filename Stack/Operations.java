/*
The various operations that can be performed on a stack are :
1. isEmpty : Checks whether the stack is empty or not.
2. Push : Adds an element to the top of the stack.
3. Pop : Deletes an element from the top of the stack.
4. Peek : Reveals the element at the top of the stack.
 */

public class Operations {

    public boolean isEmpty(Stack stack) {
        if (stack.top < 0) {
            return true;
        }
        return false;
    }

    public Stack push(Stack stack, int data) {
        if (stack.top > stack.MAX) {
            System.out.println("Stack Overflow. Limit exceeded. Cannot push anymore elements.");
        } else {
            stack.stack[++stack.top] = data;
            System.out.println("The element added is "+stack.stack[stack.top]);
        }
        return stack;
    }

    public Stack pop(Stack stack) {
        if (stack.top < 0) {
            System.out.println("Stack Empty. Cannot delete an element");
        } else {
            int element = stack.stack[stack.top--];
            System.out.println("Element deleted is "+element);
        }
        return stack;
    }

    public int peek(Stack stack) {
        if (stack.top < 0) {
            System.out.println("Stack is empty. Please push a few elements.");
            return 0;
        } else {
            return stack.stack[stack.top];
        }
    }

}