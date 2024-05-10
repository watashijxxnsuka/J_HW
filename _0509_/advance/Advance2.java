package _0509_.advance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Advance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 날짜를 입력하세요 (yyyy-MM-dd 형식):");
        String startDateString = sc.nextLine();

        System.out.println("두 번째 날짜를 입력하세요 (yyyy-MM-dd 형식):");
        String endDateString = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {

            Date startDate = dateFormat.parse(startDateString);
            Date endDate = dateFormat.parse(endDateString);


            Calendar startCalendar = Calendar.getInstance();
            startCalendar.setTime(startDate);

            Calendar endCalendar = Calendar.getInstance();
            endCalendar.setTime(endDate);


            List<Date> dateList = new ArrayList<>();


            // startCalendar를 endDate와 비교하여 endDate와 같거나 작을 때까지 반복
            while (!startCalendar.after(endCalendar)) {

                // dateList에 날짜 추가
                dateList.add(startCalendar.getTime());
                startCalendar.add(Calendar.DATE, 1);
            }


            System.out.println("두 날짜 사이의 날짜:");
            for (Date date : dateList) {
                System.out.println(dateFormat.format(date));
            }

        } catch (ParseException e) {
            System.out.println("잘못된 날짜 형식입니다. yyyy-MM-dd 형식으로 입력하세요.");
            e.printStackTrace();

        } finally {

            sc.close();
        }
    }
}
