package _0509_.middle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Middle1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("날짜를 yyyy-MM-dd 형식으로 입력하세요: ");
        String inputDate = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {

            Date date = sdf.parse(inputDate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            calendar.add(Calendar.DATE, 3);

            Date resultDate = calendar.getTime();

            String resultDateString = sdf.format(resultDate);
            System.out.println("3일 뒤 날짜: " + resultDateString);

        } catch (ParseException e) {

            e.printStackTrace();

        } finally {
            sc.close();
        }
    }
}
