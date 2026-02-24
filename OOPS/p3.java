import java.util.*;
class Rectangle{
    int length;
    int breadth;
    Scanner sc = new Scanner(System.in);
    Rectangle(){
        System.out.println("rectangle whose length and breadth are not specified");
        this.length = sc.nextInt();
        this.breadth = sc.nextInt();
    }
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void area(){
        System.out.println(length*breadth);
    }
}

public class p3{
    public static void main(String[] args){
        Rectangle r2 = new Rectangle();
        Rectangle r1 = new Rectangle(4,3);
        r1.area();
        r2.area();
    }
}