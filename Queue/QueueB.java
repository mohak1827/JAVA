// package Queue;
import java.util.*;
public class QueueB {
    // static class Queue {
    //     static int arr[];
    //     static int size;
    //     static int rear;
    //     static int front; //circular

    //     Queue(int n) {
    //         arr = new int[n];
    //         size = n;
    //         rear = -1;
    //         front = -1; //circular
    //     }

    //     public static boolean isEmpty(){
    //         // return rear == -1;
    //         return rear == -1 && front == -1; //circular
    //     }

    //     public static boolean isFull() { //circular
    //         return (rear + 1) % size == front;
    //     }

    //     //add
    //     public static void add(int data){
    //         if(isFull()) {
    //             System.out.println("queue is full");
    //             return;
    //         }
    //         //add 1st element (circular)
    //         if(front == -1) {
    //             front = 0;
    //         }
    //         // rear = rear + 1;
    //         rear = (rear + 1) % size;
    //         arr[rear] = data;
    //     }

    //     //remove
    //     public static int remove() {
    //         if(isEmpty()) {
    //             System.out.println("empty");
    //             return -1;
    //         }

    //         // int front = arr[0];
    //         // for(int i = 0;i < rear;i++){
    //         //     arr[i] = arr[i+1];
    //         // }

    //         int result = arr[front]; //circular
    //         // rear = rear - 1;

    //         //last el delete (circular)
    //         if(rear == front) {
    //             rear = front = -1;
    //         }else{
    //             front = (front + 1) % size; //circular
    //         }
    //         // return front;
    //         return result; //circular
    //     }

    //     //peek 
    //     public static int peek() {
    //         if(isEmpty()) {
    //             System.out.println("empty");
    //             return -1;
    //         }

    //         // return arr[0];
    //         return arr[front]; //circular
    //     }
    // }



    //queue using ll
    // static class Node {
    //     int data;
    //     Node next;

    //     Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // static class Queue {
    //     static Node head = null;
    //     static Node tail = null;

    //     public static boolean isEmpty() {
    //         return head == null && tail == null;
    //     }

    //     //add
    //     public static void add(int data){
    //         Node newNode = new Node(data);
    //         if(head == null){
    //             head = tail = newNode;
    //             return;
    //         }

    //         tail.next = newNode;
    //         tail = newNode;
    //     }

    //     //remove
    //     public static int remove() {
    //         if(isEmpty()) {
    //             System.out.println("empty");
    //             return -1;
    //         }

    //         int front = head.data;
    //         //single element
    //         if(tail == head) {
    //             tail = head = null;
    //         }else{
    //             head = head.next;
    //         }
    //         return front;
    //     }

    //     //peek
    //     public static int peek() {
    //         if(isEmpty()){
    //             System.out.println("empty");
    //             return -1;
    //         }

    //         return head.data;
    //     }
        
    // }

    //queue using 2 stacks

    // static class Queue {
    //     static Stack<Integer> s1 = new Stack<>();
    //     static Stack<Integer> s2 = new Stack<>();

    //     public static boolean isEmpty() {
    //         return s1.isEmpty();
    //     }

    //     //add (0(n))
    //     public static void add(int data) {
    //         while(!s1.isEmpty()) {
    //             s2.push(s1.pop());
    //         }

    //         s1.push(data);

    //         while(!s2.isEmpty()) {
    //             s1.push(s2.pop());
    //         }
    //     }

    //     //remove
    //     public static int remove() {
    //         if(isEmpty()){
    //             System.out.println("queue empty");
    //             return -1;
    //         }

    //         return s1.pop();
    //     }

    //     //peek
    //     public static int peek() {
    //         if(isEmpty()) {
    //             System.out.println("queue empty");
    //             return -1;
    //         }

    //         return s1.peek();
    //     }
    // }

    //stack using 2 queues
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        //push
        public static void push(int data) {
            if(!q1.isEmpty()) {
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        //pop
        public static int pop() {
            if(isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }

            int top = -1;

            //case 1
            if(!q1.isEmpty()) {
                while(!q1.isEmpty()) {
                    top = q1.remove();
                    if(q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()) {
                    top = q2.remove();
                    if(q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }

            int top = -1;

            //case 1
            if(!q1.isEmpty()) {
                while(!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String args[]) {
        // Queue q = new Queue();
        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // System.out.println(q.remove());
        // q.add(4);
        // // q.add(6);
        // System.out.println(q.remove());
        // q.add(5);

        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}   
