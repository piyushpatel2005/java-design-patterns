package factory;

import java.util.Calendar;
import java.util.TimeZone;

public class FactorySimpleDemo {
    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("EST"));
        System.out.println(cal);

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
