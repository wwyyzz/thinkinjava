package ch8.shape;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.dras()");
    }

    @Override
    public void erase(){
        System.out.println("Triangle.erase()");
    }
}
