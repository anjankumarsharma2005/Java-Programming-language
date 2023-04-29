public class OOPFF {
    public static void main(String args[]) {
        Dog dobby= new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
}
//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}
class Fish extends Animal{
    void swin(){
        System.out.println("swin");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}


