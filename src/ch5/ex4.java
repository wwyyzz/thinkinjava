package ch5;

class Bird2{
    Bird2(String s){
        System.out.println("default constructor " + s);
    }
}

public class ex4 {
    public static void main(String[] args) {
        Bird2 b = new Bird2("hello");
    }
}