 class Animal{
    void sound(){
    System.out.println("animals makes sound");
 }
 }
 class Dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
 }
 class code1{
    public static void main(String[] args) {
        Dog dg=new Dog();
        dg.sound();
        dg.bark();
    }
 }