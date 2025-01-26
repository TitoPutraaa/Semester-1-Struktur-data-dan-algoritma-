import java.util.Arrays;

public class Stack {
    static int top = -1;
    static int capasity = 5;
    static int[] stack = new int[capasity];

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
    }

    // checking method 
    static boolean isEmpty() {
        return top == -1;
    }

    static boolean isFull() {
        return top == capasity-1;
    }

    // operator method 
    static void push(int value) {
        if (isFull()) {
            System.out.println("this stack is full");   
        } else {
        stack[++top] = value;
        System.out.println(Arrays.toString(stack));
    }
    }

    static void pop() {
        if (isEmpty()) {
            System.out.println("this stack is empty");
        } else {
            stack[top--] = 0;
            System.out.println(Arrays.toString(stack));
        }
        
    }
}
