import java.util.*;
class RecOnArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        recPrint(arr,0);
        int ele = 8;
        System.out.println(exists(arr,ele,0));
    }
    public static void recPrint(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        recPrint(arr,idx+1);
    }
    public static boolean exists(int[] arr, int ele, int idx){ //linear search
        if(idx == arr.length){
            return false;
        }
        if(arr[idx] == ele){
            return true;
        }
        return exists(arr,ele,idx+1);
    }
}