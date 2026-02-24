class Employee{
    String name;
    int salary;
    static String company = "google";

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(name + " " + salary + " " + company);
    }
}

public class p2{
    public static void main(String[] args){
        Employee e1 = new Employee("Madhav", 150000);
        Employee e2 = new Employee("Mohak", 150000);
        e1.display();
        e2.display();
    }
}