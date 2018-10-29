package ch7;

class SmallBrain{}

final class Dinosaur{
    int i = 7;
    int j = 1;

    SmallBrain x = new SmallBrain();
    void f() {}
}

//class Further extends Dinosaur{}

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.j = 40;
        n.j++;
    }
}
