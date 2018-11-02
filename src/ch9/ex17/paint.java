package ch9.ex17;


import java.util.logging.Level;
import java.util.logging.Logger;

public class paint {
    static Logger logger = Logger.getLogger(paint.class.getName());

    public static void main(String[] args) {
        Shape s = new Circle();
        System.out.println(s.draw());
        System.out.println(s.redraw());
        System.out.println(s.erase());
//        System.out.println(s.toString());

        System.out.println(logger.getName());
        logger.setLevel(Level.INFO);
        logger.info("hello");
        logger.fine("fine");
    }
}
