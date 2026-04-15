import java.util.*;
class Subset{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        subsets("",s,0);
        System.out.println();
        List<String> list = new ArrayList<>();
        subsets("",s,0,list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    public static void subsets(String ans, String s, int idx){
        if(idx == s.length()){
            System.out.print(ans+" ");
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch,s,idx+1);
        subsets(ans,s,idx+1);
    }
    public static void subsets(String ans, String s, int idx, List<String> list){
        if(idx == s.length()){
            if(ans.length() != 0){
                list.add(ans);
            }
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch,s,idx+1,list);
        subsets(ans,s,idx+1,list);
    }
}