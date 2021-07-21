/*
The various operations that can be performed on a queue include :
1. isEmpty : Checks whether the queue is empty or not.
2. display : Displays all the elements in the queue.
3. enqueue : Adds an element to the rear of the queue.
4. dequeue : Deletes element from the front of the queue.
5. peak : Shows the first element in the queue.
 */

public class Operations {

    // Checks whether the queue is empty or not.
    public boolean isEmpty(Queue queue) {
        if (queue.front >= queue.rear) {
            System.out.println("The queue is empty.");
            return true;
        } else {
            System.out.println("The queue is not empty.");
            return false;
        }
    }

    // Shows the content of the queue.
    public void display(Queue queue) {
        if (queue.front >= queue.rear) {
            System.out.println("The queue is empty.");
        } else {
            for (int i = queue.front; i <= queue.rear; i++) {
                System.out.print(queue.queue[i]+" ");
            }
            System.out.println("");
        }
    }

    // Adds an element to the rear of the queue.
    public Queue enQueue(Queue queue, int data) {
        if (queue.rear > queue.MAX) {
            System.out.println("Queue is full. Cannot add to queue");
        } else if (queue.rear == -1) {
            queue.queue[++queue.rear] = data;
            queue.front ++;
        } else {
            queue.queue[++queue.rear] = data;
        }
        return queue;
    }

    // Deletes an element from the fron of the queue.
    public Queue deQueue(Queue queue) {
        if (queue.rear < 0) {
            System.out.println("Queue is empty. Cannot delete element from the queue.");
        } else {
            int element = queue.queue[queue.front++];
            System.out.println("Element deleted is " + element);
        }
        return queue;
    }

    // Shows the first element of the queue.
    public int peak(Queue queue) {
        if (queue.front < 0) {
            System.out.println("The queue is empty. Please add elements to the queue.");
            return -1;
        } else {
            return queue.queue[queue.front];
        }
    }
}