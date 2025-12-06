import java.util.*;

public class queueReversal {

    public static void reversal(Queue<Integer> q) {

        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()) {
            s.push(q.poll());
        }

        while(!s.empty()) {
            q.offer(s.pop());
        }
        
    }
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        reversal(q);

        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }

        System.out.println();
    }
}
