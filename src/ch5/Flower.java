package ch5;

public class Flower {
    int petalCount = 0;
    static String s = "initial value";

    Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
    }

    Flower(String ss){
        System.out.println("Constructor w/ String arg only, s = " + ss);
    }

    Flower(String s, int petals){
        this(petals);
//        this(s);
        this.s = s;
        System.out.println("String & int args");
    }

    Flower(){
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount(){
//        this(11);
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Class ca = null;
        try {
            ca = Class.forName("ch5.Flower");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class cb;
        cb = Flower.class;

        Flower x = new Flower("abcdefg",5);

        Class cc = x.getClass();

        System.out.println(ca==cb);
        System.out.println(cb==cc);
        System.out.println(ca==cc);

        System.out.println();
        System.out.println("ca = " + ca);
        System.out.println("cb = " + cc);
        System.out.println("cc = " + cc);

        System.out.println("interface = " + cc.getInterfaces());
        System.out.println("typeName = " + cc.getTypeName());

        System.out.println("x = " + x);
        Class a = x.getClass();
        Class c = Flower.class;
        try {
            Flower w = (Flower) c.newInstance();
            System.out.println("w = " + w);
            System.out.println("w.s = " + w.s);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Flower z;
        try {
            z = (Flower)a.newInstance();
            System.out.println("z = " + z);
            System.out.println("z.s = " + z.s);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            Class b = Class.forName("ch5.Flower");
            Object y = ((Flower)b.newInstance()).petalCount;
            System.out.println("b = " + b);
            System.out.println("y = " + y);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        System.out.println(a);

        x.printPetalCount();
    }
}
