package pluralsight.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilitySimpleDemo {

    private static final Logger logger = Logger.getLogger(ChainOfResponsibilitySimpleDemo.class.getName());

    public static void main(String[] args) {

        // level to log at
        logger.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();

        // level to publish at
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.finest("Finest level of logging"); // won't appear
        logger.finer("Finer level of loggin");
        logger.fine("Fine level");
    }
}
