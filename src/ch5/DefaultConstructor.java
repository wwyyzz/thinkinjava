package ch5;

class Bird{
    Bird(){
        System.out.println("default constructor");
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Bird b = new Bird();
    }
}
