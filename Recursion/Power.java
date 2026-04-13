import java.util.*;
public class Power{
    public static int pow(int base, int exp){
        if(exp == 0){
            return 1;
        }
        return base*pow(base,exp-1);
    }
    public static int powLog(int base, int exp){
        if(exp == 0){
            return 1;
        }
        int cal = powLog(base, exp/2);
        if(exp %2 == 0){
            return cal*cal;
        }else{
            return cal*cal*base;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter exp : ");
        int exp = sc.nextInt();
        // int ans = pow(base,exp);
        int ans = powLog(base,exp);
        System.out.println(ans);
    }
}