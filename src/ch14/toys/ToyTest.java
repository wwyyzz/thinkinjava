package ch14.toys;

interface HasBatteries{}
interface Waterproff{}
interface Shoots {}

class Toy{
//    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproff, Shoots{
    FancyToy() {super(1);}
}

public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("Class name: " + cc.getName() +
        " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("ch14.toys.FancyToy");
        }catch (ClassNotFoundException e ){
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face:c.getInterfaces()
             ) {
            System.out.println(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        }catch (InstantiationException e){
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
