/*
A queue is a data structure that follows the First In First Out (FIFO) scheme.
The queue class has the following characteristics :
1. MAX : Specifies the maximum size of the queue.
2. Front : Points to the front of the queue.
3. Rear : Points to the rear of the queue.
4. Queue[] : The array where the elements are added and various operations are performed.
 */

public class Queue {

    static final int MAX = 1000;
    int front;
    int rear;
    int queue[] = new int[MAX];

    Queue() {
        this.front = -1;
        this.rear = -1;
    }
}