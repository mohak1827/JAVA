import java.util.*;
class Student{
    String name;
    int roll;

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    void display(){
        System.out.println(name + " " + roll);
    }
}
public class p1{
    public static void main(String args[]){
        Student s1 = new Student("Khushi1", 1354);
        Student s2 = new Student ("Khushi2", 1355);
        s1.display();
        s2.display();
    }
}