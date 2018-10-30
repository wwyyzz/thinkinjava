package ch8.shape;

class abc extends Shape{
    @Override
    public void draw() {
        System.out.println("abc.dras()");
    }

    @Override
    public void erase(){
        System.out.println("abc.erase()");
    }
}

public class Shapes {
    private static RandowShapeGenerator gen =
            new RandowShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }

        for (Shape shp:s) {
            shp.draw();
            shp.erase();
            shp.redraw();
        }
        Shape abc1 = new abc();
        abc1.draw();

    }
}
