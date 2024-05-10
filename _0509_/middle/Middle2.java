package _0509_.middle;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {

        String[] week = {"일", "월", "화", "수", "목", "금", "토"};

        Scanner sc = new Scanner(System.in);
        System.out.print("날짜를 입력하세요(yyyy-MM-dd): ");

        String inputData = sc.nextLine();

        // 입력한 날짜를 LocalDate 객체로 변환한다
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputData, dtf);

        // 입력한 날짜의 요일을 계산한다.
        DayOfWeek date_input = date.getDayOfWeek();
        int week_turn = date_input.getValue() % 7;

        String kDate = week[week_turn];
        System.out.println("입력한 날짜의 요일은 " + kDate + "요일입니다.");
    }
}
