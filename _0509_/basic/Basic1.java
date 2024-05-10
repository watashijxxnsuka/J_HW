package _0509_.basic;

import java.util.Calendar;

public class Basic1 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, 3);
        calendar.set(Calendar.DATE, 8);

        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR, 5);
        calendar.add(Calendar.MONTH, 2);
        calendar.add(Calendar.DATE,3);

        System.out.println(calendar.getTime());


    }
}
