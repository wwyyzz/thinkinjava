package logging;

import java.sql.SQLOutput;
import java.util.logging.*;

public class logging {
//    private static final Logger logger =
//            Logger.getLogger(logging.class.getName());
//            Logger.getLogger("com.wj.web");

    private static final Logger logger  = Logger.getLogger("");
//    private static final Logger logger1 = Logger.getLogger("com");
//    private static final Logger logger2 = Logger.getLogger("com.jenkov");
//    private static final Logger logger3 = Logger.getLogger("com.jenkov.web");


    public static class MyFormatter extends Formatter{
        @Override
        public String format(LogRecord record) {
            return record.getLevel() + "::::" + record.getMessage();
        }
    }

    public void doIt(){
        logger.entering(getClass().getName(), "doIt");

        try {
            //
        }catch (Exception e){
            logger.log(Level.SEVERE, "error doing XYZ", e);
        }

        logger.exiting(getClass().getName(),"doIt");
    }
    public static void main(String[] args) {

        System.out.println("Loger name = " + logger.getName());

        MyFormatter formatter = new MyFormatter();
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(formatter);

        logger.removeHandler(new ConsoleHandler());
        logger.addHandler(handler);

        logger.setLevel(Level.INFO);

//        logger.addHandler(new ConsoleHandler());
//        logger1.addHandler(new ConsoleHandler());
//        logger2.addHandler(new ConsoleHandler());
//        logger3.addHandler(new ConsoleHandler());

//        logger.addHandler(new ConsoleHandler());
        System.out.println("LEVEL = " + logger.getLevel());
        System.out.println("Handles = " + logger.getHandlers());
        System.out.println("Filter = " + logger.getFilter());

        logging lg = new logging();
        lg.doIt();
        logger.log(Level.WARNING, "hello ");
        logger.entering(lg.getClass().getName(), "doIT");
        logger.warning("This is a warning!");
        logger.info("This is a info!");
        System.out.println("parent = " + logger.getParent());
        System.out.println("Resource Bundle name = " + logger.getResourceBundleName());
        System.out.println("Resource Bundle = " + logger.getResourceBundle());
        System.out.println("Parnet Handle = " + logger.getUseParentHandlers());
//        System.out.println(logger.);
    }

}
