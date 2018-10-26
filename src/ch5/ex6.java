package ch5;

class Dog2{
    void bark(){
        System.out.println("dog dog");
    }

    void bark(int i, String str){
        System.out.println("barking " + i + str);
    }

    void bark(String s, int i){
        System.out.println("howing " + s + i);
    }
}

public class ex6 {
    public static void main(String[] args) {
        Dog2 dog1 = new Dog2();
        dog1.bark(5, " hello");
        dog1.bark("world ", 10);


    }
}

