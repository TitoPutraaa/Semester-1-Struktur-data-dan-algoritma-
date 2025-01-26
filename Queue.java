import java.util.Arrays;

public class Queue {
    static int front = -1;
    static int rear = -1;
    static int capasity = 3;
    static int[] queue = new int[capasity];
    public static void main(String[] args) {
        enQueue(1);
        enQueue(2);
        enQueue(3);
        enQueue(4);
        deQueue();
        deQueue();
        deQueue();
        deQueue();
        enQueue(5);
        deQueue();
    }

    static boolean isFull() {
        return front == (rear+1) % capasity;
    }

    static boolean isEmpty() {
        return front == -1;
    }

    static void enQueue(int value) {
        if (isFull()) {
            System.out.println("this queue is full");
        } else {
            if(isEmpty()) {
                front = 0;
            }
            rear = (rear+1) % capasity;
            queue[rear] = value;
            // System.out.println("enQueue : " + value + " to index : " + front);
            System.out.println(Arrays.toString(queue));
        }
    }

    static void deQueue() {
        if (isEmpty()) {
            System.out.println("this queue is empty");
        } else {
            if ((front+1)%capasity == rear) {
                rear = -1;
                front = -1;
            }
            front = (front+1) % capasity;
            queue[front] = 0;
            // System.out.println("deQueue in index : " + front);
            System.out.println(Arrays.toString(queue));

        }
    }
}
