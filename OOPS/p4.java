class Animal{
    Animal(){
        System.out.println("This is animal class");
    }
    void sound(){
        System.out.println("bhau bhau");
    }
    void eat(){
        System.out.println("animal eats animal food");
    }

}
class Dog extends Animal{

}
public class p4{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.sound();
        d1.eat();
    }
}