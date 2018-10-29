package ch5;

public class ex22 {
    public static void main(String[] args) {
        Dollar d = Dollar.FIVE;
        switch (d){
            case ONE:
                System.out.println("1YUAN");
                break;
            case TWO:
                System.out.println("2YUAN");
                break;
            case FIVE:
                System.out.println("5YUAN");
                break;
            case TEN:
                System.out.println("10YUAN");
                break;
            case TWENTY:
                System.out.println("20YUAN");
                break;
            case FIFTY:
                System.out.println("50YUAN");
                break;
        }

    }
}
