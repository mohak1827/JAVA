import java.util.*;

public class duplicateParenthisis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i = 0;i<str.length();i++) {
            char ch = str.charAt(i);

            //closing
            if(ch == ')') {
                int count = 0;
                while(s.pop() != '(') {
                    // s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; //duplicate exist
                } //else{
                //     s.pop(); //pop opening pair
                // }
            } else {
                s.push(ch); 
            }
        }
        return false;
    }

    public static void main(String args[]) {
        //valid string
        String str = "((a+b) + c)"; //false
        String str2 = "((a+b))"; //true
        System.out.println(isDuplicate(str2));
    }
}
