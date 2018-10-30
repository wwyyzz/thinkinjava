package ch8.shape;

public class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Square.dras()");
    }

    @Override
    public void erase(){
        System.out.println("Square.erase()");
    }
}
