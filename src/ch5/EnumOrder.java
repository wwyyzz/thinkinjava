package ch5;

public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s:Spiciness.values()
             ) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
        System.out.println("hi");
    }
}
