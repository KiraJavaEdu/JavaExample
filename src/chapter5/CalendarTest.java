package chapter5;

import java.util.*;
import static java.util.Calendar.*;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(YEAR)+"."+c.get(MONTH)+"."+c.get(DATE));
        c.set(2003 , 10 , 23 , 12, 32, 23);//2003-11-23 12:32:23
        System.out.println(c.getTime());
        c.roll(MONTH , 7); //2003-06-23 12:32:23
        System.out.println(c.getTime());
        c.add(MONTH , 7); //2004-01-23 12:32:23
        System.out.println(c.getTime());
    }
}

