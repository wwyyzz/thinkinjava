package ch7;

class finalTest{
    public static int COUNT = 16;
    private final String NAME = "wj";


    public String getNAME() {
        return NAME;
    }
}

public class ex19 {
    public static void main(String[] args) {
        int count = finalTest.COUNT;
        System.out.println(count++);
        System.out.println(count);
        finalTest ft1 = new finalTest();
        finalTest ft2 = new finalTest();

        System.out.println(ft1.getNAME());
        System.out.println(ft2.getNAME());
    }
}
