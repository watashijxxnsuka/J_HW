package _0509_.middle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MiddleTest {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.print("날짜를 yyyy-MM-dd 형식으로 입력하세요: ");
        String inputDate = sc.nextLine();

        SimpleDateFormat sbf = new SimpleDateFormat("yyyy-MM-dd");



        Date date = sbf.parse(inputDate);


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.add(Calendar.DATE, 3);

        Date resultDate = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(resultDate));

    }
}
