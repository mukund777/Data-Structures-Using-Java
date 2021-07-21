/*
Test driver code for testing the various operations that can be performed on a stack.
 */

public class Test {
    public static void main(String[] args) {

        Operations operation = new Operations();
        Stack stackA = new Stack();

        System.out.println(operation.isEmpty(stackA));
        stackA = operation.push(stackA, 10);
        stackA = operation.push(stackA, 20);
        stackA = operation.push(stackA, 30);
        stackA = operation.pop(stackA);
        System.out.println(operation.isEmpty(stackA));
        System.out.println("The top element in the stack is "+operation.peek(stackA));
    }
}