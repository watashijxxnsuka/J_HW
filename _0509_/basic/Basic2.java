package _0509_.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Basic2 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");

        System.out.println(dateFormat1.format(calendar.getTime()));
        System.out.println(dateFormat2.format(calendar.getTime()));

    }
}
