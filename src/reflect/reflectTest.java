package reflect;

public class reflectTest {
    public static void main(String[] args) {
        String office = "reflect.excel";
        try {
            Class c =Class.forName(office);
            try {
                OfficeAble oa = (OfficeAble) c.newInstance();
                oa.start();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
