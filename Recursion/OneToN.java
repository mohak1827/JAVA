import java.util.*;
public class OneToN{
    // public static void oenToN(int n){
    //     if(n == 0){
    //         return;
    //     }
    //     oenToN(n-1);
    //     System.out.println(n);
    // }
    public static void oenToN(int m, int n){
        if(m == n+1){
            return;
        }
        System.out.println(m);
        oenToN(m+1,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        // oenToN(n);
        oenToN(1,n);
    }
}