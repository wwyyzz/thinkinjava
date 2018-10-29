package ch5;

public class ex21 {
    public static void main(String[] args) {
        for (Dollar d:Dollar.values()
             ) {
            System.out.print(d + "--");
            System.out.println(d.ordinal());
        }
    }
}
