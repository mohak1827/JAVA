import java.util.*;

public class nextGreaterElement {
    public static void main(String args[]) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int[] nextGreatest = new int[arr.length];

        for(int i = arr.length-1;i>=0;i--) {
            //1 while
            while(!s.empty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            //2 if-else
            if(s.empty()) {
                nextGreatest[i] = -1;
            } else{
                nextGreatest[i] = arr[s.peek()];
            }
            //3 push in s
            s.push(i);
        }

        for(int i = 0;i<arr.length;i++) {
            System.out.print(nextGreatest[i]+" ");
        }

        //next greater right
        //next greater left
        //next smaller right
        //next smaller left
    }
}
