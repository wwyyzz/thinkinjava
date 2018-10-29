package ch7;

class Animal {
    public void run(){
        System.out.println("animal run");
        }

    final public void jump(){
        System.out.println("animal jump");
    }
}

class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("dog run");
    }

//    public void jump(){
//        System.out.println("dog jump");
//    }
}

public class ex21 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.run();
        a.jump();

        Dog d = new Dog();
        d.run();
        d.jump();

    }
}
