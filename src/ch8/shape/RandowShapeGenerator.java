package ch8.shape;
import java.util.*;

public class RandowShapeGenerator {
    private Random rand = new Random(47);
    public Shape next(){
        int sel = rand.nextInt(3);
        System.out.println(sel);
        switch(sel){

            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
