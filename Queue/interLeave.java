import java.util.*;
public class interLeave {

    public static void interLeaveQueue(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();

        int size = q.size();

        for(int i = 0;i < size/2;i++) {
            firstHalf.offer(q.poll());
        }

        while(!firstHalf.isEmpty()){
            q.offer(firstHalf.poll());
            q.offer(q.poll());
        }
    }
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        q.offer(7);
        q.offer(8);
        q.offer(9);
        q.offer(10);

        interLeaveQueue(q);

        while(!q.isEmpty()) {
            System.out.print(q.poll()+" ");
        }

        System.out.println();
    }
}
