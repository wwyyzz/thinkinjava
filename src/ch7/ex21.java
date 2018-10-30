package ch7;

class Animal {
    public void run(int i){
        System.out.println("animal run" + i);
        }

    public void run(String s){
        System.out.println("animal run" + s);
    }

    final public void jump(){
        System.out.println("animal jump");
    }
}

class Dog extends Animal{
    @Override
    public void run(int i) {
        System.out.println("dog run" + i);
    }

    @Override
    public void run(String s) {
        System.out.println("dog jump" + s);
    }

    //    public void jump(){
//        System.out.println("dog jump");
//    }
}

public class ex21 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.run(5);
        a.run("high");
        a.jump();

        Dog d = new Dog();
        d.run(10);
        d.run("low");
        d.jump();

    }
}
