class animal {
    animal() {
        System.out.println("Hello");
    }

    void run() {
        System.out.println("Animal is running");
    }
}

class dog extends animal {
    dog() {
        super();
    }
    void run(){
        super.run();
        System.out.println("dog running");
    }

    void sound() {
        System.out.println("hi");
    }
}

 class code6 {
    public static void main(String[] args) {
        dog dg = new dog();
        dg.sound();
        dg.run();
    }
}
