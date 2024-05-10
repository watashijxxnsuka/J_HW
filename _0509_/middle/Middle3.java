package _0509_.middle;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Middle3 {
    public static void main(String[] args) {

        LocalDateTime date1 = LocalDateTime.parse("2023-03-15T20:31:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        LocalDateTime date2 = LocalDateTime.parse("2021-07-08T11:58:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        Duration difference = Duration.between(date2, date1);

        long hour = difference.toHours();
        long min = difference.toMinutes() % 60;
        long sec = difference.getSeconds() % 60;

        System.out.println(hour + "시간 " + min + "분 " + sec + "초 입니다.");


    }
}
