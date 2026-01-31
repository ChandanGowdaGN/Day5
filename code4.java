class Animal{
    void Sound(){
        System.out.println("Hello");
    }
}
class Dog extends Animal{
    @Override
    void Sound(){
    System.out.println("hii");
}
}
class code4{
    public static void main(String[] args) {
        Dog dg=new Dog();
        dg.Sound();
    }
}