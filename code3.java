
import java.awt.dnd.DragGestureEvent;

class Animal{
    void sound(){
    System.out.println("animals makes sound");
 }
 }
 class Cat extends Animal{
    void eat(){
        System.out.println("cats eat");
    }
 }
 class Dog extends Mammal{
    void walk(){
        System.out.println("Dog walk");
    }
 }
 class code3{
    public static void main(String[] args) {
        Cat ca=new Cat();
        Dog dg=new Dog();
        ca.eat();
        dg.walk();
    }
 }