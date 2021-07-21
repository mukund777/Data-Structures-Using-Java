/*
Test driver code for testing the various operations that can be performed on a queue.
 */

public class Test {
    public static void main(String[] args) {

        Operations operation = new Operations();
        Queue queueA = new Queue();

        queueA = operation.enQueue(queueA, 10);
        queueA = operation.enQueue(queueA, 20);
        queueA = operation.enQueue(queueA, 30);
        operation.display(queueA);
        System.out.println("Value at the top of the queue is " + operation.peak(queueA));
        queueA = operation.deQueue(queueA);
        System.out.println("Value at the top of the queue is " + operation.peak(queueA));
        queueA = operation.deQueue(queueA);
        queueA = operation.deQueue(queueA);
        operation.display(queueA);


        System.out.println(operation.isEmpty(queueA));
    }
}