class Vehicle{
    void start(){
        System.out.println("vehicle is starting");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Vehicle is a car");
    }
}

public class p5{
    public static void main(String[] args){
        Vehicle c1 = new Vehicle();
        c1.start();
        Vehicle c2 = new Car(); //both constructor will be called, vehicle is reference type and car is object type
        c2.start();
        Car c3 = new Car();
        c3.start();
        // Car c4 = new Vehicle(); invalid
    }
}