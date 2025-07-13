

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1; 
    Stack<Integer> stack2; 

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
           
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
           
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

  
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

   
    public int size() {
        return stack1.size() + stack2.size();
    }


    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Front: " + queue.peek());       // 20

        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue()); // 20
        System.out.println("Dequeued: " + queue.dequeue()); // 30
        System.out.println("Dequeued: " + queue.dequeue()); // 40

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
