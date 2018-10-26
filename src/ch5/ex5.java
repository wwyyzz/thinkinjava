package ch5;

class Dog{
    void bark(){
        System.out.println("dog dog");
    }

    void bark(int i){
        System.out.println("barking" + i);
    }

    void bark(String s){
        System.out.println("howing" + s);
    }
}

public class ex5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.bark(5);
        dog1.bark("aloud");


    }
}
